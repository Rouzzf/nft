package com.mixchain.nft.db.dto;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class AdsDto {

    @JSONField(name = "id")
    private Integer id;
    @JSONField(name = "title")
    private String title;
    @JSONField(name = "avatar")
    private String avatar;
    @JSONField(name = "urltype")
    private Integer urltype;
    @JSONField(name = "url")
    private String url;
    @JSONField(name = "adtype")
    private Integer adtype;
    @JSONField(name = "paramid")
    private Integer paramid;
    @JSONField(name = "nft")
    private NftDto nft;

}
