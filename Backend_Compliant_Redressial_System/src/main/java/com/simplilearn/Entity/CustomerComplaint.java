package com.simplilearn.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CustomerComplaint {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
    
	String fullName;
	
	long phoneNumber;
	
	String email;
	
	String city;
	
	int pincode;
	
	String additionalDetails;

	public String getAdditionalDetails() {
		return additionalDetails;
	}

	public void setAdditionalDetails(String additionalDetails) {
		this.additionalDetails = additionalDetails;
	}

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

	public CustomerComplaint() {
		super();
	}

	@Override
	public String toString() {
		return "CustomerComplaint [id=" + id + ", fullName=" + fullName + ", phoneNumber=" + phoneNumber + ", email="
				+ email + ", city=" + city + ", pincode=" + pincode + "]";
	}
	
	
}
