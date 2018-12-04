package com.lyscharlie.biz.user.service.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyscharlie.biz.user.entity.LysUser;
import com.lyscharlie.biz.user.mapper.LysUserMapper;
import com.lyscharlie.biz.user.service.ILysUserService;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author liyishi
 * @since 2018-12-04
 */
@Service
public class LysUserServiceImpl extends ServiceImpl<LysUserMapper, LysUser> implements ILysUserService {

//	@Autowired
//	private LysUserMapper lysUserMapper;
}
