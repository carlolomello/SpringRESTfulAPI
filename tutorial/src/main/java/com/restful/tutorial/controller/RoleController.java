package com.restful.tutorial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restful.tutorial.api_model.RoleAPIModel;
import com.restful.tutorial.api_model.role_API_model.post_API_model.RequestSaveRoleAPIModel;
import com.restful.tutorial.service_operation.RoleServiceOperation;

@RestController
public class RoleController {
	
	@Autowired
    private RoleServiceOperation service;
	


    @GetMapping("/role_list")
    public List<RoleAPIModel> list() {
        return service.getRoleList();
    }
    
    
    @DeleteMapping("/delete_role")
    public void deleteById(@RequestBody String roleName) {
    	service.deleteRoleById(roleName);
    }
    
    @GetMapping("/role_by_roleName")
    public RoleAPIModel getRoleByRoleName (String roleName) {
    	return service.getRoleByRoleName(roleName);
    }
    
    
    @PostMapping("/insert_role")
    public RequestSaveRoleAPIModel saveR(@RequestBody RequestSaveRoleAPIModel roleAPI){
    	return service.saveRole(roleAPI);
    }
    
    @PutMapping("/update_role")
    public RequestSaveRoleAPIModel updateR(@RequestBody RequestSaveRoleAPIModel roleAPI){
    	return service.updateRole(roleAPI);
    }
    
    
    
}
