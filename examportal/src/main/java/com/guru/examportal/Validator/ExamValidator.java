package com.guru.examportal.Validator;

import com.guru.examportal.dao.QuestionRepository;
import com.guru.examportal.dao.StudentRepository;
import com.guru.examportal.entity.Exam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ExamValidator {

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    QuestionRepository questionRepository;

    public void validateExam(Exam exam) throws Exception {
        validateStudent(exam);
        validateQuestionNumber(exam);
    }

    public void validateStudent(Exam exam) throws Exception {
        if(!studentRepository.existsById(exam.getStudentId())){
            throw new Exception("Stdudent Id does exist");
        }

    }

    public void     validateQuestionNumber(Exam exam) throws Exception {
        if(!questionRepository.existsById(exam.getQuestionNumber())){
            throw new Exception("Question deos  not  exist");

        }

    }





}
