package com.restful.tutorial.adapter.employee_adapter.post_adapter;

import com.restful.tutorial.api_model.employee_API_model.post_API_model.RequestSaveEmployeeAPIModel;
import com.restful.tutorial.entity.EmployeeEntity;
import com.restful.tutorial.entity.RoleEntity;

public class RequestInsertEmployeeAdapter {

	public static RequestSaveEmployeeAPIModel to_API_model(EmployeeEntity employeeEntity) {
		RequestSaveEmployeeAPIModel employeeAPI = new RequestSaveEmployeeAPIModel();
		employeeAPI.setCf(employeeEntity.getCf());
		employeeAPI.setName(employeeEntity.getName());
		employeeAPI.setSurname(employeeEntity.getSurname());
		employeeAPI.setDate(employeeEntity.getDate());
		employeeAPI.setPlace(employeeEntity.getPlace());
		employeeAPI.setRoleName(employeeEntity.getRole().getRoleName());
		return employeeAPI;
	}

	public static EmployeeEntity to_entity_model(RequestSaveEmployeeAPIModel employeeAPI) {
		EmployeeEntity employeeEntity = new EmployeeEntity();
		employeeEntity.setCf(employeeAPI.getCf());
		employeeEntity.setName(employeeAPI.getName());
		employeeEntity.setSurname(employeeAPI.getSurname());
		employeeEntity.setDate(employeeAPI.getDate());
		employeeEntity.setPlace(employeeAPI.getPlace());
		
		if(employeeAPI.getRoleName()!=null) {
			RoleEntity role = new RoleEntity();
			role.setRoleName(employeeAPI.getRoleName());
			employeeEntity.setRole(role);
		}
			
		return employeeEntity;
	}

}
