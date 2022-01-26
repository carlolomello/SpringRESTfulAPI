package com.restful.tutorial.api_model;

import com.restful.tutorial.api_model.contact_API_model.get_API_model.EmployeeForContactAPIModel;

public class ContactAPIModel {
	
	private String kind;
	
	private String value;
	
	private String cf;
	
	private EmployeeForContactAPIModel employee;

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getCf() {
		return cf;
	}

	public void setCf(String cf) {
		this.cf = cf;
	}

	public EmployeeForContactAPIModel getEmployee() {
		return employee;
	}

	public void setEmployee(EmployeeForContactAPIModel employee) {
		this.employee = employee;
	}
	
}
