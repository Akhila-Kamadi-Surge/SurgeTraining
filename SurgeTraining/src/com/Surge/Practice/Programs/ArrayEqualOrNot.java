package com.Surge.Practice.Programs;

//Java Program to Check if Two Arrays Are Equal or No

import java.util.Arrays;

public class ArrayEqualOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {12,54,27,3,90};
//		int[] B = {3,4,5,6,7};
		int[] B = {12,54,27,3,90};
		System.out.println(Arrays.equals(A,B));
		
		int lenA = A.length, lenB = B.length;
		if(lenA!=lenB) {
			System.out.println("Arrays are not equal");
		}
		else {
			int i = 0;
			while(i<lenA) {
				if(A[i]==B[i]) {
					i++;
				}
				else {
					System.out.println("Arrays are not equal");
					break;
				}
			}
			if(i==lenA) {
				System.out.println("Arrays are equal");
			}
		}
	}

}
