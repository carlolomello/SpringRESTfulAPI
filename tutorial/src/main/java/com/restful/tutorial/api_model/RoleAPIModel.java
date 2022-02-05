package com.restful.tutorial.api_model;

import java.util.ArrayList;
import java.util.List;

import com.restful.tutorial.api_model.role_API_model.get_API_model.EmployeeForRoleAPIModel;

public class RoleAPIModel {

	private String roleName;
	private double salary;

	private List<EmployeeForRoleAPIModel> employeeList = new ArrayList<EmployeeForRoleAPIModel>();

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

	public List<EmployeeForRoleAPIModel> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(List<EmployeeForRoleAPIModel> employeeList) {
		this.employeeList = employeeList;
	}

}
