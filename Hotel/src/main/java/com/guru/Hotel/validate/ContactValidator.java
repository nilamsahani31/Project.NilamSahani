package com.guru.Hotel.validate;

import com.guru.Hotel.DAO.ContactRepository;
import com.guru.Hotel.Entity.Contact;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ContactValidator {

    @Autowired
    ContactRepository contactRepository;

    public void validateContact(Contact contact) throws Exception {
        if(null!=contact){
            Contact existingContact = contactRepository.findByEmail(contact.getEmail());
            if(null != existingContact){
                throw new Exception("contact already exists");
            }
        }


    }

    public void validatemobile(Contact contact) throws Exception {
//        if(contact.getMobile().length()!=10){
//            throw new Exception("enter valid mobile number");
//        }
        String mobileNumberPattern = "\\d{10}";

       
        Pattern pattern = Pattern.compile(mobileNumberPattern);

       
        Matcher matcher = pattern.matcher(contact.getMobile());

       
        if (!matcher.matches()) {
            throw new Exception("Enter a valid 10-digit mobile number");
        }
    }

}
