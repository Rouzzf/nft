package com.mixchain.nft.db.dto;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
public class NftDetailDto {

    @JSONField(name = "id")
    private Integer id;
    @JSONField(name = "type")
    private Integer type;
    @JSONField(name = "goodsno")
    private Integer goodsno;
    @JSONField(name = "avatar")
    private String avatar;
    @JSONField(name = "title")
    private String title;
    @JSONField(name = "unitprice")
    private String unitprice;
    @JSONField(name = "contract")
    private String contract;
    @JSONField(name = "chain")
    private String chain;
    @JSONField(name = "detail")
    private String detail;
    @JSONField(name = "story")
    private String story;
    @JSONField(name = "status")
    private Integer status;
    @JSONField(name = "createtime")
    private String createtime;
    @JSONField(name = "hashval")
    private Object hashval;
    @JSONField(name = "suename")
    private String suename;
    @JSONField(name = "isv")
    private Integer isv;
    @JSONField(name = "ishot")
    private Integer ishot;
    @JSONField(name = "salenum")
    private Integer salenum;
    @JSONField(name = "issuename")
    private IssuenameDto issuename;
    @JSONField(name = "historylist")
    private List<?> historylist;
    @JSONField(name = "iscollect")
    private Integer iscollect;
    @JSONField(name = "ownuser")
    private Object ownuser;


}
