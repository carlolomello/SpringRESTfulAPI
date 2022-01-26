package com.restful.tutorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restful.tutorial.entity.ContactEntity;
import com.restful.tutorial.entity.contact_key.ContactKey;

public interface ContactRepository extends JpaRepository<ContactEntity, ContactKey>{

}
