package com.cg.Dao;

import java.math.BigInteger;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cg.Entity.Question;
@Repository
public interface QuestionDaoI {

	public Question addQuestion(Question question);
	public Question updatequestion(BigInteger questionId);
	public Question deleteQuestion(BigInteger questionId);
	
	public Question findById(BigInteger questionId);
	public List reterive();
}
