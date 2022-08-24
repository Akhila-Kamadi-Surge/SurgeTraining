package com.Surge.Aug24;

import java.util.Scanner;

public class Palindorme {
	static boolean palindrome(String str) {
		int i = 0, j = str.length()-1;
		
		while(i<=j) {
			if(str.charAt(i)!=str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.next();
		sc.close();
		if(palindrome(str)) {
			System.out.println("Given string is a palidrome");
		}
		else {
			System.out.println("Given string is not a palindrome");
		}
	}

}
