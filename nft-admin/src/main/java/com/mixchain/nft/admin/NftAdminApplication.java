package com.mixchain.nft.admin;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NftAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(NftAdminApplication.class, args);
    }
}
