package com.technoelevate.springcoreannotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.technoelevate.springcoreannotation.Dog;
import com.technoelevate.springcoreannotation.Tiger;
@Configuration
public class AnimalConfig {
	@Bean(name="dog")
//	@Primary
	public Dog getDog() {
		return new Dog();
		
	}
	@Bean(name="tiger")
//	@Primary
	public Tiger getTiger() {
		return new Tiger();
		
	}

}
