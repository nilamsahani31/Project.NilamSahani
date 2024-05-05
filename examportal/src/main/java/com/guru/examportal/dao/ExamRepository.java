package com.guru.examportal.dao;

import com.guru.examportal.entity.Exam;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExamRepository extends JpaRepository<Exam,String> {


}
