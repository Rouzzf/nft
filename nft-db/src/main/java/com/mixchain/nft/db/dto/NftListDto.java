package com.mixchain.nft.db.dto;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 非同质化专区
 */
@NoArgsConstructor
@Data
public class NftListDto {

    @JSONField(name = "id")
    private Integer id;
    @JSONField(name = "unitprice")
    private String unitprice;
    @JSONField(name = "avatar")
    private String avatar;
    @JSONField(name = "title")
    private String title;
    @JSONField(name = "goodsno")
    private Integer goodsno;
    @JSONField(name = "type")
    private Integer type;
    @JSONField(name = "suename")
    private String suename;
    @JSONField(name = "isv")
    private Integer isv;
    @JSONField(name = "contract")
    private String contract;
}
