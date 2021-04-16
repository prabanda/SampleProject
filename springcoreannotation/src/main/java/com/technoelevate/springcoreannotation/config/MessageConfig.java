package com.technoelevate.springcoreannotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.technoelevate.springcoreannotation.dto.MessageBean;
import com.technoelevate.springcoreannotation.processors.MyBeanFactory;
import com.technoelevate.springcoreannotation.processors.MyBeanPP;

@Configuration
public class MessageConfig {
	@Bean(name="message")
	public MessageBean getMessageBean() {
		MessageBean bean= new MessageBean();
		bean.setMessage("i am message bean");
		return bean;
		
	}
	@Bean
	public MyBeanFactory getMyBeanFactory() {
		return new MyBeanFactory();
		
	}
	@Bean
	public MyBeanPP getMyBeanPP() {
		return new MyBeanPP();
		
	}

}
