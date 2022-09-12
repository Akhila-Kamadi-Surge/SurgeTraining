package com.Surge.Sept12;

/*
	3. How to check if a String is Palindrome? 
		Input
		=====
		abc
		abcba
		c@@@c
		
		Output
		========
		abc is palindrome = false
		abcba is palindrome = true
		c@@@c is palindrome = true
		 */
public class PalindromicString {
	static boolean isPalindrome(String str) {
		int i = 0, j = str.length()-1;
		while(i <= j) {
			if(str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "cab";
		if(isPalindrome(str)) {
			System.out.println(str+" is palindrome"+" = "+isPalindrome(str));
		}
		else {
			System.out.println(str+" is palindrome"+" = "+isPalindrome(str));
		}
	}

}
