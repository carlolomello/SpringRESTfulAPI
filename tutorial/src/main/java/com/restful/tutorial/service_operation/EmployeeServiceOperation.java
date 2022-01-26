package com.restful.tutorial.service_operation;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restful.tutorial.adapter.EmployeeAdapter;
import com.restful.tutorial.adapter.employee_adapter.post_adapter.RequestSaveEmployeeAdapter;
import com.restful.tutorial.adapter.employee_adapter.post_adapter.ResponceShiftAssignmentAdapter;
import com.restful.tutorial.adapter.employee_adapter.post_adapter.ResponceTaskAssignmentAdapter;
import com.restful.tutorial.api_model.EmployeeAPIModel;
import com.restful.tutorial.api_model.employee_API_model.get_API_model.responce.ResponceShiftAssignmentAPIModel;
import com.restful.tutorial.api_model.employee_API_model.get_API_model.responce.ResponceTaskAssignmentAPIModel;
import com.restful.tutorial.api_model.employee_API_model.post_API_model.RequestSaveEmployeeAPIModel;
import com.restful.tutorial.api_model.employee_API_model.post_API_model.RequestShiftAssignmentAPIModel;
import com.restful.tutorial.api_model.employee_API_model.post_API_model.RequestTaskAssignmentAPIModel;
import com.restful.tutorial.entity.EmployeeEntity;
import com.restful.tutorial.entity.RoleEntity;
import com.restful.tutorial.entity.ShiftEntity;
import com.restful.tutorial.entity.TaskEntity;
import com.restful.tutorial.service.EmployeeService;
import com.restful.tutorial.service.RoleService;
import com.restful.tutorial.service.ShiftService;
import com.restful.tutorial.service.TaskService;


@Service
public class EmployeeServiceOperation {
	
	@Autowired
	private EmployeeService employeeService;
	@Autowired
	private RoleService     roleService;
	@Autowired
	private TaskService     taskService;
	@Autowired
	private ShiftService    shiftService;
	
	public List<EmployeeAPIModel> getEmployeeList(){
		return EmployeeAdapter.to_API_model_list(employeeService.findAllE());
	}
	
	public RequestSaveEmployeeAPIModel saveEmployee(RequestSaveEmployeeAPIModel employeeAPI) {
		
		EmployeeEntity employeeEntity = RequestSaveEmployeeAdapter.to_entity_model(employeeAPI);
						
		RoleEntity roleE = roleService.findRole(employeeEntity.getRole().getRoleName());
		
    	if(roleE!=null) {
    		employeeEntity.setRole(roleE);
    		return  RequestSaveEmployeeAdapter.to_API_model(employeeService.saveE(employeeEntity));
    	}else
    		throw new NoSuchElementException(" ERROR: role "+employeeEntity.getRole().getRoleName()+" not foud"); 	
	}
	
	public RequestSaveEmployeeAPIModel updateEmployee(RequestSaveEmployeeAPIModel employeeAPI) {
		EmployeeEntity employeeFound =	 employeeService.getById(employeeAPI.getCf());
		if(employeeFound!=null) {
			EmployeeEntity employeeEntity = RequestSaveEmployeeAdapter.to_entity_model(employeeAPI);
			RoleEntity roleE = roleService.findRole(employeeEntity.getRole().getRoleName());
	    	if(roleE!=null) {
	    		employeeEntity.setRole(roleE);
	    		return  RequestSaveEmployeeAdapter.to_API_model(employeeService.saveE(employeeEntity));
	    	}else {
	    		throw new NoSuchElementException(" ERROR: role "+employeeEntity.getRole().getRoleName()+" not foud"); 	
	    	}
		}else {
			throw new NoSuchElementException(" ERROR: employee "+employeeAPI.getCf()+" not foud"); 	
		}
	}
	
	
	@SuppressWarnings("null")
	public EmployeeAPIModel getById(String cf) {
		
		EmployeeEntity employeeEntity = employeeService.getById(cf);
		if(employeeEntity!=null)
			return EmployeeAdapter.to_API_model(employeeEntity);
		else
    		throw new NoSuchElementException(" ERROR: employee "+employeeEntity.getCf()+" not foud"); 	
	}
	
	public void deleteById(String cf){
		employeeService.deleteById(cf);
	}
	
	
	public ResponceTaskAssignmentAPIModel taskAssignment(RequestTaskAssignmentAPIModel taskAssignmentAPIModel) {
		EmployeeEntity employee = employeeService.getById(taskAssignmentAPIModel.getCf());
		
		if(employee!=null) {
			TaskEntity task = taskService.getById(taskAssignmentAPIModel.getIdTask());
			if(task != null) {
				employee.getTaskList().add(task);
				employee = employeeService.saveE(employee);
				
				return ResponceTaskAssignmentAdapter.to_API_model(employee, task);
				
			}
			else
	    		throw new NoSuchElementException(" ERROR: task "+taskAssignmentAPIModel.getIdTask()+" not foud"); 	
 		}
		else
    		throw new NoSuchElementException(" ERROR: employee "+taskAssignmentAPIModel.getCf()+" not foud"); 	
	}
	
	public ResponceShiftAssignmentAPIModel shiftAssignment(RequestShiftAssignmentAPIModel shiftAssignmentAPIModel) {
		EmployeeEntity employee = employeeService.getById(shiftAssignmentAPIModel.getCf());
		
		if(employee!=null) {
			ShiftEntity shift = shiftService.getById(shiftAssignmentAPIModel.getShiftCode());
			if(shift != null) {
				employee.getShiftList().add(shift);
				employee = employeeService.saveE(employee);
				
				return ResponceShiftAssignmentAdapter.to_API_model(employee, shift);
				
			}
			else
	    		throw new NoSuchElementException(" ERROR: shift "+shiftAssignmentAPIModel.getShiftCode()+" not foud"); 	
 		}
		else
    		throw new NoSuchElementException(" ERROR: employee "+shiftAssignmentAPIModel.getCf()+" not foud"); 	
	}

}
