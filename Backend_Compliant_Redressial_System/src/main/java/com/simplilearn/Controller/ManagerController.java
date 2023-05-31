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

import com.simplilearn.Entity.Manager;
import com.simplilearn.Service.ManagerServiceImpl;

@RestController
public class ManagerController {
	
	@Autowired
	ManagerServiceImpl impl;
	
	@GetMapping("/manager/{username}/{pass}")
	public Optional<Manager> managerLogin(@PathVariable(value="username") String username,@PathVariable(value="pass") String pass) {
		return impl.loginForManager(username, pass);
	}
	
	@PostMapping("/manager")
	public Manager managerSignup(@RequestBody Manager manager) {
		return impl.signUp(manager);
	}
	
	@GetMapping("/manager")
	public List<Manager> viewmanagers(){
		return impl.viewmanagers();
	}
	
	@DeleteMapping("/manager")
	public String deleteManagerById(@PathVariable(value="id") int id) {
		impl.deleteManagerById(id);
		return "managerDeletedSuccessfully";
	}

}
