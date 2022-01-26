package com.restful.tutorial.api_model.employee_API_model.get_API_model.responce;

import com.restful.tutorial.api_model.TaskAPIModel;

public class ResponceTaskAssignmentAPIModel {

	private String cf;
	
	private String name;
	
	private String surname;
	
	TaskAPIModel task;

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

	public TaskAPIModel getTask() {
		return task;
	}

	public void setTask(TaskAPIModel task) {
		this.task = task;
	}
	
	
	
}
