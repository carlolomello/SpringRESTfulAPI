package com.restful.tutorial.adapter.employee_adapter.get_adapter;

import com.restful.tutorial.api_model.employee_API_model.get_API_model.RoleForEmployeeAPIModel;
import com.restful.tutorial.entity.RoleEntity;

public class RoleForEmployeeAdapter {

	public static RoleForEmployeeAPIModel to_API_model(RoleEntity roleEntity) {
		RoleForEmployeeAPIModel roleAPI = new RoleForEmployeeAPIModel();
		roleAPI.setRoleName(roleEntity.getRoleName());
		roleAPI.setSalary(roleEntity.getSalary());
		return roleAPI;
	}

	public static RoleEntity to_entity_model(RoleForEmployeeAPIModel roleAPI) {
		RoleEntity roleEntity = new RoleEntity();
		roleEntity.setRoleName(roleAPI.getRoleName());
		roleEntity.setSalary(roleAPI.getSalary());
		return roleEntity;
		
	}
}
