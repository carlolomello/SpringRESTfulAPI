package com.restful.tutorial.api_model.task_API_model;

import java.util.Date;

// utilizzato solo per l'inserimento
public class RequestSaveTaskAPIModel {
	
	private String description;
	private Date deadline;
	
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
