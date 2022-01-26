package com.restful.tutorial.api_model.employee_API_model.get_API_model;

import java.util.Date;

public class TaskForEmployeeAPIModel {

	private int idTask;
	private String description;
	private Date deadline;
	
	public int getIdTask() {
		return idTask;
	}
	public void setIdTask(int idTask) {
		this.idTask = idTask;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDeadline() {
		return deadline;
	}
	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}	
}
