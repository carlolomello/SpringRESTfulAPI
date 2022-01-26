package com.restful.tutorial.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restful.tutorial.entity.ContactEntity;
import com.restful.tutorial.entity.contact_key.ContactKey;
import com.restful.tutorial.repository.ContactRepository;

@Service
@Transactional
public class ContactService {
	@Autowired
private ContactRepository contactRepository;
	
	public List<ContactEntity> findAllC() {
        return contactRepository.findAll();
    }
     
    public ContactEntity saveC(ContactEntity contactEntity) {
    	return contactRepository.save(contactEntity);
    }
    
    public void deleteById(ContactKey id) {
    	contactRepository.deleteById(id);
   }
   
   public ContactEntity getById(ContactKey id) {
   	return contactRepository.findById(id).get();
   }
}
