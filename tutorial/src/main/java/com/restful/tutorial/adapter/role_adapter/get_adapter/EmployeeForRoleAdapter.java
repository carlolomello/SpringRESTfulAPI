package com.restful.tutorial.adapter.role_adapter.get_adapter;

import java.util.ArrayList;
import java.util.List;

import com.restful.tutorial.api_model.role_API_model.get_API_model.EmployeeForRoleAPIModel;
import com.restful.tutorial.entity.EmployeeEntity;

public class EmployeeForRoleAdapter {

	public static EmployeeForRoleAPIModel to_API_model(EmployeeEntity employeeEntity) {
		EmployeeForRoleAPIModel employeeAPI = new EmployeeForRoleAPIModel();
		employeeAPI.setCf(employeeEntity.getCf());
		employeeAPI.setName(employeeEntity.getName());
		employeeAPI.setSurname(employeeEntity.getSurname());
		employeeAPI.setDate(employeeEntity.getDate());
		employeeAPI.setPlace(employeeEntity.getPlace());
		return employeeAPI;
	}

	public static EmployeeEntity to_entity_model(EmployeeForRoleAPIModel employeeAPI) {
		EmployeeEntity employeeEntity = new EmployeeEntity();
		employeeEntity.setCf(employeeAPI.getCf());
		employeeEntity.setName(employeeAPI.getName());
		employeeEntity.setSurname(employeeAPI.getSurname());
		employeeEntity.setDate(employeeAPI.getDate());
		employeeEntity.setPlace(employeeAPI.getPlace());
		return employeeEntity;
	}
	
	public static List<EmployeeForRoleAPIModel> to_API_model_list(List<EmployeeEntity> listEmployeeEntity){
		List<EmployeeForRoleAPIModel> listEmployeeAPI = new ArrayList<EmployeeForRoleAPIModel>(); 
		for (EmployeeEntity employee : listEmployeeEntity) {
			listEmployeeAPI.add(to_API_model(employee));
		}
		return listEmployeeAPI;
	}
	
	public static List<EmployeeEntity> to_entity_model_list(List<EmployeeForRoleAPIModel> listEmployeeForRoleAPIModel){
		List<EmployeeEntity> listEmployeeEntity = new ArrayList<EmployeeEntity>(); 
		for (EmployeeForRoleAPIModel employee : listEmployeeForRoleAPIModel) {
			listEmployeeEntity.add(to_entity_model(employee));
		}
		return listEmployeeEntity;
	}
}
