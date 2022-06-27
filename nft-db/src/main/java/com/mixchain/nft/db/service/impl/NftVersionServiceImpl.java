package com.mixchain.nft.db.service.impl;

import com.mixchain.nft.db.entity.NftVersion;
import com.mixchain.nft.db.mapper.NftVersionMapper;
import com.mixchain.nft.db.service.NftVersionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 版本表 服务实现类
 * </p>
 *
 * @author Rouzzf
 * @since 2022-06-27
 */
@Service
public class NftVersionServiceImpl extends ServiceImpl<NftVersionMapper, NftVersion> implements NftVersionService {

}
