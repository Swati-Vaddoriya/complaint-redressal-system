package com.simplilearn.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.Entity.Engineer;
import com.simplilearn.Repository.EngineerRepo;

@Service
public class EngineerServiceImpl implements EngineerService{
	@Autowired
	EngineerRepo engineerRepo;

	@Override
	public List<Engineer> viewAllEngineers() {
		
		return engineerRepo.findAll();
	}

	@Override
	public Engineer engineerLogin(String name, String password) {
		
		return engineerRepo.findByFullNameAndPass(name, password);
	}

	@Override
	public Engineer engineerSignUp(Engineer engineer) {
		
		return engineerRepo.save(engineer);
	}

	@Override
	public void deleteEngineerById(int id) {
		engineerRepo.deleteById(id);
		
	}

}
