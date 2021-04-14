package com.tyss.quizapplication.dao;

import java.util.Date;

import com.tyss.quizapplication.bean.QuestionAnswers;
import com.tyss.quizapplication.bean.Register;
import com.tyss.quizapplication.bean.Results;


interface Quiz {
	
	abstract  Register login(String userName,String Password);
	
	abstract  Register register(Register register);
	
	abstract QuestionAnswers questions(int id);
	
	abstract void results(Results results);
	
	abstract Results getResults(Date date);

}