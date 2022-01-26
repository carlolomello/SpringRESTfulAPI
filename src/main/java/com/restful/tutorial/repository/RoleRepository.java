package com.restful.tutorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restful.tutorial.entity.RoleEntity;

public interface RoleRepository extends JpaRepository<RoleEntity, String> {
	
}