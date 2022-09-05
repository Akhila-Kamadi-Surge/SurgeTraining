package com.Surge.Sept5.Assignments;

public class NonRepeatingCharacter {
	static String nonRepeat(String s) {
		int len = s.length();
		String res = "";
		for(int i = 0; i < len; i++) {
			int count = 0;
			for(int j = 0; j < len; j++) {
				if(s.charAt(i)==s.charAt(j)) {
					count++;
				}
			}
			if(count==1) {
				res += s.charAt(i);
			}
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "welcome to java program";
		System.out.println(nonRepeat(str));
	}

}
