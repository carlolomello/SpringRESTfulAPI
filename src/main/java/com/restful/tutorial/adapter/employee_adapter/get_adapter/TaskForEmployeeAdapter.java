package com.restful.tutorial.adapter.employee_adapter.get_adapter;

import java.util.ArrayList;
import java.util.List;

import com.restful.tutorial.api_model.employee_API_model.get_API_model.TaskForEmployeeAPIModel;
import com.restful.tutorial.entity.TaskEntity;

public class TaskForEmployeeAdapter {

	public static TaskForEmployeeAPIModel to_API_model(TaskEntity taskEntity) {
		TaskForEmployeeAPIModel taskAPI = new TaskForEmployeeAPIModel();
		taskAPI.setIdTask(taskEntity.getIdTask());
		taskAPI.setDescription(taskEntity.getDescription());
		taskAPI.setDeadline(taskEntity.getDeadline());
		return taskAPI;
	}

	public static TaskEntity to_entity_model(TaskForEmployeeAPIModel taskAPI) {
		TaskEntity taskEntity = new TaskEntity();
		taskEntity.setIdTask(taskAPI.getIdTask());
		taskEntity.setDescription(taskAPI.getDescription());
		taskEntity.setDeadline(taskAPI.getDeadline());
		return taskEntity;
	}
	
	public static List<TaskForEmployeeAPIModel> to_API_model_list(List<TaskEntity> listTaskEntity){
		List<TaskForEmployeeAPIModel> listContactAPI = new ArrayList<TaskForEmployeeAPIModel>(); 
		for (TaskEntity task : listTaskEntity) {
			listContactAPI.add(to_API_model(task));
		}
		return listContactAPI;
	}
	
	public static List<TaskEntity> to_entity_model_list(List<TaskForEmployeeAPIModel> listContactAPIModel){
		List<TaskEntity> listTaskEntity = new ArrayList<TaskEntity>(); 
		for (TaskForEmployeeAPIModel task : listContactAPIModel) {
			listTaskEntity.add(to_entity_model(task));
		}
		return listTaskEntity;
	}
}
