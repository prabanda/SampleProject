package com.tyss.quizapplication.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
@Data
@Entity
public class QuestionAnswers  implements Serializable{
	@Column
	@Id
	private int id;
	@Column
	private String question1;
	@Column
	private String question2;
	@Column
	private String question3;
	@Column
	private String question4;
	@Column
	private String question5;
	@Column
	private String question5answer;
	@Column
	private String question4answer;
	@Column
	private String question3answer;
	@Column
	private String question2answer;
	@Column
	private String question1answer;



}
