package com.simplilearn.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.Entity.Manager;
import com.simplilearn.Repository.ManagerRepo;

@Service
public class ManagerServiceImpl implements ManagerService{

	@Autowired
	ManagerRepo managerRepo;
	@Override
	public Manager signUp(Manager manager) {
		
		return managerRepo.save(manager);
	}

	@Override
	public Optional<Manager> loginForManager(String name, String pass) {
		
		
		return managerRepo.findByFullNameAndPass(name, pass);
		
	}

	@Override
	public List<Manager> viewmanagers() {
		
		return managerRepo.findAll();
	}

	@Override
	public void deleteManagerById(int id) {
		managerRepo.deleteById(id);
		
	}
	
	
}
