package com.guru.examportal.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guru.examportal.entity.Student;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, String> {


   Student findByStudentId(String studentId);

   List<Student> findByStudentName(String name);

}
