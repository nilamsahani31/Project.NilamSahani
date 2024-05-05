package com.guru.examportal.service.serviceImpl;

import com.guru.examportal.dao.QuestionRepository;
import com.guru.examportal.entity.Question;
import com.guru.examportal.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    QuestionRepository questionRepository;

    @Override
    public Question addQuestion(Question question) {
      return questionRepository.save(question);
    }

    @Override
    public Question getQuestion(String questionNumber){

        Optional<Question> question = questionRepository.findById(questionNumber);
        return question.get();
    }
}
