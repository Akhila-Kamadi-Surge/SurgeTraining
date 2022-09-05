package com.Surge.Sept5;

import java.util.Scanner;

//Write a java program to enter age . If age is 18 or greater than 18 than print you are eligible for voting otherwise NumberFormateException

public class Question2 {
	
	static void printEligibilty(int age) throws NumberFormatException{
		if(age >= 18) {
			System.out.println("You are eligible for voting");
		}
		else {
			throw new NumberFormatException("Enter valid age. Age should be 18 or more");
		}
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter age : ");
		
		try {
			int age = sc.nextInt();
			printEligibilty(age);
		}
		catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
