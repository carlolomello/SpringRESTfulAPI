package com.restful.tutorial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restful.tutorial.api_model.EmployeeAPIModel;
import com.restful.tutorial.api_model.employee_API_model.get_API_model.responce.ResponceShiftAssignmentAPIModel;
import com.restful.tutorial.api_model.employee_API_model.get_API_model.responce.ResponceTaskAssignmentAPIModel;
import com.restful.tutorial.api_model.employee_API_model.post_API_model.RequestSaveEmployeeAPIModel;
import com.restful.tutorial.api_model.employee_API_model.post_API_model.RequestShiftAssignmentAPIModel;
import com.restful.tutorial.api_model.employee_API_model.post_API_model.RequestTaskAssignmentAPIModel;
import com.restful.tutorial.service_operation.EmployeeServiceOperation;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeServiceOperation empOp;

    @GetMapping("/employee_list")
    public List<EmployeeAPIModel> list() {
    	return empOp.getEmployeeList();
    }
    
    @PostMapping("/save_employee")
    public RequestSaveEmployeeAPIModel saveE(@RequestBody RequestSaveEmployeeAPIModel employeeAPI) {
		return  empOp.saveEmployee(employeeAPI);
    }
    
    @DeleteMapping("/delete_employee")
    public void deleteById(@RequestBody String cf) {
    	empOp.deleteById(cf);
    }
    
    @GetMapping("/employee_by_cf")
    public EmployeeAPIModel getById(String cf) {
    	return empOp.getById(cf);
    }
    
    @PutMapping("update_employee")
    public RequestSaveEmployeeAPIModel updateEmployee(@RequestBody RequestSaveEmployeeAPIModel employeeAPI) {
    	return empOp.updateEmployee(employeeAPI);
    }
    
    //Assegna Task
    @PostMapping("/task_assignment")
    public ResponceTaskAssignmentAPIModel taskAssignment(@RequestBody RequestTaskAssignmentAPIModel taskAssignment) {
    	return empOp.taskAssignment(taskAssignment);
    }
    
    //Assegna Shift
    @PostMapping("/shift_assignment")
    public ResponceShiftAssignmentAPIModel shiftAssignment(@RequestBody RequestShiftAssignmentAPIModel shiftAssignment) {
    	return empOp.shiftAssignment(shiftAssignment);
    }
    
    
}
