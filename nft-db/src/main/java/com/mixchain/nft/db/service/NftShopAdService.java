package com.mixchain.nft.db.service;

import com.mixchain.nft.db.entity.NftShopAd;
import com.baomidou.mybatisplus.extension.service.IService;
import com.mixchain.nft.db.vo.ShopIndexVo;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author Rouzzf
 * @since 2022-06-27
 */
public interface NftShopAdService extends IService<NftShopAd> {

    /**
     * 首页
     */
    ShopIndexVo index();
}
