package com.restful.tutorial.service_operation;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restful.tutorial.adapter.TaskAdapter;
import com.restful.tutorial.adapter.task_adapter.RequestSaveTaskAdapter;
import com.restful.tutorial.api_model.TaskAPIModel;
import com.restful.tutorial.api_model.task_API_model.RequestSaveTaskAPIModel;
import com.restful.tutorial.entity.TaskEntity;
import com.restful.tutorial.service.TaskService;

@Service
public class TaskServiceOperation {
	
	@Autowired
	private TaskService taskService;
	
    public List<TaskAPIModel> list() {
        return TaskAdapter.to_API_model_list(taskService.findAllT());
    }

	public TaskAPIModel saveTask(RequestSaveTaskAPIModel taskAPIModel) {
		return TaskAdapter.to_API_model(taskService.saveT(RequestSaveTaskAdapter.to_entity_model(taskAPIModel)));
		 
	}
	
	public TaskAPIModel getTaskById(Integer idTask) {
		TaskEntity taskEntity = taskService.getById(idTask);
		
		if(taskEntity!=null)
			return TaskAdapter.to_API_model(taskEntity);
		else
    		throw new NoSuchElementException(" ERROR: task "+idTask+" not foud"); 
	}
	
	
	public TaskAPIModel updateTask(TaskAPIModel taskAPIModel) {
		if(taskService.getById(taskAPIModel.getIdTask()) != null) {
			return TaskAdapter.to_API_model(taskService.saveT(TaskAdapter.to_entity_model(taskAPIModel)));
		}
		throw new NoSuchElementException(" ERROR: task "+taskAPIModel.getIdTask()+" not foud"); 
	}

	public void deleteById(Integer idTask) {
		if(taskService.getById(idTask) != null) {
			taskService.deleteById(idTask);
		} else {
			throw new NoSuchElementException(" ERROR: task "+idTask+" not foud"); 
		}
	}

}
