package com.Surge.Practice.Programs;

/*
 * Write a Java Program to remove all white spaces from a string with using replace()
 * Write a Java Program to remove all white spaces from a string without using replace()
 */

public class RemoveSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Akhila     Kamadi";
		int len = str.length();
		
		//---------------With replace()--------------------
		String newStr = str.replace(" ", "");
		System.out.println("with Replace output : "+newStr);
		
		//----------------Without replace()-------------------
//		Method1 : using new string
		String noSpace = "";
		for (int i = 0; i < len; i++) {
			if(str.charAt(i)!=' ') {
				noSpace += str.charAt(i);
			}
		}
		System.out.println("Method1 : Using new string output : "+noSpace);
		//------------
//		Method2 : Using character array
		char[] arr = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < len; i++) {
			if(arr[i] !=' ') {
				sb.append(arr[i]);
			}
		}
		System.out.println("Method2 : Using Char array and String Builder output : "+sb.toString());
	}

}
