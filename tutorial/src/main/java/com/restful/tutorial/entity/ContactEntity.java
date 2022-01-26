package com.restful.tutorial.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.restful.tutorial.entity.contact_key.ContactKey;

@Entity
@Table(name="contact")
@IdClass(ContactKey.class)
public class ContactEntity {

	@Id
	@Column(name="kind")	
	private String kind;
	
	@Id
	@Column(name="value")	
	private String value;
	
	
	@Id
	@Column(name="cf")
	private String cf;
	
	
	@Id	
	@ManyToOne(fetch = FetchType.LAZY, 
		targetEntity = EmployeeEntity.class,
		optional=false)
	@JoinColumn(name = "cf", 
		insertable=false, 
		updatable=false)
	private EmployeeEntity employee;


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

	public EmployeeEntity getEmployee() {
		return employee;
	}


	public void setEmployee(EmployeeEntity employee) {
		this.employee = employee;
	}

}
