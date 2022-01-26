package com.restful.tutorial.adapter;

import java.util.ArrayList;
import java.util.List;

import com.restful.tutorial.api_model.ShiftAPIModel;
import com.restful.tutorial.entity.ShiftEntity;

public class ShiftAdapter {

	public static ShiftAPIModel to_API_model(ShiftEntity shiftEntity) {
		ShiftAPIModel shiftAPI = new ShiftAPIModel();
		shiftAPI.setShiftCode(shiftEntity.getShiftCode());
		shiftAPI.setDay(shiftEntity.getDay());
		shiftAPI.setStartTime(shiftEntity.getStartTime());
		shiftAPI.setEndTime(shiftEntity.getEndTime());
		return shiftAPI;
	}

	public static ShiftEntity to_entity_model(ShiftAPIModel shiftAPI) {
		ShiftEntity shiftEntity = new ShiftEntity();
		shiftEntity.setShiftCode(shiftAPI.getShiftCode());
		shiftEntity.setDay(shiftAPI.getDay());
		shiftEntity.setStartTime(shiftAPI.getStartTime());
		shiftEntity.setEndTime(shiftAPI.getEndTime());
		return shiftEntity;
	}
	
	public static List<ShiftAPIModel> to_API_model_list(List<ShiftEntity> listShiftEntity){
		List<ShiftAPIModel> listShiftAPI = new ArrayList<ShiftAPIModel>(); 
		for (ShiftEntity shift : listShiftEntity) {
			listShiftAPI.add(to_API_model(shift));
		}
		return listShiftAPI;
	}
	
	public static List<ShiftEntity> to_entity_model_list(List<ShiftAPIModel> listShiftAPIModel){
		List<ShiftEntity> listShiftEntity = new ArrayList<ShiftEntity>(); 
		for (ShiftAPIModel shift : listShiftAPIModel) {
			listShiftEntity.add(to_entity_model(shift));
		}
		return listShiftEntity;
	}
}
