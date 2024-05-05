package com.guru.Hotel.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.guru.Hotel.DAO.ContactRepository;
import com.guru.Hotel.Entity.Contact;

public interface ContactService {
	
	Contact addContact(Contact contact) throws Exception;

}
