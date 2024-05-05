package com.guru.examportal.service;

import com.guru.examportal.entity.Question;

public interface QuestionService {

    Question addQuestion(Question question);

    Question getQuestion(String questionNumber);
}
