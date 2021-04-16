package com.technoelevate.springcoreannotation.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.technoelevate.springcoreannotation.dto.Car;

public class CarTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext= new ClassPathXmlApplicationContext("carconfig.xml");
		Car car= (Car) applicationContext.getBean("car");
		System.out.println(car.getBrand());
		System.out.println(car.getModel());
		System.out.println(car.getEngine().getCc());
		System.out.println(car.getEngine().getEngineType());
		
		
		((AbstractApplicationContext)applicationContext).close();


	}

}
