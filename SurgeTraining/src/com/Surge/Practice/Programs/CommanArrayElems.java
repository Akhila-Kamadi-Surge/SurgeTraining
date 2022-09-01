package com.Surge.Practice.Programs;

import java.util.ArrayList;

//Java Program to Find Common Array Elements

public class CommanArrayElems {
	static int[] commonElements(int[] A, int[] B) {
		int lenA = A.length;
//		lenB = B.length;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < lenA; i++) {
			for(int j = 0; j < lenA; j++) {
				if(A[i]==B[j]) {
					list.add(A[i]);
				}
			}
		}
		int len = list.size();
		int[] ans = new int[len];
		for (int i = 0; i < len; i++) {
			ans[i] = list.get(i);
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1,2,3,4};
		int[] B = {2,3,5,6};
		int[] ans = commonElements(A, B);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]+" ");
		}
	}

}
