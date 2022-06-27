package com.mixchain.nft.db.mapper;

import com.mixchain.nft.db.dto.SalelistDto;
import com.mixchain.nft.db.entity.NftShopSale;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Rouzzf
 * @since 2022-06-27
 */
public interface NftShopSaleMapper extends BaseMapper<NftShopSale> {

    List<SalelistDto> getSaleList();
}
