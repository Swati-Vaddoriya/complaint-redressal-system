package com.simplilearn.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.Entity.CustomerComplaint;
import com.simplilearn.Service.CustomerComplaintServiceImp;

@RestController
public class CustomerComplaintController {
	
	@Autowired
	CustomerComplaintServiceImp complaintServiceImp;
	
	@PostMapping("/customerComplaint")
	public CustomerComplaint raiseComplaint(@RequestBody CustomerComplaint complaint) {
		return complaintServiceImp.raiseComplaint(complaint);
	}
	
	@GetMapping("/customerComplaint")
	public List<CustomerComplaint> viewComplaints(){
		return complaintServiceImp.viewComplaints();
	}
	
	@DeleteMapping("/customerComplaint")
	public String deleteCustomerComplaintsById(@PathVariable(value="id") int id) {
		complaintServiceImp.deleteComplaintsById(id);
		return "deletedSuccessfully";
	}
    

}
