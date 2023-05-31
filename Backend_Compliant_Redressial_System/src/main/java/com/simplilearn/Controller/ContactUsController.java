package com.simplilearn.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.Entity.ContactUs;
import com.simplilearn.Service.ContactUsServiceImpl;

@RestController
public class ContactUsController {
	
	@Autowired
	ContactUsServiceImpl contactUsServiceImpl;
	
	@PostMapping("/contactUs")
	public ContactUs contactUs(@RequestBody ContactUs contactUs) {
		return contactUsServiceImpl.contactUs(contactUs);
	}
	
	

}
