package com.mixchain.nft.api.aspect;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.toolkit.ArrayUtils;
import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Aspect
@Component
@Log4j2
public class OperationLogAspect {
    /**
     * 设置操作日志切入点 记录操作日志 在注解的位置切入代码
     */
    @Pointcut("@annotation(com.mixchain.nft.api.aspect.OperationLog)")
    public void operationLogPointCut() {
    }

    /**
     * 正常返回通知，拦截用户操作日志，连接点正常执行完成后执行， 如果连接点抛出异常，则不会执行
     *
     * @param joinPoint 切入点
     * @param keys      返回结果
     */
    @AfterReturning(value = "operationLogPointCut()", returning = "keys")
    public void saveOperLog(JoinPoint joinPoint, Object keys) {
        // 获取RequestAttributes
        RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
        // 从获取RequestAttributes中获取HttpServletRequest的信息
        HttpServletRequest request = (HttpServletRequest) requestAttributes
                .resolveReference(RequestAttributes.REFERENCE_REQUEST);
        JSONObject jsonObject = new JSONObject();
        try {
            // 从切面织入点处通过反射机制获取织入点处的方法
            MethodSignature signature = (MethodSignature) joinPoint.getSignature();
            // 获取切入点所在的方法
            Method method = signature.getMethod();
            // 获取操作
            OperationLog opLog = method.getAnnotation(OperationLog.class);
            if (opLog != null) {
                jsonObject.put("desc", opLog.value());// 操作描述
            }
            // 获取请求的类名
            String className = joinPoint.getTarget().getClass().getName();
            // 获取请求的方法名
            String methodName = method.getName();
            methodName = className + "." + methodName;
            jsonObject.put("method", methodName); // 请求方法
            // 请求的参数
            Object[] arguments = joinPoint.getArgs();
            //判断参数数组是否为空
            Stream<?> stream = ArrayUtils.isEmpty(arguments) ? Stream.empty() : Arrays.asList(arguments).stream();
            //过滤 joinPoint.getArgs()返回的数组中携带有Request或者Response对象
            List<Object> logArgs = stream
                    .filter(arg -> (!(arg instanceof HttpServletRequest) && !(arg instanceof HttpServletResponse)))
                    .collect(Collectors.toList());
            // 先将参数所在的list 转换成json 数组
            JSONArray jsonArray = JSONArray.parseArray(JSON.toJSONString(logArgs));
            //再转 json 字符串
            String params = jsonArray.toJSONString();
            jsonObject.put("params", params); // 请求参数
            jsonObject.put("response", JSON.toJSONString(keys)); // 返回结果
            jsonObject.put("time", System.currentTimeMillis()); // 创建时间
            jsonObject.put("ip", getIp()); // 请求IP
            jsonObject.put("url", request.getRequestURI()); // 请求URI
            log.info(jsonObject);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 异常返回通知，用于拦截异常日志信息 连接点抛出异常后执行
     *
     * @param joinPoint 切入点
     * @param e         异常信息
     */
    @AfterThrowing(pointcut = "operationLogPointCut()", throwing = "e")
    public void saveExceptionLog(JoinPoint joinPoint, Throwable e) {
        // 获取RequestAttributes
        RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
        // 从获取RequestAttributes中获取HttpServletRequest的信息
        HttpServletRequest request = (HttpServletRequest) requestAttributes
                .resolveReference(RequestAttributes.REFERENCE_REQUEST);
        JSONObject jsonObject = new JSONObject();
        try {
            // 从切面织入点处通过反射机制获取织入点处的方法
            MethodSignature signature = (MethodSignature) joinPoint.getSignature();
            // 获取切入点所在的方法
            Method method = signature.getMethod();
            OperationLog opLog = method.getAnnotation(OperationLog.class);
            if (opLog != null) {
                jsonObject.put("desc", opLog.value());// 操作描述
            }
            // 获取请求的类名
            String className = joinPoint.getTarget().getClass().getName();
            // 获取请求的方法名
            String methodName = method.getName();
            methodName = className + "." + methodName;
            jsonObject.put("method",methodName);
            // 请求的参数
            Object[] arguments = joinPoint.getArgs();
            //判断参数数组是否为空
            Stream<?> stream = ArrayUtils.isEmpty(arguments) ? Stream.empty() : Arrays.asList(arguments).stream();
            //过滤 joinPoint.getArgs()返回的数组中携带有Request或者Response对象
            List<Object> logArgs = stream
                    .filter(arg -> (!(arg instanceof HttpServletRequest) && !(arg instanceof HttpServletResponse)))
                    .collect(Collectors.toList());
            // 先将参数所在的list 转换成json 数组
            JSONArray jsonArray = JSONArray.parseArray(JSON.toJSONString(logArgs));
            //再转 json 字符串
            String params = jsonArray.toJSONString();
            jsonObject.put("params", params); // 请求参数
            jsonObject.put("exName", e.getClass().getName()); // 异常名称
            jsonObject.put("exMsg", stackTraceToString(e.getClass().getName(), e.getMessage(), e.getStackTrace())); // 异常信息
            jsonObject.put("time", System.currentTimeMillis()); // 创建时间
            jsonObject.put("ip", getIp()); // 请求IP
            jsonObject.put("url", request.getRequestURI()); // 请求URI
            log.error(jsonObject);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /**
     * 获取ip
     *
     * @return
     */
    public String getIp() {
        //获得本机的ip和名称
        InetAddress addr;
        try {
            addr = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            throw new RuntimeException("获取ip异常", e);
        }
        return addr.getHostAddress();
    }

    /**
     * 转换异常信息为字符串
     *
     * @param exceptionName    异常名称
     * @param exceptionMessage 异常信息
     * @param elements         堆栈信息
     */
    public String stackTraceToString(String exceptionName, String exceptionMessage, StackTraceElement[] elements) {
        StringBuffer sb = new StringBuffer();
        for (StackTraceElement stet : elements) {
            sb.append(stet + "\n");
        }
        String message = exceptionName + ":" + exceptionMessage + "\n\t" + sb.toString();
        return message;
    }
}

