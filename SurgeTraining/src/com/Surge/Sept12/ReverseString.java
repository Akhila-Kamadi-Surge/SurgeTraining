package com.Surge.Sept12;

/*
 	Write a java program to reverse a String?
	Input
	=======
	abc
	hello
	Output
	=======
	cba
	olleh
 */
public class ReverseString {
	static String reverse(String s) {
		String res = "";
		for(int i = 0; i < s.length(); i++) {
			res = s.charAt(i)+res;
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello";
		System.out.println(reverse(s));
	}

}
