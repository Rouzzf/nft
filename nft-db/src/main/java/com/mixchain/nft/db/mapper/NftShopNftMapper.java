package com.mixchain.nft.db.mapper;

import com.mixchain.nft.db.dto.NftDto;
import com.mixchain.nft.db.entity.NftShopNft;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Rouzzf
 * @since 2022-06-27
 */
public interface NftShopNftMapper extends BaseMapper<NftShopNft> {

    NftDto getNft(@Param("goodsId") Integer goodsId);
}
