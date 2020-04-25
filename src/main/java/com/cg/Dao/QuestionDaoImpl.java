package com.cg.Dao;

import java.math.BigInteger;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.Entity.Question;

@Transactional
@Repository

public class QuestionDaoImpl implements QuestionDaoI {

	@PersistenceContext
	EntityManager em;
	
	@Override
	public Question addQuestion(Question question) {
		em.persist(question);
		return question;
	}

	@Override
	public Question updatequestion(BigInteger questionId) {
Question ques= em.find(Question.class, questionId);
		
		ques.setChosenAnswer(1);
		ques.setMarksScored(0);
		ques.setQuestionAnswer(1);
		ques.setQuestionID(1001);
		ques.setQuestionMarks(5);
		ques.setQuestionTitle("questionTitle");
		
		return ques;
	}

	@Override
	public Question deleteQuestion(BigInteger questionId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Question findById(BigInteger questionId) {
		return em.find(Question.class, questionId);
	}

	@Override
	public List reterive() {
		Query q=em.createQuery("from QuestionTable question");
		return q.getResultList();
	}

}
