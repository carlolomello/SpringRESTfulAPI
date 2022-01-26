package com.restful.tutorial.api_model.contact_API_model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.restful.tutorial.api_model.employee_API_model.get_API_model.RoleForEmployeeAPIModel;
import com.restful.tutorial.entity.ShiftEntity;
import com.restful.tutorial.entity.TaskEntity;

public class EmployeeForContactAPIModel {

private String cf;
	
	private String name;
	
	private String surname;
	
	private Date date;

	private String place;
	
	private RoleForEmployeeAPIModel role;
	
	private Set<ShiftEntity> shiftList = new HashSet<ShiftEntity>();

	private Set<TaskEntity> taskList = new HashSet<TaskEntity>();

	public String getCf() {
		return cf;
	}

	public void setCf(String cf) {
		this.cf = cf;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}


	public RoleForEmployeeAPIModel getRole() {
		return role;
	}

	public void setRole(RoleForEmployeeAPIModel role) {
		this.role = role;
	}

	public Set<ShiftEntity> getShiftList() {
		return shiftList;
	}

	public void setShiftList(Set<ShiftEntity> shiftList) {
		this.shiftList = shiftList;
	}

	public Set<TaskEntity> getTaskList() {
		return taskList;
	}

	public void setTaskList(Set<TaskEntity> taskList) {
		this.taskList = taskList;
	}

}
