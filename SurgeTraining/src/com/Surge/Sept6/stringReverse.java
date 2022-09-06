package com.Surge.Sept6;

//how to reverse a given string?=>your name

public class stringReverse {
	static String reverse(String str) {
		int n = str.length();
		String result = "";
		
		//Method1
//		for(int i = n-1; i >= 0; i--) {
//			result += str.charAt(i);
//		}
		
		//Method2
		for(int i = 0; i < n; i++) {
			result = str.charAt(i)+ result;
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Akhila Kamadi";
		System.out.println(reverse(name));
	}

}
