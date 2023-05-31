package com.simplilearn.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplilearn.Entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer>{
	
public	Optional<Customer> findByCustomerFullNameAndCustomerPass(String name,String password);

}
