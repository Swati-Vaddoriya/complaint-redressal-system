package com.simplilearn.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CustomerLogin")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private	int customerId;
	
    private	 String customerFullName;
    
    private long mobileNumber;
	
    private	String customerPass;

    private String customerEmail;




public int getCustomerId() {
		return customerId;
	}




	







	public long getMobileNumber() {
	return mobileNumber;
}












public void setMobileNumber(long mobileNumber) {
	this.mobileNumber = mobileNumber;
}












	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}




	public String getCustomerFullName() {
		return customerFullName;
	}




	public void setCustomerFullName(String customerFullName) {
		this.customerFullName = customerFullName;
	}




	public String getCustomerPass() {
		return customerPass;
	}




	public void setCustomerPass(String customerPass) {
		this.customerPass = customerPass;
	}




	public String getCustomerEmail() {
		return customerEmail;
	}




	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}




public Customer() {
	super();
}




@Override
public String toString() {
	return "Customer [customerId=" + customerId + ", customerFullName=" + customerFullName + ", mobileNumber="
			+ mobileNumber + ", customerPass=" + customerPass + ", customerEmail=" + customerEmail + "]";
}








	
	

}
