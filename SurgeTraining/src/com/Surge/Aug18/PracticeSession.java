package com.Surge.Aug18;

class ArrayLength{
	int arrLength(int[] arr) {
		int length = arr.length;
		return length;
	}
	int maxArrElem(int[] arr) {
		int length = arrLength(arr);
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		return max;
	}
	int minArrElem(int[] arr) {
		int length = arrLength(arr);
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < length; i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		return min;
	}
	
	void print(int[] arr) {
		System.out.println("Length of the array is "+arrLength(arr));
		System.out.println("Max element in the array is "+maxArrElem(arr));
		System.out.println("Max element in the array is "+minArrElem(arr));
	}
}

public class PracticeSession {
	public static void main(String[] args) {
		ArrayLength arrLen = new ArrayLength();
		int[] arr = {1,2,3,4,5};
		arrLen.print(arr);
		
		int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
		int[] odArr = new int[5];
		int[] evArr = new int[5];
		int k = 0, l = 0;
		for(int i = 0; i < arr1.length; i++) {
			if(arr1[i]%2==0) {
				evArr[k++] = arr1[i];
			}
			else {
				odArr[l++] = arr1[i];
			}
		}
		System.out.print("Odd Array : ");
		for(int i = 0; i < 5; i++) {
			System.out.print(odArr[i]+" ");
		}
		System.out.println();
		System.out.print("Even Array : ");
		for(int i = 0; i < 5; i++) {
			System.out.print(evArr[i]+" ");
		}
	}
}
