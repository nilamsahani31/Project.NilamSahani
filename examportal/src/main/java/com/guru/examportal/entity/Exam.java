package com.guru.examportal.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GeneratorType;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class Exam {
	
	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	private String  examId;
	private String  studentId;
	private String  questionNumber;
	private String  optionMarked;
	private Date examDate;
	public Exam() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Exam(String examId, String studentId, String questionNumber, String optionMarked, Date examDate) {
		super();
		this.examId = examId;
		this.studentId = studentId;
		this.questionNumber = questionNumber;
		this.optionMarked = optionMarked;
		this.examDate = examDate;
	}
	public String getExamId() {
		return examId;
	}
	public void setExamId(String examId) {
		this.examId = examId;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getQuestionNumber() {
		return questionNumber;
	}
	public void setQuestionNumber(String questionNumber) {
		this.questionNumber = questionNumber;
	}
	public String getOptionMarked() {
		return optionMarked;
	}
	public void setOptionMarked(String optionMarked) {
		this.optionMarked = optionMarked;
	}
	public Date getExamDate() {
		return examDate;
	}
	public void setExamDate(Date examDate) {
		this.examDate = examDate;
	}
	@Override
	public String toString() {
		return "Exam [examId=" + examId + ", studentId=" + studentId + ", questionNumber=" + questionNumber
				+ ", optionMarked=" + optionMarked + ", examDate=" + examDate + "]";
	}
	
	

}
