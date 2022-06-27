package com.mixchain.nft.db.dto;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class SalelistDto {
    @JSONField(name = "id")
    private Integer id;
    @JSONField(name = "saleno")
    private String saleno;
    @JSONField(name = "snonum")
    private Integer snonum;
    @JSONField(name = "saleprice")
    private String saleprice;
    @JSONField(name = "joinnum")
    private Integer joinnum;
    @JSONField(name = "viewnum")
    private Integer viewnum;
    @JSONField(name = "starttime")
    private Integer starttime;
    @JSONField(name = "status")
    private Integer status;
    @JSONField(name = "avatar")
    private String avatar;
    @JSONField(name = "title")
    private String title;
}