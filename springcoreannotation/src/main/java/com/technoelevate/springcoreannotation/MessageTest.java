package com.technoelevate.springcoreannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.technoelevate.springcoreannotation.config.MessageConfig;
import com.technoelevate.springcoreannotation.dto.MessageBean;

public class MessageTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext= new AnnotationConfigApplicationContext(MessageConfig.class);
		MessageBean bean=applicationContext.getBean(MessageBean.class);
//		System.out.println(bean);
		System.out.println(bean.getMessage());
		((AbstractApplicationContext)applicationContext).close();
		

	}

}
