package com.guru.Hotel.DAO;


import com.guru.Hotel.Entity.BookTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookTableRepository extends JpaRepository<BookTable, String> {

}
