package com.simplilearn.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CustomerFeedback {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	
	String fullName;
	
	long phoneNumber;
	
	String email;
	
	String city;
	
	int pincode;

	String feedback;

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

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public CustomerFeedback() {
		super();
	}

	@Override
	public String toString() {
		return "CustomerFeedback [id=" + id + ", fullName=" + fullName + ", phoneNumber=" + phoneNumber + ", email="
				+ email + ", city=" + city + ", pincode=" + pincode + ", feedback=" + feedback + "]";
	}
	
	

}
