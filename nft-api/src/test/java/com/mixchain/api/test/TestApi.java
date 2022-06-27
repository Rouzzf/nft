package com.mixchain.api.test;

import com.mixchain.nft.api.NftApiApplication;
import com.mixchain.nft.db.entity.NftAdmin;
import com.mixchain.nft.db.service.NftAdminService;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest(classes = NftApiApplication.class, webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class TestApi {

    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private NftAdminService nftAdminService;

    @Test
    public void testRedis() {
        redisTemplate.opsForValue().set("test", "test");
    }
    @Test
    public void testMysql() {
        for (NftAdmin nftAdmin : nftAdminService.list()) {
            System.out.println(nftAdmin);
        }
    }
}
