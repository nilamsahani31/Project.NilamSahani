package com.guru.examportal.controller;


import com.guru.examportal.dto.ResponseDto;
import com.guru.examportal.entity.Question;
import com.guru.examportal.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/questionController")
public class QuestionController {
    @Autowired
    QuestionService questionService;

    @PostMapping("/add")
    public ResponseDto addQuestion(@RequestBody Question question){
        Question savedQuestion = questionService.addQuestion(question);
        if(null!=savedQuestion){
            return new ResponseDto(true,savedQuestion,"saved successfully");
        }
        return new ResponseDto(false,savedQuestion,"unable to save");

    }

}
