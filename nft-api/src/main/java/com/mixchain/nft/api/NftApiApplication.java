package com.mixchain.nft.api;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@SpringBootApplication(scanBasePackages = {"com.mixchain.nft"})
public class NftApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(NftApiApplication.class, args);
    }

    @GetMapping()
    public String index() {
        return "nft api";
    }
}
