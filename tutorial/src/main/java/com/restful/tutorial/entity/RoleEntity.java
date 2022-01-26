package com.restful.tutorial.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name="role")
public class RoleEntity {

	@Id
	@Column(name = "role_name")
	private String roleName;
	
	@Column(name = "salary")
	private double salary;
	
	@OneToMany(fetch = FetchType.LAZY, 
		targetEntity = EmployeeEntity.class, 
		cascade = CascadeType.PERSIST, 
		mappedBy = "role")
	@Fetch(FetchMode.SELECT)
	private List<EmployeeEntity> employeeList = new ArrayList<EmployeeEntity>();

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public List<EmployeeEntity> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(List<EmployeeEntity> employeeList) {
		this.employeeList = employeeList;
	}
}
