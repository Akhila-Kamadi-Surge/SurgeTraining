package com.Surge.Sept12;

/*
	How to remove all occurrences of a given character from input String?
	Input
	=========
	abcbcdjfkd , c
	Pankaj , a
	c@@@c, @
	
	Output
	=======
	abbdjfkd
	Pnkj
	cc
	 */
public class RemoveAllOccurrencesOfCharacter {
	static String removeChar(String str,char c) {
		String res = "";
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) != c) {
				res += str.charAt(i);
			}
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "c@@@c";
		char c = '@';
		
		//inbuilt replace()
		System.out.println(str.replace(String.valueOf(c), ""));
		
		//================
		System.out.println("======================");
		
		//Without inbuilt method
		System.out.println(removeChar(str, c));
		
	}

}
