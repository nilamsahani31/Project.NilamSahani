package com.guru.examportal.service;

import com.guru.examportal.dto.AnswerSheetDto;
import com.guru.examportal.dto.ResultDto;

import java.util.List;

public interface ResultService {



    ResultDto getResult(List<AnswerSheetDto> answerSheetDtoList);
}
