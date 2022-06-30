package com.mixchain.nft.db.dto;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Data
public class IssuenameDto {
    @JSONField(name = "suename")
    private String suename;
    @JSONField(name = "isv")
    private Integer isv;
    @JSONField(name = "detail")
    private String detail;
}