package com.ahmedeid.hibernatedemo.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Students {

	@Id
	@Column(name = "student_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String full_name;
	private String gender;
	private Date date_of_birth;
	private String address;
	private String email;
	private String password;
	private String school_id;

	@ManyToOne
	School school = new School();

	public Students() {
		super();
	}

	public Students(String full_name, String gender, Date date_of_birth, String address, String email,
			String password) {
		super();
		this.full_name = full_name;
		this.gender = gender;
		this.date_of_birth = date_of_birth;
		this.address = address;
		this.email = email;
		this.password = password;
	}

	public Students(String full_name, String gender, Date date_of_birth, String address, String email, String password,
			String school_id) {
		super();
		this.full_name = full_name;
		this.gender = gender;
		this.date_of_birth = date_of_birth;
		this.address = address;
		this.email = email;
		this.password = password;
		this.school_id = school_id;
	}

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFull_name() {
		return full_name;
	}

	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSchool_id() {
		return school_id;
	}

	public void setSchool_id(String school_id) {
		this.school_id = school_id;
	}

	@Override
	public String toString() {
		return "Students [id=" + id + ", full_name=" + full_name + ", gender=" + gender + ", date_of_birth="
				+ date_of_birth + ", address=" + address + ", email=" + email + ", password=" + password
				+ ", school_id=" + school_id + "]";
	}

}
