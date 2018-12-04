package com.lyscharlie.biz.user.entity;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author liyishi
 * @since 2018-12-04
 */
public class LysUser {

	/**
	 * 用户id
	 */
	@TableId(value = "user_id", type = IdType.AUTO)
	private Long userId;

	/**
	 * 用户名
	 */
	private String userName;

	/**
	 * 用户密码
	 */
	private String password;

	/**
	 * 邮箱
	 */
	private String email;

	/**
	 * 手机号
	 */
	private String mobile;

	/**
	 * 推荐人id
	 */
	private Long registerReferId;

	/**
	 * 最近一次登录时间
	 */
	private Date lastLoginTime;

	/**
	 * 创建时间
	 */
	private Date gmtCreate;

	/**
	 * 最后修改时间
	 */
	private Date gmtModified;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Long getRegisterReferId() {
		return registerReferId;
	}

	public void setRegisterReferId(Long registerReferId) {
		this.registerReferId = registerReferId;
	}

	public Date getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public Date getGmtCreate() {
		return gmtCreate;
	}

	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModified() {
		return gmtModified;
	}

	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	@Override
	public String toString() {
		return "LysUser{" + "userId=" + userId + ", userName=" + userName + ", password=" + password + ", email=" + email + ", mobile=" + mobile + ", registerReferId="
				+ registerReferId + ", lastLoginTime=" + lastLoginTime + ", gmtCreate=" + gmtCreate + ", gmtModified=" + gmtModified + "}";
	}
}
