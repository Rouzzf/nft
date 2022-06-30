package com.mixchain.nft.api.controller;

import com.mixchain.nft.api.aspect.OperationLog;
import com.mixchain.nft.core.common.ResponseEntity;
import com.mixchain.nft.core.constant.NftConstant;
import com.mixchain.nft.db.service.NftArticleService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
@RequestMapping("/index")
public class IndexController {

    @Autowired
    private NftArticleService nftArticleService;

    /**
     * 文章列表
     *
     * @param page     分页
     * @param pageSize 显示条数
     * @param type     类型 1(公告)，2(文章)，3(关于我们)，4(协议)
     * @param langid   语言 1中文 2英文
     * @return
     */
    @GetMapping("/articlelist")
    @OperationLog("文章列表")
    public ResponseEntity articleList(@RequestParam(required = false, value = "page") Integer page, @RequestParam(required = false, value = "pageSize") Integer pageSize,
                                      @RequestParam(required = false, value = "type") Integer type, @RequestParam(value = "langid") Integer langid) {
        try {
            page = (page != null) && page > 0 ? page : 1;
            pageSize = (pageSize != null) && pageSize > 0 ? pageSize : 10;
            Integer per = (page - 1) * pageSize;
            return ResponseEntity.ok(nftArticleService.articleList(per, pageSize, type, langid));
        } catch (Exception e) {
            log.error("文章列表 接口请求异常:{}", e);
            return ResponseEntity.error(403, "请求失败", "");
        }
    }
}
