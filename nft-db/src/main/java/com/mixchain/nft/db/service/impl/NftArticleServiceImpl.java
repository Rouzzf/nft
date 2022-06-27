package com.mixchain.nft.db.service.impl;

import com.mixchain.nft.db.dto.ArticleDto;
import com.mixchain.nft.db.entity.NftArticle;
import com.mixchain.nft.db.mapper.NftArticleMapper;
import com.mixchain.nft.db.service.NftArticleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
public class NftArticleServiceImpl extends ServiceImpl<NftArticleMapper, NftArticle> implements NftArticleService {

    @Override
    public List<ArticleDto> articleList(Integer per, Integer pageSize, Integer type, Integer langid) {
        return baseMapper.articleList(per, pageSize, type, langid);
    }
}
