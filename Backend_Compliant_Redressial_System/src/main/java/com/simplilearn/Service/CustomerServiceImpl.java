package com.simplilearn.Service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.Entity.Customer;
import com.simplilearn.Repository.CustomerRepo;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	CustomerRepo customerRepo;

	

	@Override
	public Optional<Customer> findByNameAndPassword(String name, String password) {
	return customerRepo.findByCustomerFullNameAndCustomerPass(name, password);
	
		
	}



	@Override
	public Customer signUp(Customer customer) {
		
		return customerRepo.save(customer);
	}



	@Override
	public List<Customer> GetAllCustomers() {
		
		return customerRepo.findAll();
	}



	@Override
	public void deleteCustomerById(Integer id) {
		customerRepo.deleteById(id);
		
	}

}
