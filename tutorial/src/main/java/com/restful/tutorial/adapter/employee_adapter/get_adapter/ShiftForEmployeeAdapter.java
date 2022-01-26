package com.restful.tutorial.adapter.employee_adapter.get_adapter;

import java.util.ArrayList;
import java.util.List;

import com.restful.tutorial.api_model.employee_API_model.get_API_model.ShiftForEmployeeAPIModel;
import com.restful.tutorial.entity.ShiftEntity;

public class ShiftForEmployeeAdapter {

	public static ShiftForEmployeeAPIModel to_API_model(ShiftEntity shiftEntity) {
		ShiftForEmployeeAPIModel shiftAPI = new ShiftForEmployeeAPIModel();
		shiftAPI.setShiftCode(shiftEntity.getShiftCode());
		shiftAPI.setDay(shiftEntity.getDay());
		shiftAPI.setStartTime(shiftEntity.getStartTime());
		shiftAPI.setEndTime(shiftEntity.getEndTime());
		return shiftAPI;
	}

	public static ShiftEntity to_entity_model(ShiftForEmployeeAPIModel shiftAPI) {
		ShiftEntity shiftEntity = new ShiftEntity();
		shiftEntity.setShiftCode(shiftAPI.getShiftCode());
		shiftEntity.setDay(shiftAPI.getDay());
		shiftEntity.setStartTime(shiftAPI.getStartTime());
		shiftEntity.setEndTime(shiftAPI.getEndTime());
		return shiftEntity;
	}
	
	public static List<ShiftForEmployeeAPIModel> to_API_model_list(List<ShiftEntity> listShiftEntity){
		List<ShiftForEmployeeAPIModel> listContactAPI = new ArrayList<ShiftForEmployeeAPIModel>(); 
		for (ShiftEntity shift : listShiftEntity) {
			listContactAPI.add(to_API_model(shift));
		}
		return listContactAPI;
	}
	
	public static List<ShiftEntity> to_entity_model_list(List<ShiftForEmployeeAPIModel> listContactAPIModel){
		List<ShiftEntity> listShiftEntity = new ArrayList<ShiftEntity>(); 
		for (ShiftForEmployeeAPIModel shift : listContactAPIModel) {
			listShiftEntity.add(to_entity_model(shift));
		}
		return listShiftEntity;
	}
}
