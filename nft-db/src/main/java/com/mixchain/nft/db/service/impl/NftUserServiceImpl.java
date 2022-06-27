package com.mixchain.nft.db.service.impl;

import com.mixchain.nft.db.entity.NftUser;
import com.mixchain.nft.db.mapper.NftUserMapper;
import com.mixchain.nft.db.service.NftUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 会员表 服务实现类
 * </p>
 *
 * @author Rouzzf
 * @since 2022-06-27
 */
@Service
public class NftUserServiceImpl extends ServiceImpl<NftUserMapper, NftUser> implements NftUserService {

}
