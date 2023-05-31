package com.simplilearn.Service;

import java.util.List;
import java.util.Optional;

import com.simplilearn.Entity.Manager;

public interface ManagerService {

	public Manager signUp(Manager manager);
	
	public Optional<Manager> loginForManager(String name,String pass);
	
	public List<Manager> viewmanagers();
	
	public void deleteManagerById(int id);
}
