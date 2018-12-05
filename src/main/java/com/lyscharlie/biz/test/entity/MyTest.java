package com.lyscharlie.biz.test.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableLogic;
import java.io.Serializable;

/**
 * <p>
 * 我的测试表
 * </p>
 *
 * @author liyishi
 * @since 2018-12-04
 */
public class MyTest implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 名称
	 */
	private String name;

	/**
	 * 状态
	 */
	private Integer status;

	/**
	 * 是否删除：0-否，1-是
	 */
	@TableLogic
	private Integer isDelete;

	/**
	 * 创建时间
	 */
	private Date gmtCreate;

	/**
	 * 修改时间
	 */
	private Date gmtModified;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
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
		return "MyTest{" + "name=" + name + ", status=" + status + ", isDelete=" + isDelete + ", gmtCreate=" + gmtCreate + ", gmtModified=" + gmtModified + "}";
	}
}
