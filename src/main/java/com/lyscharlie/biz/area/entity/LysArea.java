package com.lyscharlie.biz.area.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 省市区域表
 * </p>
 *
 * @author liyishi
 * @since 2018-12-04
 */
@TableName("lys_area")
public class LysArea implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 地区id
	 */
	private Long areaId;

	/**
	 * 地区名称
	 */
	private String areaName;

	/**
	 * 地区等级：1-国家，2-省，3-市，4-区/县/镇
	 */
	private Integer areaLevel;

	/**
	 * 地区信息
	 */
	private String areaInfo;

	/**
	 * 上级地区id
	 */
	private Long parentId;

	/**
	 * 状态：1-启用，2-停用
	 */
	private Integer status;

	public Long getAreaId() {
		return areaId;
	}

	public void setAreaId(Long areaId) {
		this.areaId = areaId;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public Integer getAreaLevel() {
		return areaLevel;
	}

	public void setAreaLevel(Integer areaLevel) {
		this.areaLevel = areaLevel;
	}

	public String getAreaInfo() {
		return areaInfo;
	}

	public void setAreaInfo(String areaInfo) {
		this.areaInfo = areaInfo;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "LysAreaDO{" + "areaId=" + areaId + ", areaName=" + areaName + ", areaLevel=" + areaLevel + ", areaInfo=" + areaInfo + ", parentId=" + parentId + ", status="
				+ status + "}";
	}
}
