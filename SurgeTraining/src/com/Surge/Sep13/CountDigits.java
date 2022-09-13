package com.Surge.Sep13;

public class CountDigits {
	static int countNoOfDigits(int a) {
		int count = 0;
		while(a>0) {
			count++;
			a = a/10;
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1234567;
		System.out.println(countNoOfDigits(a));
		
		System.out.println("By converting it to string....");
		String str = String.valueOf(a);
		System.out.println(str.length());
	}

}
