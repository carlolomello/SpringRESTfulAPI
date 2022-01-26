package com.restful.tutorial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restful.tutorial.api_model.TaskAPIModel;
import com.restful.tutorial.api_model.task_API_model.RequestSaveTaskAPIModel;
import com.restful.tutorial.service_operation.TaskServiceOperation;

@RestController
public class TaskController {
	
	@Autowired
    private TaskServiceOperation service;
	
    @GetMapping("/task_list")
    public List<TaskAPIModel> list() {
        return service.list();
    }
    
    @GetMapping("/task_by_id")
    public TaskAPIModel getTask(Integer idTask) {
    	return service.getTaskById(idTask);
    }
    
    @PostMapping("/insert_task")
    public TaskAPIModel saveT(@RequestBody RequestSaveTaskAPIModel taskAPIModel) {
    	return service.saveTask(taskAPIModel);
    }
    
    @PutMapping("/update_task")
    public TaskAPIModel updateT(@RequestBody TaskAPIModel taskAPIModel) {
    	return service.updateTask(taskAPIModel);
    }
    
    @DeleteMapping("/delete_task")
    public void deleteTask(@RequestBody Integer idTask) {
    	 service.deleteById(idTask);
    }
    
    
}
