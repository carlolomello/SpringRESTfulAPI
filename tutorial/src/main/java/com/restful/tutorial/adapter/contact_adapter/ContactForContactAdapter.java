package com.restful.tutorial.adapter.contact_adapter;


import java.util.ArrayList;
import java.util.List;

import com.restful.tutorial.api_model.contact_API_model.ContactForContactAPIModel;
import com.restful.tutorial.entity.ContactEntity;

public class ContactForContactAdapter {

	public static ContactForContactAPIModel to_API_model(ContactEntity contactEntity) {
		ContactForContactAPIModel contactAPI = new ContactForContactAPIModel();
		
		contactAPI.setName(contactEntity.getEmployee().getName());
		contactAPI.setSurname(contactEntity.getEmployee().getSurname());
		contactAPI.setCf(contactEntity.getCf());
		contactAPI.setKind(contactEntity.getKind());
		contactAPI.setValue(contactEntity.getValue());
		
		return contactAPI;
	}

	public static ContactEntity to_entity_model(ContactForContactAPIModel contactAPI) {
		ContactEntity contactEntity = new ContactEntity();
		
		contactEntity.setCf(contactAPI.getCf());
		contactEntity.setKind(contactAPI.getKind());
		contactEntity.setValue(contactAPI.getValue());
		
		return contactEntity;
	}
	

	public static List<ContactForContactAPIModel> to_API_model_list(List<ContactEntity> listContactEntity){
		List<ContactForContactAPIModel> listContactAPI = new ArrayList<ContactForContactAPIModel>(); 
		for (ContactEntity contact : listContactEntity) {
			listContactAPI.add(to_API_model(contact));
		}
		return listContactAPI;
	}
	
	public static List<ContactEntity> to_entity_model_list(List<ContactForContactAPIModel> listContactForContactAPIModel){
		List<ContactEntity> listContactEntity = new ArrayList<ContactEntity>(); 
		for (ContactForContactAPIModel contact : listContactForContactAPIModel) {
			listContactEntity.add(to_entity_model(contact));
		}
		return listContactEntity;
	}

}
