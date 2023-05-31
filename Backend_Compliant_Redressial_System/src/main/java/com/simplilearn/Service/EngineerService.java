package com.simplilearn.Service;

import java.util.List;

import com.simplilearn.Entity.Engineer;

public interface EngineerService {
	
	public List<Engineer> viewAllEngineers();
	
	public Engineer engineerLogin(String name,String password);
	
	public Engineer engineerSignUp(Engineer engineer);
	
	public void deleteEngineerById(int id);

}
