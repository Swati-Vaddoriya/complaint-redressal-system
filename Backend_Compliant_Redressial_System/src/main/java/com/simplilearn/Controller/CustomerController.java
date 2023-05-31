package com.simplilearn.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.Entity.Customer;
import com.simplilearn.Service.CustomerServiceImpl;

@RestController
public class CustomerController {
     
	@Autowired
	CustomerServiceImpl customerServiceImpl;
	
	@GetMapping("/customer/{name}/{password}")
	Optional<Customer> customerLogin(@PathVariable(value="name") String name,@PathVariable(value="password") String password) {
		return customerServiceImpl.findByNameAndPassword(name, password);
	}
	
	@PostMapping("/customer")
	Customer signUp(@RequestBody Customer customer) {
	 return	customerServiceImpl.signUp(customer);
	}
	
	@GetMapping("/customer")
	List<Customer> getAllCustomers(){
		return customerServiceImpl.GetAllCustomers();
	}
	
	@DeleteMapping("/customer/{id}")
	String deleteById(@PathVariable(value="id") int id) {
		customerServiceImpl.deleteCustomerById(id);
		return "deletedSuccessfully";
	}
	
	
	
}
