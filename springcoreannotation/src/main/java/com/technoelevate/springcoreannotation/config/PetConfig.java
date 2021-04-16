package com.technoelevate.springcoreannotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.technoelevate.springcoreannotation.dto.PetBean;

@Configuration
public class PetConfig {
	@Bean
	
	public PetBean getPet() {
		PetBean pet= new PetBean();
		pet.setName("Tommy");
		return pet;
		
	}

}
