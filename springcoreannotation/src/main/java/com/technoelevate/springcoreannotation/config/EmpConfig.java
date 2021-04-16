package com.technoelevate.springcoreannotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.technoelevate.springcoreannotation.dto.EmployeeBean;
@Import({DepartmentConfig.class})
@Configuration
public class EmpConfig {
	@Bean
	public EmployeeBean getEmpBean() {
		EmployeeBean bean=new EmployeeBean();
		bean.setId(1);
		bean.setName("xyz");
//		bean.setDept(new Department());
		return bean;
		
		
	}

}
