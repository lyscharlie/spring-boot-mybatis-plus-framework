package com.lyscharlie.biz.user.service;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lyscharlie.biz.user.entity.LysUser;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ILysUserServiceTest {

	@Autowired
	private ILysUserService iLysUserService;

	@Test
	public void testListWrapperOfT() {
		List<LysUser> list = this.iLysUserService.list(new QueryWrapper<LysUser>().eq("password", "e10adc3949ba59abbe56e057f20f883e").like("user_name", "abc"));
		System.out.println(list.size());
		System.out.println(JSONObject.toJSONString(list));
	}

	@Test
	public void testList() {
		List<LysUser> list = this.iLysUserService.list();
		System.out.println(list.size());
		System.out.println(JSONObject.toJSONString(list));
	}

	@Test
	public void testPageIPageOfTWrapperOfT() {
		IPage<LysUser> page = this.iLysUserService.page(new Page<>(1, 2, true), new QueryWrapper<LysUser>().lt("gmt_create", new Date()));
		System.out.println(JSONObject.toJSONString(page));
	}

	@Test
	public void testPageIPageOfT() {
		IPage<LysUser> page = this.iLysUserService.page(new Page<>(2, 2));
		System.out.println(JSONObject.toJSONString(page));
	}

}
