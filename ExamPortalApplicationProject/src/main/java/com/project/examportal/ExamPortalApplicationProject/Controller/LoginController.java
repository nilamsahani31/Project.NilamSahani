package com.project.examportal.ExamPortalApplicationProject.Controller;

import java.util.HashMap;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.examportal.ExamPortalApplicationProject.Model.Answer;
import com.project.examportal.ExamPortalApplicationProject.Model.User;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@RestController
@CrossOrigin("http://localhost:4200")
public class LoginController {
	@Autowired
	SessionFactory sf;
	static HttpSession httpsession;
	
	@PostMapping("validate")
	public Boolean save(@RequestBody User userfrombrowser , HttpServletRequest request) {
		
		System.out.println(userfrombrowser);
		
		Session openSession=sf.openSession();
		User userfromdatabase=openSession.get(User.class,userfrombrowser.getEmailid());
		
		System.out.println(userfromdatabase);
		
		boolean answer=userfrombrowser.equals(userfromdatabase);
		if (answer) {
			
			httpsession =request.getSession();
		    httpsession.setAttribute("score", 0);
		    httpsession.setAttribute("questionIndex", 0);
		    
		    HashMap<Integer, Answer> hashmap =new HashMap<>();
		    httpsession.setAttribute("submitedDetails", hashmap);
		    
		}
			
			return answer;

		}
		
	}


