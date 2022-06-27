package com.mixchain.nft.db.service.impl;

import com.mixchain.nft.db.entity.NftCommand;
import com.mixchain.nft.db.mapper.NftCommandMapper;
import com.mixchain.nft.db.service.NftCommandService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 在线命令表 服务实现类
 * </p>
 *
 * @author Rouzzf
 * @since 2022-06-27
 */
@Service
public class NftCommandServiceImpl extends ServiceImpl<NftCommandMapper, NftCommand> implements NftCommandService {

}
