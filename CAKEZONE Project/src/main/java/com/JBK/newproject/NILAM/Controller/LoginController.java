package com.JBK.newproject.NILAM.Controller;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.JBK.newproject.NILAM.Model.Contact;
import com.JBK.newproject.NILAM.Model.Login;

import ch.qos.logback.core.model.Model;
import jakarta.transaction.Transaction;
import jakarta.websocket.Session;
                  // FE      -  BE   - DB   
@Controller      // Pages 6 - APIs 6 - Tables - 6
public class LoginController {

	@Autowired
	SessionFactory sf;
	
	//  login.jsp
	
	@RequestMapping("loginpage")
	public String loginpage() {
		return "login";
	}
	
	@RequestMapping("loginp")
	public String loginp(Login login , org.springframework.ui.Model model) {
		org.hibernate.Session openSession = sf.openSession();
		Login dlogin =  openSession.get(Login.class, login.getPassword());
		
		String page = "login";
		String msg = null;
		
		if(dlogin !=null) {
			if(login.getUsername().equals(dlogin.getUsername())) {
				msg="welcome";
				page="home";
			}else {
				msg = "Invalid U and P";
			}
		}else {
			msg = "Invalid U and P";
		}
		
	    model.addAttribute("msg", msg);
		return page;
	}
	
	//  createAccount.jsp
	
	@RequestMapping("createAccount")
	public String createAccount() {
		return "createaccount";
	}
	
	@RequestMapping("createaccountdata")
	public String createaccountdata(Login login) {
		org.hibernate.Session ss=sf.openSession();
		Login dlogin = ss.get(Login.class, login.getPassword());
		
		String page="login";
		String msg=null;
		
		if(dlogin != null) {
			if(login.getUsername().equals(dlogin.getUsername())) {
				msg="Already Register this U and P";
			}
		}else {
			org.hibernate.Transaction tt=ss.beginTransaction();
			ss.save(login);
			tt.commit();
		}
		return "createaccount";
	}
	
	// service.jsp
	
	@RequestMapping("servicepage")
	public String servicePage() {
		return "service";
	}
	
	//  about.jsp
	
	@RequestMapping("aboutpage")
	public String aboutPage() {
		return "about";
	}
	
	//  home.jsp
	
	@RequestMapping("homepage")
	public String homePage() {
		return "home";
	}
	
	//  contact.jsp
	
	@RequestMapping("contactpage")
	public String contactPage() {
		return "contact";
	}
	
	@RequestMapping("contactdata")
	public String contactdata(Contact contact) {
		org.hibernate.Session openSession = sf.openSession();
		org.hibernate.Transaction beginTransaction = openSession.beginTransaction();
		openSession.save(contact);
		beginTransaction.commit();
		return "contact";
		
//		Contact dlogin=ss.get(Contact.class, contact.getMobile());
//		String page="login";
//		String msg=null;
//		
//		if(dlogin != null) {
//			if(contact.getMobile().equals(dlogin.getMobile())) {
//			msg="Already Register this E and M";
//		}
//	}else {
//		org.hibernate.Transaction tt=ss.beginTransaction();
//		ss.save(contact);
//		tt.commit();
//	}
//		return "contact";
	}
	
	@RequestMapping("menupage")
	public String menupage() {
		return "menu";
	}
	
	@RequestMapping("teampage")
	public String teampage() {
		return "team";
	}
	
	@RequestMapping("testimonialpage")
	public String testimonialpage() {
		return "testimonial";
	}
	
	@RequestMapping("ourservicepage")
	public String ourservicepage() {
		return "OurService";
	}
	
}
