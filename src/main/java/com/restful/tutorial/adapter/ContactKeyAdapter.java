package com.restful.tutorial.adapter;

import java.util.ArrayList;
import java.util.List;

import com.restful.tutorial.api_model.ContactKeyAPIModel;
import com.restful.tutorial.entity.contact_key.ContactKey;

public class ContactKeyAdapter {

	public static ContactKeyAPIModel to_API_model(ContactKey contactKey) {
		ContactKeyAPIModel contactAPI = new ContactKeyAPIModel();
		contactAPI.setCf(contactKey.getCf());
		contactAPI.setKind(contactKey.getKind());
		contactAPI.setValue(contactKey.getValue());
		return contactAPI;
	}

	public static ContactKey to_entity_model(ContactKeyAPIModel contactAPI) {
		ContactKey contactKey = new ContactKey();
		contactKey.setCf(contactAPI.getCf());
		contactKey.setKind(contactAPI.getKind());
		contactKey.setValue(contactAPI.getValue());
		return contactKey;
	}
	
	public static List<ContactKeyAPIModel> to_API_model_list(List<ContactKey> listContactKey){
		List<ContactKeyAPIModel> listContactAPI = new ArrayList<ContactKeyAPIModel>(); 
		for (ContactKey contact : listContactKey) {
			listContactAPI.add(to_API_model(contact));
		}
		return listContactAPI;
	}
	
	public static List<ContactKey> to_entity_model_list(List<ContactKeyAPIModel> listContactKeyAPIModel){
		List<ContactKey> listContactKey = new ArrayList<ContactKey>(); 
		for (ContactKeyAPIModel contact : listContactKeyAPIModel) {
			listContactKey.add(to_entity_model(contact));
		}
		return listContactKey;
	}
	
}
