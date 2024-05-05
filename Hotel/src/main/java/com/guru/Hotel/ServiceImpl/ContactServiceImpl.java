package com.guru.Hotel.ServiceImpl;

import com.guru.Hotel.DAO.ContactRepository;
import com.guru.Hotel.Entity.Contact;
import com.guru.Hotel.Service.ContactService;
import com.guru.Hotel.validate.ContactValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactServiceImpl implements ContactService {


	@Autowired
	ContactValidator contactValidator;

	@Autowired
	ContactRepository contactRepository;

	@Override
	public Contact addContact(Contact contact) throws Exception {
		contactValidator.validatemobile(contact);
		contactValidator.validateContact(contact);
		return contactRepository.save(contact);

	}

	
	

}
