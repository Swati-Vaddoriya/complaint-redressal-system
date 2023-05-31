package com.simplilearn.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.Entity.CustomerComplaint;
import com.simplilearn.Repository.CustomerComplaintRepo;

@Service
public class CustomerComplaintServiceImp implements CustomerComplaintService{

	@Autowired
	CustomerComplaintRepo complaintRepo;
	@Override
	public CustomerComplaint raiseComplaint(CustomerComplaint complaint) {
		
		return complaintRepo.save(complaint);
	}
	@Override
	public List<CustomerComplaint> viewComplaints() {
		
		return complaintRepo.findAll();
	}
	@Override
	public void deleteComplaintsById(int id) {
		complaintRepo.deleteById(id);
		
	}

}
