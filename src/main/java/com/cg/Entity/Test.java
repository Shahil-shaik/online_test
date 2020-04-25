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
	private LocalTime testDuration;
	@Column
	private long testTotalMarks;
	@Column
	private long testMarksScored;
	
	@Column
	private LocalTime startTime;
	@Column
	private LocalTime endTime;
	
	@OneToOne
	private User user;
	@OneToMany
	List<Question> ques;
	
	
	public Test(long testId, String testTitle, LocalTime testDuration, long testTotalMarks, long testMarksScored,
			LocalTime startTime, LocalTime endTime, User user, List<Question> ques) {
		super();
		this.testId = testId;
		this.testTitle = testTitle;
		this.testDuration = testDuration;
		this.testTotalMarks = testTotalMarks;
		this.testMarksScored = testMarksScored;
		this.startTime = startTime;
		this.endTime = endTime;
		this.user = user;
		this.ques = ques;
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
	public LocalTime getTestDuration() {
		return testDuration;
	}
	public void setTestDuration(LocalTime testDuration) {
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
	public LocalTime getStartTime() {
		return startTime;
	}
	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}
	public LocalTime getEndTime() {
		return endTime;
	}
	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
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
