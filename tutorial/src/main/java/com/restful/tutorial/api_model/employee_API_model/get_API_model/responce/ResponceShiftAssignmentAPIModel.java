package com.restful.tutorial.api_model.employee_API_model.get_API_model.responce;

import com.restful.tutorial.api_model.ShiftAPIModel;
import com.restful.tutorial.api_model.TaskAPIModel;

public class ResponceShiftAssignmentAPIModel {

	private String cf;
	
	private String name;
	
	private String surname;
	
	ShiftAPIModel shift;

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

	public ShiftAPIModel getShift() {
		return shift;
	}

	public void setShift(ShiftAPIModel shift) {
		this.shift = shift;
	}

}
