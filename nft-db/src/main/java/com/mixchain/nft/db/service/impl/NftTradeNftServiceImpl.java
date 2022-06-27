package com.mixchain.nft.db.service.impl;

import com.mixchain.nft.db.dto.NftExternalDto;
import com.mixchain.nft.db.dto.NftListDto;
import com.mixchain.nft.db.entity.NftTradeNft;
import com.mixchain.nft.db.mapper.NftShopCategoryMapper;
import com.mixchain.nft.db.mapper.NftTradeNftMapper;
import com.mixchain.nft.db.service.NftTradeNftService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
public class NftTradeNftServiceImpl extends ServiceImpl<NftTradeNftMapper, NftTradeNft> implements NftTradeNftService {
    @Value("${cdn.url}")
    private String cdnUrl;


    @Autowired
    private NftShopCategoryMapper nftShopCategoryMapper;


    @Override
    public List<NftListDto> nftList(Integer per, Integer pageSize, Integer cateid, Integer sort, Integer order) {
        String contract = null;
        if (cateid != null && cateid > 0) {
            contract = nftShopCategoryMapper.getContractById(cateid);
        }
        List<NftListDto> nftListDto = baseMapper.nftList(per, pageSize, contract, sort, order);
        nftListDto.forEach(listDto -> {
                    listDto.setAvatar(cdnUrl + listDto.getAvatar());
                    // 外部提入是否收录
                    if (listDto.getType() == 2) {
                        System.out.println(listDto);
                        NftExternalDto nftExternalDto = nftShopCategoryMapper.getExternalByContract(listDto.getContract());
                        if (nftExternalDto != null) {
                            listDto.setSuename(nftExternalDto.getName());
                            listDto.setIsv(nftExternalDto.getIsv());
                        }
                    }
                }
        );
        return nftListDto;
    }
}
