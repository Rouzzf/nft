package com.mixchain.nft.api;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = {"com.mixchain.nft.db","com.mixchain.nft.core"})
public class NftApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(NftApiApplication.class, args);
    }
}
