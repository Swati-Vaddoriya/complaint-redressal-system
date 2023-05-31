package com.simplilearn.Service;

import java.util.List;
import java.util.Optional;

import com.simplilearn.Entity.Customer;

public interface CustomerService {
	
	public Optional<Customer> findByNameAndPassword(String name,String password);
	
	public Customer signUp(Customer customer);
	
	public List<Customer> GetAllCustomers();
	
	public void deleteCustomerById(Integer id);

}
