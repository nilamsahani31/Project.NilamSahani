package com.guru.Hotel.Controller;

import com.guru.Hotel.Entity.BookTable;
import com.guru.Hotel.Entity.Contact;
import com.guru.Hotel.Service.BookTableService;
import com.guru.Hotel.Service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	@Autowired
	ContactService contactService;

	@Autowired
	BookTableService bookTableService;
	
	@RequestMapping("/loginpage")
	public String loginpage() {
		return "login";
	}
	
	@RequestMapping("/aboutpage")
	public String aboutpage() {
		return "about";
	}
	
	@RequestMapping("/bookingpage")
	public String bookingpage() {
		return "booking";
	}

	@RequestMapping("bookingpermission")
	public String bookingpermission( BookTable bookTable) throws Exception {
		bookTableService.addTable(bookTable);
		return "booking";
	}
	
	@RequestMapping("/contactpage")
	public String contactpage() {
		return "contact";
	}

	@RequestMapping("contactpermission")
	public  String contactpermission(Contact contact) throws Exception {

	contactService.addContact(contact);
	return "contact";
	}
	
	@RequestMapping("/menupage")
	public String bmenupage() {
		return "menu";
	}
	
	@RequestMapping("/servicepage")
	public String servicepage() {
		return "service";
	}
	
	@RequestMapping("/teampage")
	public String teampage() {
		return "team";
	}
	
	@RequestMapping("/testimonialpage")
	public String testimonialpage() {
		return "testimonial";
	}
	

}
