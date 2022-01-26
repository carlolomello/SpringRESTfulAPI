package com.restful.tutorial.adapter.contact_adapter.post_adapter;

import java.util.ArrayList;
import java.util.List;

import com.restful.tutorial.api_model.contact_API_model.post_API_model.RequestSaveContactAPIModel;
import com.restful.tutorial.entity.ContactEntity;

public class RequestSaveContactAdapter {

	public static RequestSaveContactAPIModel to_API_model(ContactEntity ContactEntity) {
		RequestSaveContactAPIModel contactAPI = new RequestSaveContactAPIModel();
		
		contactAPI.setCf(ContactEntity.getCf());
		contactAPI.setKind(ContactEntity.getKind());
		contactAPI.setValue(ContactEntity.getValue());
		
		return contactAPI;
	}

	public static ContactEntity to_entity_model(RequestSaveContactAPIModel contactAPI) {
		ContactEntity ContactEntity = new ContactEntity();
		
		ContactEntity.setCf(contactAPI.getCf());
		ContactEntity.setKind(contactAPI.getKind());
		ContactEntity.setValue(contactAPI.getValue());
		
		return ContactEntity;
	}
	

	public static List<RequestSaveContactAPIModel> to_API_model_list(List<ContactEntity> listContactEntity){
		List<RequestSaveContactAPIModel> listContactAPI = new ArrayList<RequestSaveContactAPIModel>(); 
		for (ContactEntity contact : listContactEntity) {
			listContactAPI.add(to_API_model(contact));
		}
		return listContactAPI;
	}
	
	public static List<ContactEntity> to_entity_model_list(List<RequestSaveContactAPIModel> listRequestSaveContactAPIModel){
		List<ContactEntity> listContactEntity = new ArrayList<ContactEntity>(); 
		for (RequestSaveContactAPIModel contact : listRequestSaveContactAPIModel) {
			listContactEntity.add(to_entity_model(contact));
		}
		return listContactEntity;
	}
}
