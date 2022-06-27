package com.mixchain.nft.db.service.impl;

import com.mixchain.nft.db.dto.AdsDto;
import com.mixchain.nft.db.dto.NftDto;
import com.mixchain.nft.db.dto.SalelistDto;
import com.mixchain.nft.db.entity.NftShopAd;
import com.mixchain.nft.db.mapper.NftShopAdMapper;
import com.mixchain.nft.db.mapper.NftShopNftMapper;
import com.mixchain.nft.db.mapper.NftShopSaleMapper;
import com.mixchain.nft.db.service.NftShopAdService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mixchain.nft.db.vo.ShopIndexVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author Rouzzf
 * @since 2022-06-27
 */
@Service
public class NftShopAdServiceImpl extends ServiceImpl<NftShopAdMapper, NftShopAd> implements NftShopAdService {

    @Value("${cdn.url}")
    private String cdnUrl;

    @Autowired
    private NftShopNftMapper nftShopNftMapper;
    @Autowired
    private NftShopSaleMapper nftShopSaleMapper;

    @Override
    public ShopIndexVo index() {
        long startTime = System.currentTimeMillis() / 1000;
        long endTIme = startTime + 24 * 60 * 60 - 1;
        ShopIndexVo shopIndexVo = new ShopIndexVo();
        List<AdsDto> ads = baseMapper.getAds();
        ads.forEach(ad -> {
            // 首发
            if (ad.getAdtype() == 1) {
                if (ad.getParamid() > 0) {
                    NftDto nft = nftShopNftMapper.getNft(ad.getParamid());
                    if (nft != null) {
                        nft.setAvatar(cdnUrl + nft.getAvatar());
                        if (nft.getStatus() == 0) {
                            // 预售
                            if (nft.getStarttime() > endTIme) {
                                nft.setStatus(2);
                            }
                            // 进行中
                            if (nft.getStarttime() <= startTime) {
                                nft.setStatus(3);
                            }
                            // 已售罄
                            if (nft.getEndtime() < startTime) {
                                nft.setStatus(1);
                            }
                            // 已售罄
                            if (nft.getCastnum() - nft.getKeepnum() <= nft.getFinishnum()) {
                                nft.setStatus(1);
                            }
                        }
                        ad.setNft(nft);
                    }
                }
            }
            ad.setAvatar(cdnUrl + ad.getUrl());
        });
        shopIndexVo.setAds(ads);

        List<SalelistDto> salelists = nftShopSaleMapper.getSaleList();

        salelists.forEach(salelist -> {
            if (!salelist.getAvatar().isEmpty()) {
                salelist.setAvatar(cdnUrl + salelist.getAvatar());

                // 即将开始
                if (salelist.getStarttime() > startTime && salelist.getStatus() == 0) {
                    salelist.setStatus(2);
                }
                // 预售开始
                if (salelist.getStarttime() > endTIme && salelist.getStatus() == 0) {
                    salelist.setStatus(3);
                }
                // 进行中
                if (salelist.getStarttime() <= startTime && salelist.getStatus() == 0) {
                    salelist.setStatus(1);
                }
                // 期数组合
                salelist.setSaleno(salelist.getSaleno() + "." + salelist.getSnonum());
                if (salelist.getSnonum() < 10) {
                    salelist.setSaleno(salelist.getSaleno() + ".0" + salelist.getSnonum());
                }
            }

        });
        shopIndexVo.setSalelist(salelists);

        return shopIndexVo;
    }
}
