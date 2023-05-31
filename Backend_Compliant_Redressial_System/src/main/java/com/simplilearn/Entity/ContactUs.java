package com.simplilearn.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ContactUs {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	
	String fullName;
	
	long MobileNumber;
	
	String email;

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
		return MobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		MobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public ContactUs() {
		super();
	}

	@Override
	public String toString() {
		return "ContactUs [id=" + id + ", fullName=" + fullName + ", MobileNumber=" + MobileNumber + ", email=" + email
				+ "]";
	}
	
	
	

}
