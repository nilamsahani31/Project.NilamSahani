package com.guru.Hotel.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import com.guru.Hotel.Entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, String>{

    Contact findByEmail(String email);
	

}
