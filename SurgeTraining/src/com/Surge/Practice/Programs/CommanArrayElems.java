package com.Surge.Practice.Programs;

//Java Program to Find Common Array Elements

public class CommanArrayElems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1,2,3,4};
		int[] B = {2,3,5,6};
		
		int lenA = A.length;
//		lenB = B.length;
		
		for(int i = 0; i < lenA; i++) {
			for(int j = 0; j < lenA; j++) {
				if(A[i]==B[j]) {
					System.out.print(A[i]+" ");
				}
			}
		}
	}

}
