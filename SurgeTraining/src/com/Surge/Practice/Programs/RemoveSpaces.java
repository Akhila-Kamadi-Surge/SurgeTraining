package com.Surge.Practice.Programs;

/*
 * Write a Java Program to remove all white spaces from a string with using replace()
 * Write a Java Program to remove all white spaces from a string without using replace()
 */

public class RemoveSpaces {
	//---------------With replace()--------------------
	static String removeSpaceWithReplace(String str) {
		int len = str.length();
		String newStr = str.replace(" ", "");
		return newStr;
	}
	//----------------Without replace()-------------------
//	Method1 : using new string
	static String removeSpacesMethod1(String str) {
		int len = str.length();
		String noSpace = "";
		for (int i = 0; i < len; i++) {
			if(str.charAt(i)!=' ') {
				noSpace += str.charAt(i);
			}
		}
		return noSpace;
	}
//	Method2 : Using character array
	static String removeSpacesMethod2(String str) {
		int len = str.length();
		char[] arr = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < len; i++) {
			if(arr[i] !=' ') {
				sb.append(arr[i]);
			}
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Akhila     Kamadi";
		
		System.out.println("Method2 : Using new string output : "+removeSpaceWithReplace(str));
		System.out.println("Method2 : Using new string output : "+removeSpacesMethod1(str));
		System.out.println("Method2 : Using Char array and String Builder output : "+removeSpacesMethod2(str));
	}

}
