package com.restful.tutorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restful.tutorial.entity.EmployeeEntity;


public interface EmployeeRepository extends JpaRepository<EmployeeEntity, String> {
	
}