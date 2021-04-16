package com.technoelevate.springcoreannotation.dto;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;
@Data
public class Car implements Serializable{
	private String model;
	private String brand;
	@Autowired(required = false)
	private Engine engine;

}
