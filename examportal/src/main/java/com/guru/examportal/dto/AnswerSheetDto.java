package com.guru.examportal.dto;


import lombok.Data;

@Data
public class AnswerSheetDto {

    private String questioNumber;
    private String optionMarked;

    private String studentId;
    private String examId;



}
