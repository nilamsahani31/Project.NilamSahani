package com.guru.examportal.service.serviceImpl;

import com.guru.examportal.dto.AnswerSheetDto;
import com.guru.examportal.dto.ResultDto;
import com.guru.examportal.entity.Question;
import com.guru.examportal.service.QuestionService;
import com.guru.examportal.service.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResultServiceImpl implements ResultService {


    @Autowired
    QuestionService questionService;


    @Override
    public ResultDto getResult(List<AnswerSheetDto> answerSheetDtoList) {

        int marksObtained=0;
        ResultDto resultDto =new ResultDto();
        for ( AnswerSheetDto a:answerSheetDtoList) {

            Question question = questionService.getQuestion(a.getQuestioNumber());
            if(a.getOptionMarked().equals(question.getAnswer())){
                marksObtained+=2;
            }

        }
        resultDto.setMarkObtained(marksObtained);
        resultDto.setTotal(answerSheetDtoList.size()*2);
        resultDto.setStudentId(answerSheetDtoList.get(0).getStudentId());
        resultDto.setExamId(answerSheetDtoList.get(0).getExamId());

        return resultDto;
    }
}
