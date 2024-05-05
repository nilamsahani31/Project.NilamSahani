package com.guru.examportal.service;

import com.guru.examportal.ExamportalApplication;
import com.guru.examportal.entity.Exam;

public interface ExamService {

    Exam addExam(Exam exam) throws Exception;

    Exam updateExam(Exam exam) throws Exception;
}
