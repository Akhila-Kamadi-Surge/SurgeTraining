package com.Surge.Sept5.Assignments;

public class PalidromicString {
	static boolean checkPalindrome(String str) {
		int i = 0, j = str.length()-1;
		while(i<j) {
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
		String str = "welcome to java program";
		str = "welcome to ot emoclew";
		if (checkPalindrome(str)) {
			System.out.println("Given string is Palindrome");
		}
		else {
			System.out.println("Given string is not a Palindrome");
		}
	}

}
