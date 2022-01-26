package com.restful.tutorial.adapter;

import java.util.ArrayList;
import java.util.List;

import com.restful.tutorial.adapter.contact_adapter.get_adapter.EmployeeForContactAdapter;
import com.restful.tutorial.api_model.ContactAPIModel;
import com.restful.tutorial.entity.ContactEntity;

public class ContactAdapter {
	
	public static ContactAPIModel to_API_model(ContactEntity contactEntity) {
		ContactAPIModel contactAPI = new ContactAPIModel();
		contactAPI.setKind(contactEntity.getKind());
		contactAPI.setValue(contactEntity.getValue());
		//contactAPI.setCf(contactEntity.getCf());
		if(contactEntity.getEmployee() != null) {
			contactAPI.setEmployee(EmployeeForContactAdapter.to_API_model(contactEntity.getEmployee()));
		}
		return contactAPI;
	}

	public static ContactEntity to_entity_model(ContactAPIModel contactAPI) {
		ContactEntity contactEntity = new ContactEntity();
		contactEntity.setKind(contactAPI.getKind());
		contactEntity.setValue(contactAPI.getValue());
		//contactEntity.setCf(contactAPI.getCf());
		contactEntity.setEmployee(EmployeeForContactAdapter.to_entity_model(contactAPI.getEmployee()));
		return contactEntity;
	}
	
	public static List<ContactAPIModel> to_API_model_list(List<ContactEntity> listContactEntity){
		List<ContactAPIModel> listContactAPI = new ArrayList<ContactAPIModel>(); 
		for (ContactEntity Contact : listContactEntity) {
			listContactAPI.add(to_API_model(Contact));
		}
		return listContactAPI;
	}
	
	public static List<ContactEntity> to_entity_model_list(List<ContactAPIModel> listContactAPIModel){
		List<ContactEntity> listContactEntity = new ArrayList<ContactEntity>(); 
		for (ContactAPIModel contact : listContactAPIModel) {
			listContactEntity.add(to_entity_model(contact));
		}
		return listContactEntity;
	}
}
