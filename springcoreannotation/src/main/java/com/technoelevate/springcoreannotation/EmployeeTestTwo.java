package com.technoelevate.springcoreannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.technoelevate.springcoreannotation.config.EmpConfig;
import com.technoelevate.springcoreannotation.dto.EmployeeBean;

public class EmployeeTestTwo {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(EmpConfig.class);
		EmployeeBean bean=applicationContext.getBean(EmployeeBean.class);
		System.out.println(bean.getId());
		System.out.println(bean.getName());
		System.out.println(bean.getDept().getDeptId() );
		System.out.println(bean.getDept().getDName());


	}

}
