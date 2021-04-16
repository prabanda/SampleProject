package com.technoelevate.springcoreannotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import({AnimalConfig.class,PetConfig.class})
@Configuration
public class AllConfig {
	

}
