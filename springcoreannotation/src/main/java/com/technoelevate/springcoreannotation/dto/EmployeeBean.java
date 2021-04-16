package com.technoelevate.springcoreannotation.dto;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class EmployeeBean  implements Serializable{
	public EmployeeBean() {
		
	}
	private int id;
	private String name;
	@Autowired(required = false)
	@Qualifier("Test")
	private Department dept;

}
