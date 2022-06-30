package com.mixchain.nft.api.config;

import com.mixchain.nft.core.common.ResponseEntity;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ConstraintViolationException;

/**
 * 全局异常处理
 */
@RestControllerAdvice
@Log4j2
public class ExceptionControllerAdvice {

    /**
     * 参数校验异常
     *
     * @param e
     * @return
     */
    @ExceptionHandler
    public ResponseEntity exceptionHandler(ConstraintViolationException e) {
        return ResponseEntity.error(e.getMessage());
    }

    /**
     * 异常日志
     * @param e
     * @return
     */
    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public Object exceptionHandler(Exception e) {
        // 获取异常信息，记录日志
        StackTraceElement stackTraceElement = e.getStackTrace()[0];
        String className = stackTraceElement.getClassName();
        String fileName = stackTraceElement.getFileName();
        int lineNumber = stackTraceElement.getLineNumber();
        String methodName = stackTraceElement.getMethodName();
        log.error("类名:{},文件名:{},行数:{},办法名:{}", className, fileName, lineNumber, methodName);
        return ResponseEntity.error(e.getMessage());
    }
}