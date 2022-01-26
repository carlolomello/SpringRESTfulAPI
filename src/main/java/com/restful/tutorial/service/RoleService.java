package com.restful.tutorial.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restful.tutorial.entity.RoleEntity;
import com.restful.tutorial.repository.RoleRepository;

@Service
@Transactional
public class RoleService {
	@Autowired
    private RoleRepository roleRepository;
	
	public List<RoleEntity> findAllR() {
        return roleRepository.findAll();
    }
     
    public RoleEntity saveR(RoleEntity roleEntity) {
    	return roleRepository.save(roleEntity);
    }
    
    public RoleEntity findRole(String roleName) {
		return roleRepository.findById(roleName).get();	
    }
    
    public void deleteRole(String roleEntity) {
    	roleRepository.deleteById(roleEntity);
    }

}
