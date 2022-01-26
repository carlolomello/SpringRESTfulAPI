package com.restful.tutorial.adapter.employee_adapter.post_adapter;

import com.restful.tutorial.adapter.TaskAdapter;
import com.restful.tutorial.api_model.employee_API_model.get_API_model.responce.ResponceTaskAssignmentAPIModel;
import com.restful.tutorial.entity.EmployeeEntity;
import com.restful.tutorial.entity.TaskEntity;

public class ResponceTaskAssignmentAdapter {
	
	public static ResponceTaskAssignmentAPIModel to_API_model(EmployeeEntity employeeEntity, TaskEntity taskEntity) {
		ResponceTaskAssignmentAPIModel employeeAPI = new ResponceTaskAssignmentAPIModel();
		employeeAPI.setCf(employeeEntity.getCf());
		employeeAPI.setName(employeeEntity.getName());
		employeeAPI.setSurname(employeeEntity.getSurname());
		employeeAPI.setTask(TaskAdapter.to_API_model(taskEntity));
		
		return employeeAPI;
	}

	public static EmployeeEntity to_entity_model(ResponceTaskAssignmentAPIModel taskAssignmentAPI) {

		return null;
	}

}
