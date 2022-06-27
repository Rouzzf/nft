package com.mixchain.nft.db.generator;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.converts.MySqlTypeConvert;
import com.baomidou.mybatisplus.generator.config.querys.MySqlQuery;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.engine.VelocityTemplateEngine;
import com.baomidou.mybatisplus.generator.keywords.MySqlKeyWordsHandler;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Generator {

    public static void main(String[] args) {
        String finalProjectPath = "/Users/liziheng/IdeaProjects/nft/nft-db";


        FastAutoGenerator.create("jdbc:mysql://127.0.0.1:3306/nft?allowPublicKeyRetrieval=true&serverTimezone=UTC&useUnicode=true&characterEncoding=utf-8&allowMultiQueries=true&useSSL=false", "root", "lzh8648179")
                .globalConfig(builder -> {
                    builder.author("abc") // 设置作者
                            .enableSwagger() // 开启 swagger 模式
                            .fileOverride() // 覆盖已生成文件
                            .disableOpenDir() //禁止打开输出目录
                            .outputDir(finalProjectPath + "/src/main/java"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.mixchain.nft") // 设置父包名
                            .moduleName("db") // 设置父包模块名
                            .entity("entity") //设置entity包名
//                            .other("other") // 设置dto包名
                            .service("service") //设置服务层
                            .serviceImpl("service.impl") //设置实现层
                            .mapper("mapper") //设置mapper层
                            .xml("mapper.xml") //设置xml层
                            .controller("controller") //设置controller层
                            .other("other") //其他层设置
                            .pathInfo(Collections.singletonMap(OutputFile.xml, finalProjectPath + "/src/main/resources/mapper")); // 设置mapperXml生成路径
                })
                .strategyConfig(config -> {
                    config.serviceBuilder()
//                            .superServiceClass(BaseService.class)
//                            .superServiceImplClass(BaseServiceImpl.class)
                            .formatServiceFileName("%sService")
                            .formatServiceImplFileName("%sServiceImpl");
                })

                .execute();


    }
}
