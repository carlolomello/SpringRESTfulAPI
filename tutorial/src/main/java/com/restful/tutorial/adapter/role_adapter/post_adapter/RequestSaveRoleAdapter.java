package com.restful.tutorial.adapter.role_adapter.post_adapter;

import java.util.ArrayList;
import java.util.List;

import com.restful.tutorial.api_model.role_API_model.post_API_model.RequestSaveRoleAPIModel;
import com.restful.tutorial.entity.RoleEntity;

public class RequestSaveRoleAdapter {
	public static RequestSaveRoleAPIModel to_API_model(RoleEntity roleEntity) {
		RequestSaveRoleAPIModel roleAPI = new RequestSaveRoleAPIModel();
		roleAPI.setRoleName(roleEntity.getRoleName());
		roleAPI.setSalary(roleEntity.getSalary());
		return roleAPI;
	}

	public static RoleEntity to_entity_model(RequestSaveRoleAPIModel roleAPI) {
		RoleEntity roleEntity = new RoleEntity();
		roleEntity.setRoleName(roleAPI.getRoleName());
		roleEntity.setSalary(roleAPI.getSalary());
		return roleEntity;
	}
	
	public static List<RequestSaveRoleAPIModel> to_API_model_list(List<RoleEntity> listRoleEntity){
		List<RequestSaveRoleAPIModel> listRoleAPI = new ArrayList<RequestSaveRoleAPIModel>(); 
		for (RoleEntity role : listRoleEntity) {
			listRoleAPI.add(to_API_model(role));
		}
		return listRoleAPI;
	}
	
	public static List<RoleEntity> to_entity_model_list(List<RequestSaveRoleAPIModel> listRoleAPIModel){
		List<RoleEntity> listRoleEntity = new ArrayList<RoleEntity>(); 
		for (RequestSaveRoleAPIModel role : listRoleAPIModel) {
			listRoleEntity.add(to_entity_model(role));
		}
		return listRoleEntity;
	}
}
