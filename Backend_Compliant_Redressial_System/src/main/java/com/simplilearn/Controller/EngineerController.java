package com.simplilearn.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.Entity.Engineer;
import com.simplilearn.Service.EngineerServiceImpl;

@RestController
public class EngineerController {
	
	@Autowired
	EngineerServiceImpl engineerServiceImpl;
	
	@GetMapping("/engineer")
	public List<Engineer> viewAllEngineers(){
	return	engineerServiceImpl.viewAllEngineers();
	}
	
	@GetMapping("/engineer/{username}/{password}")
	public Engineer engineerLogin(@PathVariable(value="username") String username,@PathVariable (value="password") String password) {
		return engineerServiceImpl.engineerLogin(username, password);
	}
	
	@PostMapping("/engineer")
	public Engineer signUp(@RequestBody Engineer engineer) {
		return engineerServiceImpl.engineerSignUp(engineer);
	}
	
	@DeleteMapping("/engineer/{id}")
	public String deleteEngineerById(@PathVariable(value="id") int id) {
		engineerServiceImpl.deleteEngineerById(id);
		return "deletedSuccessfully";
	}
	

}
