package com.restful.tutorial.service_operation;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restful.tutorial.adapter.ContactKeyAdapter;
import com.restful.tutorial.adapter.contact_adapter.get_adapter.ContactForContactAdapter;
import com.restful.tutorial.adapter.contact_adapter.post_adapter.RequestSaveContactAdapter;
import com.restful.tutorial.api_model.ContactKeyAPIModel;
import com.restful.tutorial.api_model.contact_API_model.get_API_model.ContactForContactAPIModel;
import com.restful.tutorial.api_model.contact_API_model.post_API_model.RequestSaveContactAPIModel;
import com.restful.tutorial.entity.ContactEntity;
import com.restful.tutorial.service.ContactService;

@Service
public class ContactServiceOperation {
	@Autowired
    private ContactService service;
	 
	public List<ContactForContactAPIModel> getContactList() {
		return ContactForContactAdapter.to_API_model_list(service.findAllC());
	}
	
	@SuppressWarnings("null")
	public ContactForContactAPIModel getById(ContactKeyAPIModel id) {
		
		ContactEntity contactEntity = service.getById(ContactKeyAdapter.to_entity_model(id));
		
		if(contactEntity!=null)
			return ContactForContactAdapter.to_API_model(contactEntity);
		else
    		throw new NoSuchElementException(" ERROR: contact "+contactEntity.getCf()+" not foud"); 	
	}
	
	public void deleteById(ContactKeyAPIModel id){
		service.deleteById(ContactKeyAdapter.to_entity_model(id));
	}
	
	
	public RequestSaveContactAPIModel saveContact(RequestSaveContactAPIModel contact) {
		return RequestSaveContactAdapter.to_API_model(service.saveC(RequestSaveContactAdapter.to_entity_model(contact)));
	}
}
