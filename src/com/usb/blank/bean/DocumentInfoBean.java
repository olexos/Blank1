package com.usb.blank.bean;

import java.io.Serializable;
import java.util.Map;

import javax.faces.model.SelectItem;


import com.usb.blank.util.DocumentInfoAssembler;
import com.usb.blank.dto.DepartmentDto;


public class DocumentInfoBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private String surname;
	private String name;
	private String secondname;
	private String tabNum;
	private String identCode;
	private Map<Integer, DepartmentDto> departments;
	private Integer selectedDepartment;
	private String bossPib;
	private String bossPosition;


	public DocumentInfoBean() {
		DocumentInfoAssembler.fillDocumentInfo(this);
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSecondname() {
		return secondname;
	}

	public void setSecondname(String secondname) {
		this.secondname = secondname;
	}

	public String getTabNum() {
		return tabNum;
	}

	public void setTabNum(String tabNum) {
		this.tabNum = tabNum;
	}

	public String getIdentCode() {
		return identCode;
	}

	public void setIdentCode(String identCode) {
		this.identCode = identCode;
	}

	public Map<Integer, DepartmentDto> getDepartments() {
		return departments;
	}

	public void setDepartments(Map<Integer, DepartmentDto> departments) {
		this.departments = departments;
	}

	public Integer getSelectedDepartment() {
		return selectedDepartment;
	}

	public void setSelectedDepartment(Integer selectedDepartment) {
		this.selectedDepartment = selectedDepartment;
	}

	public String getBossPib() {
		return bossPib;
	}

	public void setBossPib(String bossPib) {
		this.bossPib = bossPib;
	}

	public String getBossPosition() {
		return bossPosition;
	}

	public void setBossPosition(String bossPosition) {
		this.bossPosition = bossPosition;
	}
	
    public SelectItem[] getDepartmentsList() {
        SelectItem[] result;
        result = new SelectItem[departments.size()];
        int i = 0;
        for(DepartmentDto department: departments.values()) {
        	result[i] = new SelectItem(department.getDepartmentOrder(), department.getDepartmentName());
        	i++;
        }
        return result;
    }

	public String getDepartmentName(Integer departmentOrder) {
		DepartmentDto department = departments.get(departmentOrder);
		return department.getDepartmentName() == null ? null :
			department.getDepartmentName();
	}
	
	public void selectDepartment() {
		DepartmentDto department = departments.get(selectedDepartment);
		bossPib = department == null ? null : department.getDepartmentBossPib();
		bossPosition = department == null ? null :
			department.getDepartmentBossPosition();
	}


}