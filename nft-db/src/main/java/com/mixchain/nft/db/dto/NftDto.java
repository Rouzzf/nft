package com.mixchain.nft.db.dto;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class NftDto {
    @JSONField(name = "id")
    private Integer id;
    @JSONField(name = "title")
    private String title;
    @JSONField(name = "unitprice")
    private String unitprice;
    @JSONField(name = "avatar")
    private String avatar;
    @JSONField(name = "castnum")
    private Integer castnum;
    @JSONField(name = "finishnum")
    private Integer finishnum;
    @JSONField(name = "keepnum")
    private Integer keepnum;
    @JSONField(name = "status")
    private Integer status;
    @JSONField(name = "maxnum")
    private Integer maxnum;
    @JSONField(name = "starttime")
    private Integer starttime;
    @JSONField(name = "endtime")
    private Integer endtime;
    @JSONField(name = "label")
    private String label;
    @JSONField(name = "issuename")
    private String issuename;
    @JSONField(name = "isv")
    private Integer isv;
}