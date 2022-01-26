package com.restful.tutorial.api_model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.restful.tutorial.api_model.employee_API_model.get_API_model.ContactForEmployeeAPIModel;
import com.restful.tutorial.api_model.employee_API_model.get_API_model.RoleForEmployeeAPIModel;
import com.restful.tutorial.api_model.employee_API_model.get_API_model.ShiftForEmployeeAPIModel;
import com.restful.tutorial.api_model.employee_API_model.get_API_model.TaskForEmployeeAPIModel;

public class EmployeeAPIModel {
	
	private String cf;
	
	private String name;
	
	private String surname;
	
	private Date date;

	private String place;
	
	private List<ContactForEmployeeAPIModel> contactList = new ArrayList<ContactForEmployeeAPIModel>();
	
	private RoleForEmployeeAPIModel role;
	
	private List<ShiftForEmployeeAPIModel> shiftList = new ArrayList<ShiftForEmployeeAPIModel>();

	private List<TaskForEmployeeAPIModel> taskList = new ArrayList<TaskForEmployeeAPIModel>();

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

	public List<ContactForEmployeeAPIModel> getContactList() {
		return contactList;
	}

	public void setContactList(List<ContactForEmployeeAPIModel> contactList) {
		this.contactList = contactList;
	}

	public RoleForEmployeeAPIModel getRole() {
		return role;
	}

	public void setRole(RoleForEmployeeAPIModel role) {
		this.role = role;
	}

	public List<ShiftForEmployeeAPIModel> getShiftList() {
		return shiftList;
	}

	public void setShiftList(List<ShiftForEmployeeAPIModel> shiftList) {
		this.shiftList = shiftList;
	}

	public List<TaskForEmployeeAPIModel> getTaskList() {
		return taskList;
	}

	public void setTaskList(List<TaskForEmployeeAPIModel> taskList) {
		this.taskList = taskList;
	}

	
}
