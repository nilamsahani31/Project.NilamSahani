package com.guru.examportal.dto;


public class ResultDto {

    private String StudentId;
    private String optionMarked;
    private  int total;
    private  int markObtained;

    private String examId;

    public ResultDto() {
    }

    public String getStudentId() {
        return StudentId;
    }

    public void setStudentId(String studentId) {
        StudentId = studentId;
    }

    public String getOptionMarked() {
        return optionMarked;
    }

    public void setOptionMarked(String optionMarked) {
        this.optionMarked = optionMarked;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getMarkObtained() {
        return markObtained;
    }

    public void setMarkObtained(int markObtained) {
        this.markObtained = markObtained;
    }

    public String getExamId() {
        return examId;
    }

    public void setExamId(String examId) {
        this.examId = examId;
    }
}
