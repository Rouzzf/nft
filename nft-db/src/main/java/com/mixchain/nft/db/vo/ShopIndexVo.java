package com.mixchain.nft.db.vo;

import com.alibaba.fastjson.annotation.JSONField;
import com.mixchain.nft.db.dto.AdsDto;
import com.mixchain.nft.db.dto.SalelistDto;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
public class ShopIndexVo {

    @JSONField(name = "ads")
    private List<AdsDto> ads;
    @JSONField(name = "salelist")
    private List<SalelistDto> salelist;


}
