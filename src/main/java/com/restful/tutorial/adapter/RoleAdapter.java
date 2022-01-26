package com.restful.tutorial.adapter;

import java.util.ArrayList;
import java.util.List;

import com.restful.tutorial.adapter.role_adapter.get_adapter.EmployeeForRoleAdapter;
import com.restful.tutorial.api_model.RoleAPIModel;
import com.restful.tutorial.entity.RoleEntity;

public class RoleAdapter {

	public static RoleAPIModel to_API_model(RoleEntity roleEntity) {
		RoleAPIModel roleAPI = new RoleAPIModel();
		roleAPI.setRoleName(roleEntity.getRoleName());
		roleAPI.setSalary(roleEntity.getSalary());
		roleAPI.setEmployeeList(EmployeeForRoleAdapter.to_API_model_list(roleEntity.getEmployeeList()));
		return roleAPI;
	}

	public static RoleEntity to_entity_model(RoleAPIModel roleAPI) {
		RoleEntity roleEntity = new RoleEntity();
		roleEntity.setRoleName(roleAPI.getRoleName());
		roleEntity.setSalary(roleAPI.getSalary());
		roleEntity.setEmployeeList(EmployeeForRoleAdapter.to_entity_model_list(roleAPI.getEmployeeList()));
		return roleEntity;
	}
	
	public static List<RoleAPIModel> to_API_model_list(List<RoleEntity> listRoleEntity){
		List<RoleAPIModel> listRoleAPI = new ArrayList<RoleAPIModel>(); 
		for (RoleEntity role : listRoleEntity) {
			listRoleAPI.add(to_API_model(role));
		}
		return listRoleAPI;
	}
	
	public static List<RoleEntity> to_entity_model_list(List<RoleAPIModel> listRoleAPIModel){
		List<RoleEntity> listRoleEntity = new ArrayList<RoleEntity>(); 
		for (RoleAPIModel role : listRoleAPIModel) {
			listRoleEntity.add(to_entity_model(role));
		}
		return listRoleEntity;
	}
}
