package com.restful.tutorial.service_operation;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restful.tutorial.adapter.ShiftAdapter;
import com.restful.tutorial.api_model.ShiftAPIModel;
import com.restful.tutorial.entity.ShiftEntity;
import com.restful.tutorial.service.ShiftService;

@Service
public class ShiftServiceOperation {
	
	@Autowired
    private ShiftService service;

    public List<ShiftAPIModel> list() {
        return ShiftAdapter.to_API_model_list(service.findAllS());
    }
    
    
    public ShiftAPIModel saveShift(ShiftAPIModel apiModel ) {
    	
    	ShiftEntity shiftEntity = ShiftAdapter.to_entity_model(apiModel);
    	
    	 return ShiftAdapter.to_API_model(service.saveS(shiftEntity));
    	
    }
    
    public ShiftAPIModel getById(String idShift) {
    	ShiftEntity entity =  service.getById(idShift);
    	
    	if(entity!=null) {
    		return ShiftAdapter.to_API_model(entity);
    	}
    	
    	throw new NoSuchElementException(" ERROR: shift "+idShift+" not foud"); 
    	
    }
    
    public ShiftAPIModel updateShift(ShiftAPIModel apiModel) {
      	
    	if(service.getById(apiModel.getShiftCode()) != null) {
			return this.saveShift(apiModel);
		}
		throw new NoSuchElementException(" ERROR: shift "+apiModel.getShiftCode()+" not foud"); 
  
    }
    
	public void deleteById(String idShift) {
		if(service.getById(idShift) != null) {
			service.delteShiftById(idShift);
		} else {
			throw new NoSuchElementException(" ERROR: shift "+idShift+" not foud"); 
		}
	}
    
    

}
