package com.restful.tutorial.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restful.tutorial.entity.ShiftEntity;
import com.restful.tutorial.repository.ShiftRepository;


@Service
@Transactional
public class ShiftService {
	
	@Autowired
    private ShiftRepository shiftRepository;
	
	public List<ShiftEntity> findAllS() {
        return shiftRepository.findAll();
    }
     
    public ShiftEntity saveS(ShiftEntity shiftEntity) {
    	return shiftRepository.save(shiftEntity);
    }
    
    public ShiftEntity getById(String id) {
    	return shiftRepository.findById(id).get();
    }

    public void delteShiftById(String id) {
    	shiftRepository.deleteById(id);
    }
    
}
