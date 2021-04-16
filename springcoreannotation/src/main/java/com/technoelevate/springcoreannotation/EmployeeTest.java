package com.technoelevate.springcoreannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.technoelevate.springcoreannotation.config.EmployeeConfig;
import com.technoelevate.springcoreannotation.dto.EmployeeBean;

public class EmployeeTest {

	public static void main(String[] args) {
		ApplicationContext context= new AnnotationConfigApplicationContext(EmployeeConfig.class);
//		EmployeeBean bean= context.getBean(EmployeeBean.class);
//		System.out.println(bean);
//		bean.setId(100);
//		bean.setName("prabanda");
//		System.out.println(bean);
//	EmployeeBean bean	=context.getBean("one", EmployeeBean.class);
//		EmployeeBean bean	=context.getBean("two", EmployeeBean.class);
		EmployeeBean bean	=context.getBean("three", EmployeeBean.class);
	System.out.println(bean);


	}

}
