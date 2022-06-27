package com.mixchain.nft.db.mapper;

import com.mixchain.nft.db.dto.NftListDto;
import com.mixchain.nft.db.entity.NftTradeNft;
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
public interface NftTradeNftMapper extends BaseMapper<NftTradeNft> {

    List<NftListDto> nftList(@Param("per") Integer per,@Param("pageSize") Integer pageSize,@Param("contract") String contract,@Param("sort") Integer sort,@Param("order") Integer order);
}
