package com.restful.tutorial.adapter.task_adapter;

import java.util.ArrayList;
import java.util.List;

import com.restful.tutorial.api_model.task_API_model.RequestSaveTaskAPIModel;
import com.restful.tutorial.entity.TaskEntity;

public class RequestSaveTaskAdapter {

	public static RequestSaveTaskAPIModel to_API_model(TaskEntity taskEntity) {
		RequestSaveTaskAPIModel taskAPI = new RequestSaveTaskAPIModel();
		taskAPI.setDescription(taskEntity.getDescription());
		taskAPI.setDeadline(taskEntity.getDeadline());
		return taskAPI;
	}

	public static TaskEntity to_entity_model(RequestSaveTaskAPIModel taskAPI) {
		TaskEntity taskEntity = new TaskEntity();
		taskEntity.setDescription(taskAPI.getDescription());
		taskEntity.setDeadline(taskAPI.getDeadline());
		return taskEntity;
	}
	
	public static List<RequestSaveTaskAPIModel> to_API_model_list(List<TaskEntity> listTaskEntity){
		List<RequestSaveTaskAPIModel> listTaskAPI = new ArrayList<RequestSaveTaskAPIModel>(); 
		for (TaskEntity task : listTaskEntity) {
			listTaskAPI.add(to_API_model(task));
		}
		return listTaskAPI;
	}
	
	public static List<TaskEntity> to_entity_model_list(List<RequestSaveTaskAPIModel> listRequestSaveTaskAPIModel){
		List<TaskEntity> listTaskEntity = new ArrayList<TaskEntity>(); 
		for (RequestSaveTaskAPIModel task : listRequestSaveTaskAPIModel) {
			listTaskEntity.add(to_entity_model(task));
		}
		return listTaskEntity;
	}
}
