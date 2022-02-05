package com.restful.tutorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restful.tutorial.entity.ContactEntity;
import com.restful.tutorial.entity.contact_key.ContactKey;

@Repository
public interface ContactRepository extends JpaRepository<ContactEntity, ContactKey>{

}
