package com.cg.Entity;

import java.time.LocalTime;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="TestTable")
public class Test {
	@Id
	private long testId;
	@Column
	private String testTitle;
	@Column
	private String testDuration;
	@Column
	private long testTotalMarks;
	@Column
	private long testMarksScored;
	
	@OneToOne
	private User user;
	@OneToMany
	List<Question> ques;
	
	
	public Test(long testId, String testTitle, String testDuration, long testTotalMarks, long testMarksScored,
			 User user, List<Question> ques) {
		super();
		this.testId = testId;
		this.testTitle = testTitle;
		this.testDuration = testDuration;
		this.testTotalMarks = testTotalMarks;
		this.testMarksScored = testMarksScored;
		this.user = user;
		this.ques = ques;
	}
	public Test() {
		// TODO Auto-generated constructor stub
	}
	public long getTestId() {
		return testId;
	}
	public void setTestId(long testId) {
		this.testId = testId;
	}
	public String getTestTitle() {
		return testTitle;
	}
	public void setTestTitle(String testTitle) {
		this.testTitle = testTitle;
	}
	public String getTestDuration() {
		return testDuration;
	}
	public void setTestDuration(String testDuration) {
		this.testDuration = testDuration;
	}
	public long getTestTotalMarks() {
		return testTotalMarks;
	}
	public void setTestTotalMarks(long testTotalMarks) {
		this.testTotalMarks = testTotalMarks;
	}
	public long getTestMarksScored() {
		return testMarksScored;
	}
	public void setTestMarksScored(long testMarksScored) {
		this.testMarksScored = testMarksScored;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<Question> getQues() {
		return ques;
	}
	public void setQues(List<Question> ques) {
		this.ques = ques;
	}
	
	
		}
