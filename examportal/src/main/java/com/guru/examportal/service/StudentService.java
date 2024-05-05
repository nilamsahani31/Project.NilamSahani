package com.guru.examportal.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.guru.examportal.entity.Student;


public interface StudentService {
	
	Student insertStudent(Student student);

	Student updateStudent(Student student);

	Boolean deleteStudent(String studentId);

	Student getStudent(String studentId);




}
