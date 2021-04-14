package com.tyss.quizapplication.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity

public class Register implements Serializable {
	@Column
	@Id
	private String userName;
	@Column
	private String password;
	@Column
	private String confirmPassword;

}
