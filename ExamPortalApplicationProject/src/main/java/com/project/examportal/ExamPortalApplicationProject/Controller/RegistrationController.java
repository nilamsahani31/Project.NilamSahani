package com.project.examportal.ExamPortalApplicationProject.Controller;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.examportal.ExamPortalApplicationProject.Model.User;

@RestController
public class RegistrationController {
	
	@Autowired
	 SessionFactory sf;
	
	@PostMapping("saveRegisterData")
	public User saveregisterdata(@RequestBody User registration)
	{
		Session openSession = sf.openSession();	
		Transaction beginTransaction = openSession.beginTransaction();
		openSession.save(registration);
		beginTransaction.commit();
		return registration;
	}

}
