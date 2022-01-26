package com.restful.tutorial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restful.tutorial.api_model.ShiftAPIModel;
import com.restful.tutorial.service_operation.ShiftServiceOperation;

@RestController
public class ShiftController {
	
	@Autowired
    private ShiftServiceOperation oprShift;

    @GetMapping("/shift_list")
    public List<ShiftAPIModel> list() {
        return oprShift.list();
    }
    
    @GetMapping("/shift_by_id")
    public ShiftAPIModel getById(String idShift) {
    	return oprShift.getById(idShift);
    }
    
    @PostMapping("/save_shift")
    public ShiftAPIModel saveShift(@RequestBody ShiftAPIModel apiModel) {
    	return oprShift.saveShift(apiModel);
    }
    
    @PutMapping("/update_shift")
    public ShiftAPIModel updateShift(@RequestBody  ShiftAPIModel apiModel) {
    	return oprShift.updateShift(apiModel);
    }
    
    @DeleteMapping("/delite_shift")
    public void deleteById(@RequestBody String idShift) {
    	 oprShift.deleteById(idShift);
    }
    
}
