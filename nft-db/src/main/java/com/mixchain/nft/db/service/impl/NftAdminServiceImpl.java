package com.mixchain.nft.db.service.impl;

import com.mixchain.nft.db.entity.NftAdmin;
import com.mixchain.nft.db.mapper.NftAdminMapper;
import com.mixchain.nft.db.service.NftAdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 管理员表 服务实现类
 * </p>
 *
 * @author Rouzzf
 * @since 2022-06-27
 */
@Service
public class NftAdminServiceImpl extends ServiceImpl<NftAdminMapper, NftAdmin> implements NftAdminService {

}
