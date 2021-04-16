package com.technoelevate.springcoreannotation;

import com.technoelevate.springcoreannotation.interfaces.Animal;

public class Dog implements Animal {

	@Override
	public void eat() {
		System.out.println("eats Meat");
		
	}

	@Override
	public void speak() {
		System.out.println("Bow Bow");
		
	}

}
