package com.restful.tutorial.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="task")
public class TaskEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_task")
	private int idTask;
	@Column(name="description")
	private String description;
	@Column(name="deadline")
	private Date deadline;
	
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    @JoinTable(
            name = "task_assignment",
            joinColumns = {@JoinColumn(name = "id_task")},
            inverseJoinColumns = {@JoinColumn(name = "cf")} 
    )
	private Set<EmployeeEntity> employeeList = new HashSet<EmployeeEntity>();

	public int getIdTask() {
		return idTask;
	}

	public void setIdTask(int idTask) {
		this.idTask = idTask;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDeadline() {
		return deadline;
	}

	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}

	public Set<EmployeeEntity> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(Set<EmployeeEntity> employeeList) {
		this.employeeList = employeeList;
	}


	
}
