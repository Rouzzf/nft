package com.mixchain.nft.api.controller;

import com.mixchain.nft.core.common.ResponseEntity;
import com.mixchain.nft.core.constant.NftConstant;
import com.mixchain.nft.db.service.NftShopAdService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * NFT接口
 */
@Log4j2
@RestController
@RequestMapping("/shop")
public class ShopController {


    @Autowired
    private NftShopAdService nftShopAdService;


    /**
     * 首页数据
     */
    @GetMapping("index")
    public ResponseEntity index() {
        try {
            return ResponseEntity.ok(NftConstant.successMsg, nftShopAdService.index());
        } catch (Exception e) {
            log.error("首页数据 接口请求异常:{}", e);
            return ResponseEntity.error(403, "请求失败", "");
        }
    }
}
