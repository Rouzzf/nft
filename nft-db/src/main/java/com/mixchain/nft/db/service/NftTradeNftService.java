package com.mixchain.nft.db.service;

import com.mixchain.nft.db.dto.NftListDto;
import com.mixchain.nft.db.entity.NftTradeNft;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author Rouzzf
 * @since 2022-06-27
 */
public interface NftTradeNftService extends IService<NftTradeNft> {

    List<NftListDto> nftList(Integer per, Integer pageSize, Integer cateid, Integer sort, Integer order);
}
