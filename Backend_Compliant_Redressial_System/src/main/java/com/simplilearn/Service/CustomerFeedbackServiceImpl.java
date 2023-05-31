package com.simplilearn.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.Entity.CustomerFeedback;
import com.simplilearn.Repository.CustomerFeedbackRepo;

@Service
public class CustomerFeedbackServiceImpl implements CustomerFeedBackService{

	@Autowired
	CustomerFeedbackRepo customerFeedbackRepo;
	@Override
	public CustomerFeedback sendFeedback(CustomerFeedback customerFeedback) {
		
		return customerFeedbackRepo.save(customerFeedback);
		
		
	}

}
