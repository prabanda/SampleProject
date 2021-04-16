package com.technoelevate.springcoreannotation;

import com.technoelevate.springcoreannotation.interfaces.Animal;

public class Tiger implements Animal {

	@Override
	public void eat() {
		System.out.println("tiger eats meat");
		
	}

	@Override
	public void speak() {
		System.out.println("tiger roars");
		
	}

}
