package com.guru.examportal.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Question {
	
	@Id
	private String questioNumber;
	private String question;
	private String optionA;
	private String optionB;
	private String optionC;
	private String optionD;
	private String answer;

	private  String examId;
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Question(String questioNumber, String question, String optionA, String optionB, String optionC,
			String optionD, String answer, String examId) {
		super();
		this.questioNumber = questioNumber;
		this.question = question;
		this.optionA = optionA;
		this.optionB = optionB;
		this.optionC = optionC;
		this.optionD = optionD;
		this.answer = answer;
		this.examId = examId;

	}
	public String getQuestioNumber() {
		return questioNumber;
	}
	public void setQuestioNumber(String questioNumber) {
		this.questioNumber = questioNumber;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getOptionA() {
		return optionA;
	}
	public void setOptionA(String optionA) {
		this.optionA = optionA;
	}
	public String getOptionB() {
		return optionB;
	}
	public void setOptionB(String optionB) {
		this.optionB = optionB;
	}
	public String getOptionC() {
		return optionC;
	}
	public void setOptionC(String optionC) {
		this.optionC = optionC;
	}
	public String getOptionD() {
		return optionD;
	}
	public void setOptionD(String optionD) {
		this.optionD = optionD;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getExamId() {
		return examId;
	}
	public void setExamId(String examId) {
		this.examId = examId;
	}


	@Override
	public String toString() {
		return "Question{" +
				"questioNumber='" + questioNumber + '\'' +
				", question='" + question + '\'' +
				", optionA='" + optionA + '\'' +
				", optionB='" + optionB + '\'' +
				", optionC='" + optionC + '\'' +
				", optionD='" + optionD + '\'' +
				", answer='" + answer + '\'' +
				", examId='" + examId + '\'' +
				'}';
	}
}
