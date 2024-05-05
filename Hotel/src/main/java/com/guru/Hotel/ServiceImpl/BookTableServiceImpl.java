package com.guru.Hotel.ServiceImpl;

import com.guru.Hotel.DAO.BookTableRepository;
import com.guru.Hotel.Entity.BookTable;
import com.guru.Hotel.Service.BookTableService;
import com.guru.Hotel.validate.BookTableValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookTableServiceImpl implements BookTableService {
@Autowired
    BookTableValidator bookTableValidator;

@Autowired
    BookTableRepository bookTableRepository;

    @Override
    public BookTable addTable(BookTable bookTable) throws Exception {
    bookTableValidator.validateBookTable(bookTable);

        return bookTableRepository.save(bookTable);
    }
}
