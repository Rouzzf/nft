package com.mixchain.nft.db.dto;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class NftExternalDto {
    @JSONField(name = "name")
    private String name;
    @JSONField(name = "isv")
    private Integer isv;
}
