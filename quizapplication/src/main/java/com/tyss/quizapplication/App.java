package com.tyss.quizapplication;

import java.util.Scanner;

import com.tyss.quizapplication.factory.Factory;

public class App {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int iterator;
		do {
			System.out.println("welcome to Quiz");
			System.out.println("enter 1 for Register");
			System.out.println("enter 2 for Login");
			int choice = scanner.nextInt();
			Factory factory = new Factory();
			if (choice == 1) {
				factory.register();
			}
			if (choice == 2) {
				factory.login();
			}
			System.out.println("Enter 1 for one more time Login/Register");
			System.out.println("Enter 2 for exit");
			iterator = scanner.nextInt();
		} while (iterator == 1);
	}// End of the Main Method

}// End of the Class
