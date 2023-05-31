package com.simplilearn.Service;

import java.util.List;

import com.simplilearn.Entity.CustomerComplaint;

public interface CustomerComplaintService {
	
	public CustomerComplaint raiseComplaint(CustomerComplaint complaint);
	
	public List<CustomerComplaint> viewComplaints();
	
	public void deleteComplaintsById(int id);

}
