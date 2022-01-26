package com.restful.tutorial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restful.tutorial.api_model.ContactKeyAPIModel;
import com.restful.tutorial.api_model.contact_API_model.get_API_model.ContactForContactAPIModel;
import com.restful.tutorial.api_model.contact_API_model.post_API_model.RequestSaveContactAPIModel;
import com.restful.tutorial.service_operation.ContactServiceOperation;

@RestController
public class ContactController {
	
	@Autowired
    private ContactServiceOperation cntOp;
	
	@GetMapping("/contact_list")
    public List<ContactForContactAPIModel> list() {
        return cntOp.getContactList();
    }
    
    
    @DeleteMapping("/delete_contact")
    public void deleteById(@RequestBody ContactKeyAPIModel id) {
    	cntOp.deleteById(id);
    }
    
    @PostMapping("/insert_contact")
    public RequestSaveContactAPIModel saveC(@RequestBody RequestSaveContactAPIModel contactAPI){
    	return cntOp.saveContact(contactAPI);
    }
}
