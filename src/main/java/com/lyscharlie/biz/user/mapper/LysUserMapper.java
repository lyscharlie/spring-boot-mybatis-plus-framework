package com.lyscharlie.biz.user.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyscharlie.biz.user.entity.LysUser;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author liyishi
 * @since 2018-12-04
 */
@Mapper
public interface LysUserMapper extends BaseMapper<LysUser> {

}
