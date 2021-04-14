package com.tyss.quizapplication.factory;

import java.util.Date;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tyss.quizapplication.bean.QuestionAnswers;
import com.tyss.quizapplication.bean.Register;
import com.tyss.quizapplication.bean.Results;
import com.tyss.quizapplication.dao.LoginDetails;

public class Factory {
	private static final int userName = 0;
	private static final Register String = null;
	ApplicationContext context = new ClassPathXmlApplicationContext("quiz.xml");
	LoginDetails loginDetails = (LoginDetails) context.getBean("loginDetails");
	Scanner scanner = new Scanner(System.in);
	int result = 0;
	int noOfQuestions = 0;

	public void register() {
		Register register = (Register) context.getBean("register");
		System.out.println("Enter UserName");
		String userName = scanner.next();
		register.setUserName(userName);
		System.out.println("Enter Password");
		String password = scanner.next();
		register.setPassword(password);
		System.out.println("Enter ConfirmPassword");
		String confirmPassword = scanner.next();
		if (password.equals(confirmPassword)) {
			register.setConfirmPassword(confirmPassword);
			loginDetails.register(register);
			System.out.println("Sucessfully Registered");
		}

		else {
			System.out.println("Confirm password is not matched");
		}
	}// End of the Method

	public void login() {

		Register login = (Register) context.getBean("register");
		System.out.println("Enter UserName");
		String username = scanner.next();
		System.out.println("Enter Password");
		String password = scanner.next();
		Register login2 = loginDetails.login(username, password);
		String password1 = login2.getPassword();
		if (password.equals(password1)) {
			System.out.println("Successfully Login");
			int iterate2;
			do {
				System.out.println("1 for JAVA");
				System.out.println("2 for HTML");
				System.out.println("3 for JS");
				int subject = scanner.nextInt();
				subject(subject);
				questions(subject);
				results(subject);
				System.out.println("Enter 1 for to write one more Quiz");
				System.out.println("Enter 2 for Exit");
				iterate2 = scanner.nextInt();
			} while (iterate2 == 1);
		} else {
			System.out.println("wrong password");
		}
	}// End of the Method

	public void questions(int subject) {
		QuestionAnswers questions1 = loginDetails.questions(subject);
		System.out.println("Please answer above questions in MCQ format....");
		System.out.println(questions1.getQuestion1());
		noOfQuestions++;
		String answer1 = scanner.next();
		if (answer1.equalsIgnoreCase(questions1.getQuestion1answer())) {
			result++;
		}
		System.out.println(questions1.getQuestion2());
		noOfQuestions++;
		String answer2 = scanner.next();
		if (answer2.equalsIgnoreCase(questions1.getQuestion2answer())) {
			result++;
		}
		System.out.println(questions1.getQuestion3());
		noOfQuestions++;
		String answer3 = scanner.next();
		if (answer3.equalsIgnoreCase(questions1.getQuestion3answer())) {
			result++;
		}
		System.out.println(questions1.getQuestion4());
		noOfQuestions++;
		String answer4 = scanner.next();
		if (answer4.equalsIgnoreCase(questions1.getQuestion4answer())) {
			result++;
		}
		System.out.println(questions1.getQuestion5());
		noOfQuestions++;
		String answer5 = scanner.next();
		if (answer5.equalsIgnoreCase(questions1.getQuestion5answer())) {
			result++;
		}
	}// End of the Method

	public void subject(int subject) {
		if (subject == 1) {
			QuestionAnswers questions = (QuestionAnswers) context.getBean("java");
		} else if (subject == 2) {
			QuestionAnswers questions = (QuestionAnswers) context.getBean("html");
		} else if (subject == 3) {
			QuestionAnswers questions = (QuestionAnswers) context.getBean("js");
		}
	}// End of the Method

	public void results(int subject) {
		Results results = (Results) context.getBean("results");
		results.setId(subject);
		Date date = new Date();
		results.setTime_Date(date);
		results.setMarks(result);
		results.setPercentage((result * 100) / noOfQuestions);
//		Register login2= loginDetails.login(userName, password);
//		String user=login.getUserName();
//		results.setUserName(user);
		loginDetails.results(results);
		
		Results results2 = loginDetails.getResults(date);
		System.out.println("Quiz Completed");
		System.out.println("Total marks obtained: " + results2.getMarks());
		System.out.println("Percentage: " + results2.getPercentage() + "%");
		result = 0;
		noOfQuestions = 0;

	}// End of the Method

}// End of the class
