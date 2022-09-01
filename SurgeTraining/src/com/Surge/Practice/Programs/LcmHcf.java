package com.Surge.Practice.Programs;

//Java Program to Find LCM and HCF of 2 numbers

public class LcmHcf {
	static int[] lcmHcf(int a, int b) {
		int gcd = 0, lcm = 0;
		for(int i = 1; i <= Math.min(a, b); i++) {
			if(a%i==0 && b%i == 0) {
				gcd = i;
			}
		}
		lcm = a*b/gcd;
		int[] ans = {lcm, gcd};
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 6, b = 4;
		int[] ans = lcmHcf(a, b);
		System.out.println("gcd :"+ans[1]);
		System.out.println("Lcm :"+ans[0]);
	}

}
