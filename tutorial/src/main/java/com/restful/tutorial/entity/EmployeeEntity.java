package com.restful.tutorial.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
@Table(name = "employee")
public class EmployeeEntity {

		@Id
		@Column(name = "cf")
		private String cf;
		@Column(name = "name")
		private String name;
		@Column(name = "surname")
		private String surname;
		@Column(name = "date")
		private Date date;
		@Column(name = "place")
		private String place;
		
		
		@OneToMany(fetch = FetchType.LAZY, 
				targetEntity = ContactEntity.class, 
				cascade = CascadeType.ALL, 
				mappedBy = "employee")
		private List<ContactEntity> contactList = new ArrayList<ContactEntity>();
		
		@ManyToOne(fetch = FetchType.LAZY, 
				cascade = CascadeType.PERSIST,
				targetEntity = RoleEntity.class)
		@JoinColumn(name="role_name")
		private RoleEntity role;
		
	    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	    @JoinTable(
	            name = "shift_assignment",
	            joinColumns = {@JoinColumn(name = "cf")},
	            inverseJoinColumns = {@JoinColumn(name = "shift_code")}
	    )
		private List<ShiftEntity> shiftList = new ArrayList<ShiftEntity>();

	    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	    @JoinTable(
	            name = "task_assignment",
	            joinColumns = {@JoinColumn(name = "cf")},
	            inverseJoinColumns = {@JoinColumn(name = "id_task")}
	    )
		private List<TaskEntity> taskList = new ArrayList<TaskEntity>();
	  

		public String getCf() {
			return cf;
		}

		public void setCf(String cf) {
			this.cf = cf;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getSurname() {
			return surname;
		}

		public void setSurname(String surname) {
			this.surname = surname;
		}

		public Date getDate() {
			return date;
		}

		public void setDate(Date date) {
			this.date = date;
		}

		public String getPlace() {
			return place;
		}

		public void setPlace(String place) {
			this.place = place;
		}

		public RoleEntity getRole() {
			return role;
		}

		public List<ContactEntity> getContactList() {
			return contactList;
		}

		public void setContactList(List<ContactEntity> contactList) {
			this.contactList = contactList;
		}

		public void setRole(RoleEntity role) {
			this.role = role;
		}

		public List<ShiftEntity> getShiftList() {
			return shiftList;
		}
		
		public void setShiftList(List<ShiftEntity> shiftList) {
			this.shiftList = shiftList;
		}

		public List<TaskEntity> getTaskList() {
			return taskList;
		}

		public void setTaskList(List<TaskEntity> taskList) {
			this.taskList = taskList;
		}

}
