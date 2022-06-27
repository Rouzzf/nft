package com.mixchain.nft.db.dto;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 文章列表
 */
@NoArgsConstructor
@Data
public class ArticleDto {

    @JSONField(name = "id")
    private Integer id;
    @JSONField(name = "title")
    private String title;
    @JSONField(name = "createtime")
    private String createtime;
}
