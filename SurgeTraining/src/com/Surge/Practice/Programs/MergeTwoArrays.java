package com.Surge.Practice.Programs;

//Java Program to Merge Two Arrays

public class MergeTwoArrays {
	static int[] mergeArrays(int[] A, int[] B) {
		int lenA = A.length, lenB = B.length;
		int[] ans = new int[lenA+lenB];
		for(int i = 0; i < lenA; i++) {
			ans[i] = A[i];
		}
		for(int j = 0; j < lenB; j++) {
			ans[lenA+j] = B[j];
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {12,54,27,3,90};
		int[] B = {3,4,5,6,7};
		int[] ans = mergeArrays(A, B);
		
		for (int i : ans) {
			System.out.print(i+" ");
		}
	}

}
