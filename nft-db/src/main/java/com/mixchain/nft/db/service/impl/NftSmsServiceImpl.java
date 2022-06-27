package com.mixchain.nft.db.service.impl;

import com.mixchain.nft.db.entity.NftSms;
import com.mixchain.nft.db.mapper.NftSmsMapper;
import com.mixchain.nft.db.service.NftSmsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 短信验证码表 服务实现类
 * </p>
 *
 * @author Rouzzf
 * @since 2022-06-27
 */
@Service
public class NftSmsServiceImpl extends ServiceImpl<NftSmsMapper, NftSms> implements NftSmsService {

}
