package com.restful.tutorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restful.tutorial.entity.ShiftEntity;

@Repository
public interface ShiftRepository extends JpaRepository<ShiftEntity, String> {
	
}