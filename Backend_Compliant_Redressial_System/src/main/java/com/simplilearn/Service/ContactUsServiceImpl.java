package com.simplilearn.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.Entity.ContactUs;
import com.simplilearn.Repository.ContactUsRepo;

@Service
public class ContactUsServiceImpl implements ContactUsService{
 
	@Autowired
	ContactUsRepo contactUsRepo;
	@Override
	public ContactUs contactUs(ContactUs contactUs) {
		
		return contactUsRepo.save(contactUs);
	}

}
