package com.cg.Entity;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="QuestionsTable")
public class Question {
	@Id
	private long questionID;
	@Column
	private String questionOptions[]=new String[3];
	@Column
	private String questionTitle;
	@Column
	private int questionAnswer;
	@Column
	private double questionMarks;
	@Column
	private int chosenAnswer;
	@Column
	private double marksScored;
	
	@ManyToOne
	@JoinColumn(name="testId")
	private Test test;

	
	public Question(long questionID, String[] questionOptions, String questionTitle, int questionAnswer,
			double questionMarks, int chosenAnswer, double marksScored, Test test) {
		super();
		this.questionID = questionID;
		this.questionOptions = questionOptions;
		this.questionTitle = questionTitle;
		this.questionAnswer = questionAnswer;
		this.questionMarks = questionMarks;
		this.chosenAnswer = chosenAnswer;
		this.marksScored = marksScored;
		this.test = test;
	}

	public long getQuestionID() {
		return questionID;
	}

	public void setQuestionID(long questionID) {
		this.questionID = questionID;
	}

	public String[] getQuestionOptions() {
		return questionOptions;
	}

	public void setQuestionOptions(String[] questionOptions) {
		this.questionOptions = questionOptions;
	}

	public String getQuestionTitle() {
		return questionTitle;
	}

	public void setQuestionTitle(String questionTitle) {
		this.questionTitle = questionTitle;
	}

	public int getQuestionAnswer() {
		return questionAnswer;
	}

	public void setQuestionAnswer(int questionAnswer) {
		this.questionAnswer = questionAnswer;
	}

	public double getQuestionMarks() {
		return questionMarks;
	}

	public void setQuestionMarks(double questionMarks) {
		this.questionMarks = questionMarks;
	}

	public int getChosenAnswer() {
		return chosenAnswer;
	}

	public void setChosenAnswer(int chosenAnswer) {
		this.chosenAnswer = chosenAnswer;
	}

	public double getMarksScored() {
		return marksScored;
	}

	public void setMarksScored(double marksScored) {
		this.marksScored = marksScored;
	}

	public Test getTest() {
		return test;
	}

	public void setTest(Test test) {
		this.test = test;
	}
	
	}
