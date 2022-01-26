package com.restful.tutorial.adapter;

import java.util.ArrayList;
import java.util.List;

import com.restful.tutorial.api_model.TaskAPIModel;
import com.restful.tutorial.entity.TaskEntity;

public class TaskAdapter {

	public static TaskAPIModel to_API_model(TaskEntity taskEntity) {
		TaskAPIModel taskAPI = new TaskAPIModel();
		taskAPI.setIdTask(taskEntity.getIdTask());
		taskAPI.setDescription(taskEntity.getDescription());
		taskAPI.setDeadline(taskEntity.getDeadline());
		return taskAPI;
	}

	public static TaskEntity to_entity_model(TaskAPIModel taskAPI) {
		TaskEntity taskEntity = new TaskEntity();
		taskEntity.setIdTask(taskAPI.getIdTask());
		taskEntity.setDescription(taskAPI.getDescription());
		taskEntity.setDeadline(taskAPI.getDeadline());
		return taskEntity;
	}
	
	public static List<TaskAPIModel> to_API_model_list(List<TaskEntity> listTaskEntity){
		List<TaskAPIModel> listTaskAPI = new ArrayList<TaskAPIModel>(); 
		for (TaskEntity task : listTaskEntity) {
			listTaskAPI.add(to_API_model(task));
		}
		return listTaskAPI;
	}
	
	public static List<TaskEntity> to_entity_model_list(List<TaskAPIModel> listTaskAPIModel){
		List<TaskEntity> listTaskEntity = new ArrayList<TaskEntity>(); 
		for (TaskAPIModel task : listTaskAPIModel) {
			listTaskEntity.add(to_entity_model(task));
		}
		return listTaskEntity;
	}
}
