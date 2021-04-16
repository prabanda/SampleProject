package com.technoelevate.springcoreannotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.technoelevate.springcoreannotation.dto.Department;
@Configuration
public class DepartmentConfig {
	@Bean(name = "Dev")
//	@Primary
	public Department getDeptDev() {
		Department dept=new Department();
		dept.setDeptId(200);
		dept.setDName("developer");
		return dept;
		
	}
	@Bean(name = "Test")
//	@Primary
	public Department getDeptTest() {
		Department dept=new Department();
		dept.setDeptId(300);
		dept.setDName("Test");
		return dept;
		
	}
	@Bean(name = "HR")
//	@Primary
	public Department getDeptHR() {
		Department dept=new Department();
		dept.setDeptId(400);
		dept.setDName("HR");
		return dept;
		
	}



}
