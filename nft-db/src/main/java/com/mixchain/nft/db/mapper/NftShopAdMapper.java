package com.mixchain.nft.db.mapper;

import com.mixchain.nft.db.dto.AdsDto;
import com.mixchain.nft.db.dto.NftDto;
import com.mixchain.nft.db.entity.NftShopAd;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Rouzzf
 * @since 2022-06-27
 */
public interface NftShopAdMapper extends BaseMapper<NftShopAd> {

    /**
     * 轮播图
     */
    List<AdsDto> getAds();

}
