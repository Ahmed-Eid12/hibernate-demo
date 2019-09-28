package com.ahmedeid.hibernatedemo.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class School {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "school_id")
	private int id;

	private String school_name;
	private String address;
	private String email;

	@OneToMany(mappedBy = "school")
	List<Students> student = new ArrayList<Students>();

	public School() {
		super();
	}

	public School(String school_name, String address, String email, List<Students> student) {
		super();
		this.school_name = school_name;
		this.address = address;
		this.email = email;
		this.student = student;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSchool_name() {
		return school_name;
	}

	public void setSchool_name(String school_name) {
		this.school_name = school_name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Students> getStudent() {
		return student;
	}

	public void setStudent(List<Students> student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "School [id=" + id + ", school_name=" + school_name + ", address=" + address + ", email=" + email
				+ ", student=" + student + "]";
	}

}
