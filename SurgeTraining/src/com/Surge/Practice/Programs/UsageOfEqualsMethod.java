package com.Surge.Practice.Programs;

//JAVA Program to Show Usage of equals() Method

public class UsageOfEqualsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Akhila";
		String str2 = "Akhila";
		String str3 = new String("Akhila");
//		Pointing to same object 
		if(str1==str2) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		//Pointing to different objects
		if(str1==str3) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		//to find the values are equal or not use equals()
		if(str1.equals(str3)) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}

}
