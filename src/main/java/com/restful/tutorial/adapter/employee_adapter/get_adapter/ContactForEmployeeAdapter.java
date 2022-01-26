package com.restful.tutorial.adapter.employee_adapter.get_adapter;

import java.util.ArrayList;
import java.util.List;

import com.restful.tutorial.api_model.employee_API_model.get_API_model.ContactForEmployeeAPIModel;
import com.restful.tutorial.entity.ContactEntity;

public class ContactForEmployeeAdapter {

	public static ContactForEmployeeAPIModel to_API_model(ContactEntity contactEntity) {
		ContactForEmployeeAPIModel contactAPI = new ContactForEmployeeAPIModel();
		contactAPI.setKind(contactEntity.getKind());
		contactAPI.setValue(contactEntity.getValue());
		return contactAPI;
	}

	public static ContactEntity to_entity_model(ContactForEmployeeAPIModel contactAPI) {
		ContactEntity contactEntity = new ContactEntity();
		contactEntity.setKind(contactAPI.getKind());
		contactEntity.setValue(contactAPI.getValue());
		return contactEntity;
	}
	
	public static List<ContactForEmployeeAPIModel> to_API_model_list(List<ContactEntity> listContactEntity){
		List<ContactForEmployeeAPIModel> listContactAPI = new ArrayList<ContactForEmployeeAPIModel>(); 
		for (ContactEntity contact : listContactEntity) {
			listContactAPI.add(to_API_model(contact));
		}
		return listContactAPI;
	}
	
	public static List<ContactEntity> to_entity_model_list(List<ContactForEmployeeAPIModel> listContactAPIModel){
		List<ContactEntity> listContactEntity = new ArrayList<ContactEntity>(); 
		for (ContactForEmployeeAPIModel contact : listContactAPIModel) {
			listContactEntity.add(to_entity_model(contact));
		}
		return listContactEntity;
	}
	
}
