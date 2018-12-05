package com.lyscharlie.biz.test.mapper;

import com.lyscharlie.biz.test.entity.MyTest;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 我的测试表 Mapper 接口
 * </p>
 *
 * @author liyishi
 * @since 2018-12-04
 */
@Mapper
public interface MyTestMapper extends BaseMapper<MyTest> {

}
