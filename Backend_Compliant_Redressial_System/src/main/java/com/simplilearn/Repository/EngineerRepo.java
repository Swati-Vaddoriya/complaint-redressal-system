package com.simplilearn.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplilearn.Entity.Engineer;

public interface EngineerRepo extends JpaRepository<Engineer, Integer>{
	
	public Engineer findByFullNameAndPass(String name,String password);
	

}
