package com.simplilearn.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Engineer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	
	String fullName;
	
	long mobileNumber;
	
	String email;
	
	String pass;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public Engineer() {
		super();
	}

	@Override
	public String toString() {
		return "Engineer [id=" + id + ", fullName=" + fullName + ", mobileNumber=" + mobileNumber + ", email=" + email
				+ ", pass=" + pass + "]";
	}
	
	

}
