package com.mixchain.nft.db.mapper;

import com.mixchain.nft.db.dto.NftExternalDto;
import com.mixchain.nft.db.entity.NftShopCategory;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author Rouzzf
 * @since 2022-06-27
 */
public interface NftShopCategoryMapper extends BaseMapper<NftShopCategory> {

    @Select(" select `contract` from nft_shop_category where `id` = ${id}")
    String getContractById(@Param("id") Integer id);

    NftExternalDto getExternalByContract(@Param("contract") String contract);
}
