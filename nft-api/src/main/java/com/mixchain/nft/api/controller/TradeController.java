package com.mixchain.nft.api.controller;

import com.mixchain.nft.api.aspect.OperationLog;
import com.mixchain.nft.core.common.ResponseEntity;
import com.mixchain.nft.core.constant.NftConstant;
import com.mixchain.nft.db.service.NftTradeNftService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;

@Log4j2
@RestController
@Validated
@RequestMapping("/trade")
public class TradeController {

    @Autowired
    private NftTradeNftService nftTradeNftService;

    /**
     * 非同质化专区
     *
     * @param page     分页
     * @param pageSize 显示条数
     * @param cateid   系列ID
     * @param sort     排序字段 unitprice,salenum
     * @param order    排序 asc,desc
     */
    @OperationLog("非同质化专区")
    @PostMapping("nftlist")
    public ResponseEntity nftList(@RequestParam(required = false, value = "page") Integer page, @RequestParam(required = false, value = "pageSize") Integer pageSize,
                                  @RequestParam(required = false, value = "cateid") Integer cateid, @RequestParam(required = false, value = "sort") String sort, @RequestParam(required = false, value = "order") String order) {
        try {
            page = (page != null) && page > 0 ? page : 1;
            pageSize = (pageSize != null) && pageSize > 0 ? pageSize : 10;
            Integer per = (page - 1) * pageSize;

            int sortParam = 1;
            int orderParam = 1;
            if (sort != null && sort.equals("salenum")) {
                sortParam = 2;
            }
            if (order != null && order.equals("desc")) {
                orderParam = 2;
            }
            return ResponseEntity.ok(nftTradeNftService.nftList(per, pageSize, cateid, sortParam, orderParam));
        } catch (Exception e) {
            log.error("非同质化专区 接口请求异常:{}", e);
            return ResponseEntity.error(403, "请求失败", "");
        }
    }

    @PostMapping("detail")
    @OperationLog("详情")
    public ResponseEntity detail(@NotNull(message = "id不可为空") @RequestParam(required = false) Integer id) {
        try {
            return ResponseEntity.ok("");
        } catch (Exception e) {
            log.error("nft详情 接口请求异常:{}", e);
            return ResponseEntity.error(403, "请求失败", "");
        }
    }
}
