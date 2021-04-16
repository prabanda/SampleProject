package com.technoelevate.springcoreannotation.dto;

import java.io.Serializable;

import lombok.Data;
@Data
public class Department implements Serializable{
	
	private int deptId;
	private String dName;

}
