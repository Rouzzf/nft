package com.mixchain.nft.db.service;

import com.mixchain.nft.db.dto.ArticleDto;
import com.mixchain.nft.db.entity.NftArticle;
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
public interface NftArticleService extends IService<NftArticle> {

    /**
     * 文章列表
     *
     * @param per
     * @param pageSize
     * @param type
     * @param langid
     * @return
     */
    List<ArticleDto> articleList(Integer per, Integer pageSize, Integer type, Integer langid);
}
