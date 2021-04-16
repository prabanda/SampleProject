package com.technoelevate.springcoreannotation.dto;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.technoelevate.springcoreannotation.interfaces.Animal;

import lombok.Data;
@Data
public class PetBean implements Serializable {

	private String name;
	@Autowired(required = false)
	@Qualifier("tiger")
	private Animal animal;
}
