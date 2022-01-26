package com.restful.tutorial.adapter.contact_adapter.get_adapter;

import com.restful.tutorial.adapter.employee_adapter.get_adapter.RoleForEmployeeAdapter;
import com.restful.tutorial.api_model.contact_API_model.get_API_model.EmployeeForContactAPIModel;
import com.restful.tutorial.entity.EmployeeEntity;

public class EmployeeForContactAdapter {

	public static EmployeeForContactAPIModel to_API_model(EmployeeEntity employeeEntity) {
		EmployeeForContactAPIModel employeeAPI = new EmployeeForContactAPIModel();
		employeeAPI.setCf(employeeEntity.getCf());
		employeeAPI.setName(employeeEntity.getName());
		employeeAPI.setSurname(employeeEntity.getSurname());
		employeeAPI.setDate(employeeEntity.getDate());
		employeeAPI.setPlace(employeeEntity.getPlace());
		employeeAPI.setRole(RoleForEmployeeAdapter.to_API_model(employeeEntity.getRole()));
		return employeeAPI;
	}

	public static EmployeeEntity to_entity_model(EmployeeForContactAPIModel employeeAPI) {
		EmployeeEntity employeeEntity = new EmployeeEntity();
		employeeEntity.setCf(employeeAPI.getCf());
		employeeEntity.setName(employeeAPI.getName());
		employeeEntity.setSurname(employeeAPI.getSurname());
		employeeEntity.setDate(employeeAPI.getDate());
		employeeEntity.setPlace(employeeAPI.getPlace());
		employeeEntity.setRole(RoleForEmployeeAdapter.to_entity_model(employeeAPI.getRole()));;
		return employeeEntity;
	}

}
