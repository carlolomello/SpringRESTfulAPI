package com.restful.tutorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restful.tutorial.entity.TaskEntity;

public interface TaskRepository extends JpaRepository<TaskEntity, Integer> {
	
}