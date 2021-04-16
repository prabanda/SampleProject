package com.technoelevate.springcoreannotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.technoelevate.springcoreannotation.dto.EmployeeBean;

@Configuration
public class EmployeeConfig {
	@Bean(name = "one")
	public EmployeeBean getEmployeeBean() {
		return new EmployeeBean();
		
	}
//	@Bean(name = "two")
//	@Primary
//	public EmployeeBean getEmp() {
//		EmployeeBean bean=new EmployeeBean(101, "vijay");
//		return bean;
//		
//	}
	@Bean(name = "three")
	public EmployeeBean getEmpBean() {
		EmployeeBean bean=new EmployeeBean();
		bean.setId(102);
		bean.setName("hamsa");
		return bean;
		
	}
	

}
