package com.mixchain.nft.db.mapper;

import com.mixchain.nft.db.dto.ArticleDto;
import com.mixchain.nft.db.entity.NftArticle;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author Rouzzf
 * @since 2022-06-27
 */
public interface NftArticleMapper extends BaseMapper<NftArticle> {

    List<ArticleDto> articleList(@Param("per") Integer per, @Param("pageSize") Integer pageSize, @Param("type") Integer type, @Param("langid") Integer langid);

}
