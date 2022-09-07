package com.Surge.Sept7.Sangeetha_Task;

//How do you count the number of words in string?=>Java is great

public class CountWords {
	static int countWords(String str) {
		int len = str.length();
		int count = 0;
		for(int i = 0; i < len; i++) {
			if(str.charAt(i) == ' ') {
				count += 1;
			}
		}
		return count+1;//last word is not counted
	}
	public static void main(String[] args) {
		String str = "Java is great";
		
		//Method 1
		String[] strArr = str.split(" ");
		System.out.println(strArr.length);
		
		//Method 2
		System.out.println(countWords(str));
	}
}
