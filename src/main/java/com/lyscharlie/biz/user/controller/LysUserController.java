package com.lyscharlie.biz.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lyscharlie.biz.user.entity.LysUser;
import com.lyscharlie.biz.user.service.ILysUserService;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author liyishi
 * @since 2018-12-04
 */
@RestController
@RequestMapping("/user")
public class LysUserController {

	@Autowired
	private ILysUserService iLysUserService;

	@RequestMapping(path = "/list", method = RequestMethod.GET)
	public List<LysUser> listAll() {
		List<LysUser> list = iLysUserService.list();
		return list;
	}
}
