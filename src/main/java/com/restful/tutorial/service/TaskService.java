package com.restful.tutorial.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restful.tutorial.entity.TaskEntity;
import com.restful.tutorial.repository.TaskRepository;


@Service
@Transactional
public class TaskService {
	@Autowired
    private TaskRepository taskRepository;
	
	public List<TaskEntity> findAllT() {
        return taskRepository.findAll();
    }
     
    public TaskEntity saveT(TaskEntity taskEntity) {
    	return taskRepository.save(taskEntity);
    }
    
    public TaskEntity getById(Integer idTask) {
    	return taskRepository.findById(idTask).get();
    }
    
    public void deleteById(Integer idTask) {
    	taskRepository.deleteById(idTask);
    }

}
