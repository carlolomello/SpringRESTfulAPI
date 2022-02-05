package com.restful.tutorial.service_operation;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restful.tutorial.adapter.RoleAdapter;
import com.restful.tutorial.adapter.role_adapter.post_adapter.RequestSaveRoleAdapter;
import com.restful.tutorial.api_model.RoleAPIModel;
import com.restful.tutorial.api_model.role_API_model.post_API_model.RequestSaveRoleAPIModel;
import com.restful.tutorial.entity.RoleEntity;
import com.restful.tutorial.service.RoleService;

@Service
public class RoleServiceOperation {

	@Autowired
    private RoleService service;
	 
	public List<RoleAPIModel> getRoleList() {
		return RoleAdapter.to_API_model_list(service.findAllR());
	}
	
	@SuppressWarnings("null")
	public RoleAPIModel getRoleByRoleName(String roleName) {
		RoleEntity roleEntity = service.findRole(roleName);
		
		if(roleEntity!=null)
			return RoleAdapter.to_API_model(roleEntity);
		else
    		throw new NoSuchElementException(" ERROR: role "+roleEntity.getRoleName()+" not foud"); 	
		
	}
	
	public void deleteRoleById(String roleName){
		service.deleteRole(roleName);
	}
	
	
	public RequestSaveRoleAPIModel saveRole(RequestSaveRoleAPIModel role) {
		return RequestSaveRoleAdapter.to_API_model(service.saveR(RequestSaveRoleAdapter.to_entity_model(role)));
	}
	
	public RequestSaveRoleAPIModel updateRole(RequestSaveRoleAPIModel role) {
		RoleEntity roleFound = service.findRole(role.getRoleName());
		if(roleFound!=null) {
			RoleEntity roleEntity = RequestSaveRoleAdapter.to_entity_model(role);
			return RequestSaveRoleAdapter.to_API_model(service.saveR(roleEntity));
	    	
		}else {
			throw new NoSuchElementException(" ERROR: role "+role.getRoleName()+" not foud"); 	
		}
	}
}
