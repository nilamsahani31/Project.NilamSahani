package com.project.examportal.ExamPortalApplicationProject.Model;

public class Answer {
	int qno;
	String qtext;
	String submitedAnswer;
	String correctAnswer;
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Answer(int qno, String qtext, String submitedAnswer, String correctAnswer) {
		super();
		this.qno = qno;
		this.qtext = qtext;
		this.submitedAnswer = submitedAnswer;
		this.correctAnswer = correctAnswer;
	}
	public int getQno() {
		return qno;
	}
	public void setQno(int qno) {
		this.qno = qno;
	}
	public String getQtext() {
		return qtext;
	}
	public void setQtext(String qtext) {
		this.qtext = qtext;
	}
	public String getSubmitedAnswer() {
		return submitedAnswer;
	}
	public void setSubmitedAnswer(String submitedAnswer) {
		this.submitedAnswer = submitedAnswer;
	}
	public String getCorrectAnswer() {
		return correctAnswer;
	}
	public void setCorrectAnswer(String correctAnswer) {
		this.correctAnswer = correctAnswer;
	}
	@Override
	public String toString() {
		return "Answer [qno=" + qno + ", qtext=" + qtext + ", submitedAnswer=" + submitedAnswer + ", correctAnswer="
				+ correctAnswer + "]";
	}

}
