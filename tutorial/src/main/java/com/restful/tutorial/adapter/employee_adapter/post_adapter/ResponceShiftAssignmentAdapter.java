package com.restful.tutorial.adapter.employee_adapter.post_adapter;

import com.restful.tutorial.adapter.ShiftAdapter;
import com.restful.tutorial.api_model.employee_API_model.get_API_model.responce.ResponceShiftAssignmentAPIModel;
import com.restful.tutorial.entity.EmployeeEntity;
import com.restful.tutorial.entity.ShiftEntity;

public class ResponceShiftAssignmentAdapter {
	
	public static ResponceShiftAssignmentAPIModel to_API_model(EmployeeEntity employeeEntity, ShiftEntity shiftEntity) {
		ResponceShiftAssignmentAPIModel employeeAPI = new ResponceShiftAssignmentAPIModel();
		employeeAPI.setCf(employeeEntity.getCf());
		employeeAPI.setName(employeeEntity.getName());
		employeeAPI.setSurname(employeeEntity.getSurname());
		employeeAPI.setShift(ShiftAdapter.to_API_model(shiftEntity));
		
		return employeeAPI;
	}

	public static EmployeeEntity to_entity_model(ResponceShiftAssignmentAPIModel shiftAssignmentAPI) {

		return null;
	}

}
