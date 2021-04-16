package com.technoelevate.springcoreannotation.dto;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class MessageBean implements Serializable{
	public MessageBean(){
		System.out.println("insta phase");
	}
    @PostConstruct
	public void init() {
		System.out.println("init phase");
		
	}
	@PreDestroy
	public void destroy() {
		System.out.println("destroy phase");
		
	}
	private String message;

//	@Override
//	public void destroy() throws Exception {
//     System.out.println("destroy phase");
//		
//	}
//
//	@Override
//	public void afterPropertiesSet() throws Exception {
//     System.out.println("init phase");
//		
//	}

}
