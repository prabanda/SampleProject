package com.technoelevate.springcoreannotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.technoelevate.springcoreannotation.dto.Engine;

@Configuration
public class EngineConfig {
	
	@Bean
	public Engine getEngine() {
		Engine engine=new Engine();
		engine.setCc(3000);
		engine.setEngineType("diesel");
		return engine;
		
	}
	

}
