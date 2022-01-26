package com.restful.tutorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restful.tutorial.entity.ShiftEntity;

public interface ShiftRepository extends JpaRepository<ShiftEntity, String> {
	
}