package com.restful.tutorial.adapter;

import java.util.ArrayList;
import java.util.List;

import com.restful.tutorial.adapter.employee_adapter.get_adapter.ContactForEmployeeAdapter;
import com.restful.tutorial.adapter.employee_adapter.get_adapter.RoleForEmployeeAdapter;
import com.restful.tutorial.adapter.employee_adapter.get_adapter.ShiftForEmployeeAdapter;
import com.restful.tutorial.adapter.employee_adapter.get_adapter.TaskForEmployeeAdapter;
import com.restful.tutorial.api_model.EmployeeAPIModel;
import com.restful.tutorial.entity.EmployeeEntity;

public class EmployeeAdapter {
	public static EmployeeAPIModel to_API_model(EmployeeEntity employeeEntity) {
		EmployeeAPIModel employeeAPI = new EmployeeAPIModel();
		employeeAPI.setCf(employeeEntity.getCf());
		employeeAPI.setName(employeeEntity.getName());
		employeeAPI.setSurname(employeeEntity.getSurname());
		employeeAPI.setDate(employeeEntity.getDate());
		employeeAPI.setPlace(employeeEntity.getPlace());
		
		if(employeeEntity.getRole() != null) {
			employeeAPI.setRole(RoleForEmployeeAdapter.to_API_model(employeeEntity.getRole()));
		}
		
		if(!employeeEntity.getContactList().isEmpty()) {
			employeeAPI.setContactList( ContactForEmployeeAdapter.to_API_model_list(employeeEntity.getContactList()));
		}
		
		if(!employeeEntity.getShiftList().isEmpty()) {
			employeeAPI.setShiftList( ShiftForEmployeeAdapter.to_API_model_list(employeeEntity.getShiftList()));
		}
		
		if(!employeeEntity.getTaskList().isEmpty()) {
			employeeAPI.setTaskList( TaskForEmployeeAdapter.to_API_model_list(employeeEntity.getTaskList()));
		}
		
		
		return employeeAPI;
	}

	public static EmployeeEntity to_entity_model(EmployeeAPIModel employeeAPI) {
		EmployeeEntity employeeEntity = new EmployeeEntity();
		employeeEntity.setCf(employeeAPI.getCf());
		employeeEntity.setName(employeeAPI.getName());
		employeeEntity.setSurname(employeeAPI.getSurname());
		employeeEntity.setDate(employeeAPI.getDate());
		employeeEntity.setPlace(employeeAPI.getPlace());
		
		if(employeeAPI.getRole() != null) {
			employeeEntity.setRole(RoleForEmployeeAdapter.to_entity_model(employeeAPI.getRole()));
		}
		if(!employeeAPI.getContactList().isEmpty()) {
			employeeEntity.setContactList( ContactForEmployeeAdapter.to_entity_model_list(employeeAPI.getContactList()));
		}
		if(!employeeAPI.getShiftList().isEmpty()) {
			employeeEntity.setShiftList( ShiftForEmployeeAdapter.to_entity_model_list(employeeAPI.getShiftList()));
		}
		if(!employeeEntity.getTaskList().isEmpty()) {
			employeeEntity.setTaskList( TaskForEmployeeAdapter.to_entity_model_list(employeeAPI.getTaskList()));
		}
		return employeeEntity;
	}
	
	public static List<EmployeeAPIModel> to_API_model_list(List<EmployeeEntity> listEmployeeEntity){
		List<EmployeeAPIModel> listEmployeeAPI = new ArrayList<EmployeeAPIModel>(); 
		for (EmployeeEntity employee : listEmployeeEntity) {
			listEmployeeAPI.add(to_API_model(employee));
		}
		return listEmployeeAPI;
	}
	
	public static List<EmployeeEntity> to_entity_model_list(List<EmployeeAPIModel> listEmployeeAPIModel){
		List<EmployeeEntity> listEmployeeEntity = new ArrayList<EmployeeEntity>(); 
		for (EmployeeAPIModel employee : listEmployeeAPIModel) {
			listEmployeeEntity.add(to_entity_model(employee));
		}
		return listEmployeeEntity;
	}
	
}
