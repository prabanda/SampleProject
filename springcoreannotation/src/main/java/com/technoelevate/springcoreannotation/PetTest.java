package com.technoelevate.springcoreannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.technoelevate.springcoreannotation.config.AllConfig;
import com.technoelevate.springcoreannotation.dto.PetBean;

public class PetTest {

	public static void main(String[] args) {

		ApplicationContext context=new AnnotationConfigApplicationContext(AllConfig.class);
		 PetBean bean=context.getBean(PetBean.class);
		 System.out.println(bean.getName());
		 bean.getAnimal().eat();
		 bean.getAnimal().speak();
		 
	}

}
