package com.usb.blank.dto;

import java.io.Serializable;


public class DepartmentDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer departmentOrder;
	private String departmentName;
	private String departmentBossPib;
	private String departmentBossPosition;


	public DepartmentDto() {
	}

	public DepartmentDto(Integer departmentOrder, String departmentName,
			String departmentBossPib, String departmentBossPosition) {
		this.departmentOrder = departmentOrder;
		this.departmentName = departmentName;
		this.departmentBossPib = departmentBossPib;
		this.departmentBossPosition = departmentBossPosition;
	}

	public Integer getDepartmentOrder() {
		return departmentOrder;
	}

	public void setDepartmentOrder(Integer departmentOrder) {
		this.departmentOrder = departmentOrder;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentBossPib() {
		return departmentBossPib;
	}

	public void setDepartmentBossPib(String departmentBossPib) {
		this.departmentBossPib = departmentBossPib;
	}

	public String getDepartmentBossPosition() {
		return departmentBossPosition;
	}

	public void setDepartmentBossPosition(String departmentBossPosition) {
		this.departmentBossPosition = departmentBossPosition;
	}

}