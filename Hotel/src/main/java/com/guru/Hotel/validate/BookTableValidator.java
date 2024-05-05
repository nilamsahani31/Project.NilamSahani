package com.guru.Hotel.validate;

import com.guru.Hotel.DAO.BookTableRepository;
import com.guru.Hotel.DAO.ContactRepository;
import com.guru.Hotel.Entity.BookTable;
import com.guru.Hotel.Entity.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Component
public class BookTableValidator {

    @Autowired
    BookTableRepository bookTableRepository;

    @Autowired
    ContactRepository contactRepository;

   public void validateBookTable(BookTable bookTable) throws Exception {

       Contact existingContact = contactRepository.findByEmail(bookTable.getEmail());

       if(existingContact==null){
           throw  new Exception("create contact before booking");
       }


   }




}

