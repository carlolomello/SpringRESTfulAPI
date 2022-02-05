package com.restful.tutorial.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="shift")
public class ShiftEntity {

	@Id
	@Column(name="shift_code")
	private String shiftCode;
	
	@Column(name="day")
	private String day;
	
	@Column(name="start_time")
	private int startTime;
	
	@Column(name="end_time")
	private int endTime;
	
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    @JoinTable(
            name = "shift_assignment",
            joinColumns = {@JoinColumn(name = "shift_code")},
            inverseJoinColumns = {@JoinColumn(name = "cf")} 
    )	
    private Set<EmployeeEntity> employeeList = new HashSet<EmployeeEntity>();

	public String getShiftCode() {
		return shiftCode;
	}

	public void setShiftCode(String shiftCode) {
		this.shiftCode = shiftCode;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public int getStartTime() {
		return startTime;
	}

	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}

	public int getEndTime() {
		return endTime;
	}

	public void setEndTime(int endTime) {
		this.endTime = endTime;
	}

	public Set<EmployeeEntity> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(Set<EmployeeEntity> employeeList) {
		this.employeeList = employeeList;
	}
	
}
