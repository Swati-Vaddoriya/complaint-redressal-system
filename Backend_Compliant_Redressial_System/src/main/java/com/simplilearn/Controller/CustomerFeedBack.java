package com.simplilearn.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.Entity.CustomerFeedback;
import com.simplilearn.Service.CustomerFeedbackServiceImpl;

@RestController
public class CustomerFeedBack {
	
	@Autowired
	CustomerFeedbackServiceImpl customerFeedbackServiceImpl;
	
	@PostMapping("/customerFeedback")
	public CustomerFeedback sendFeedBack(@RequestBody CustomerFeedback customerFeedBack) {
		return customerFeedbackServiceImpl.sendFeedback(customerFeedBack);
	}

}
