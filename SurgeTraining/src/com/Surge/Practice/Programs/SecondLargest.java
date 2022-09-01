package com.Surge.Practice.Programs;

//Write a Java Program to find the second-highest number in an array

import java.util.Arrays;

public class SecondLargest {
	//Method1 : Using inbuilt sort
	static int secondLargeMethod1(int[] arr) {
		int len = arr.length;
		Arrays.sort(arr);
		return arr[len-2];
	}
	//Method2 : Finding 1st largest, swap and find second large
	static int secondLargeMethod2(int[] arr) {
		int len = arr.length;
		int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
		int maxIndex = -1;
		//Find 1st largest
		for(int i = 0; i < len; i++) {
			if(arr[i]>max1) {
				max1 = Math.max(max1, arr[i]);
				maxIndex = i;
			}
		}
		//swap with last element
		int temp = arr[len-1];
		arr[len-1] = arr[maxIndex];
		arr[maxIndex] = temp;
		//iterate till len-2 and get second max
		for(int i = 0; i < len-1; i++) {
			max2 = Math.max(max2, arr[i]);
		}
		return max2;
	}
	//Method3 : Using if else conditions
	static int secondLargeMethod3(int[] arr) {
		int len = arr.length;
		int maxVal1 = Integer.MIN_VALUE, maxVal2 = Integer.MIN_VALUE;
		for(int i = 0; i < len; i++) {
			if(arr[i]>maxVal1) {
				maxVal2 = maxVal1;
				maxVal1 = arr[i];
			}
			else if(arr[i]>maxVal2 && arr[i]!=maxVal1){
				maxVal2 = arr[i];
			}
		}
		return maxVal2;
	}
	//Method4:
	static int secondLargeMethod4(int[] arr) {
		int len = arr.length;
		int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
		//Find 1st largest
		for(int i = 0; i < len; i++) {
			first = Math.max(first, arr[i]);
		}
		//second largest
		for(int i = 0; i < len; i++) {
			if(arr[i]!=first) {
				second = Math.max(second, arr[i]);
			}
		}
		return second;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,45,78,-1,2,90,-54,65,30};
		
		//Method1 : Using inbuilt sort
		System.out.println("Second largest element in an array using in-built sort: "+secondLargeMethod1(arr));
		
		//========================================
		//Method2 : Finding 1st largest, swap and find second large
		System.out.println("Second largest element in an array : "+secondLargeMethod2(arr));
		
		//=======================================================
		//Method3 : Using if else conditions
		
		System.out.println("Second largest element in an array : "+secondLargeMethod3(arr));
		
		//======================================
		//Method4: 
		System.out.println("Second largest element in an array : "+secondLargeMethod4(arr));
	}

}
