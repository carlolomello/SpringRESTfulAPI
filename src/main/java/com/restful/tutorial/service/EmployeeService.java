package com.restful.tutorial.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restful.tutorial.entity.EmployeeEntity;
import com.restful.tutorial.repository.EmployeeRepository;

@Service
@Transactional
public class EmployeeService {
	@Autowired
    private EmployeeRepository employeeRepository;

	public List<EmployeeEntity> findAllE() {
        return employeeRepository.findAll();
    }
     
    public EmployeeEntity saveE(EmployeeEntity employeeEntity) {
    	return employeeRepository.save(employeeEntity);
    }
    
    public void deleteById(String cf) {
    	 employeeRepository.deleteById(cf);
    }
    
    public EmployeeEntity getById(String cf) {
    	return employeeRepository.findById(cf).get();
    }
    
}
