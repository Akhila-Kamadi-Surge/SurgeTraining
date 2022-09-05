package com.Surge.Sept5.Assignments;

public class CountVowels {
	static int countVowels(String str) {
		int n = str.length();
		String vow = "aeiou";
		int count = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < vow.length(); j++) {
				if(str.charAt(i) == vow.charAt(j)) {
					count++;
				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "welcome to java program";
		System.out.println(countVowels(str));
	}

}
