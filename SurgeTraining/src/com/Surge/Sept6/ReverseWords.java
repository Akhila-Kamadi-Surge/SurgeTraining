package com.Surge.Sept6;
//how to reverse the words in a given String sentence?=>Java is Best
public class ReverseWords {
	static void reverse(char[] ch, int p1,int p2) {
		while(p1<p2) {
			char temp = ch[p1];
			ch[p1] = ch[p2];
			ch[p2] = temp;
			p1++;
			p2--;
		}
	}
	static String reverWordByWord(char[] s) {
		int n = s.length;
		reverse(s, 0, n-1);
		int p1 = 0, p2 = 0;
		while(p1<n) {
			while(p2<n && s[p2] != ' ') {
				p2++;
			}
			reverse(s,p1,p2-1);
			p1 = p2+1;
			p2 = p1;
		}
		return String.valueOf(s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Java is Best";
		char[] chArr = str.toCharArray();
		System.out.println(reverWordByWord(chArr));
	}

}
