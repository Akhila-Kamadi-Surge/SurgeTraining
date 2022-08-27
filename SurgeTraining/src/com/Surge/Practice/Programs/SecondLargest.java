package com.Surge.Practice.Programs;

//Write a Java Program to find the second-highest number in an array

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,45,78,-1,2,90,-54,65,30};
		int len = arr.length;
		
		//Method1 : Using inbuilt sort
		Arrays.sort(arr);
		System.out.println("Second largest element in an array : "+arr[len-2]);
		
		//========================================
		//Method2 : Finding 1st largest, swap and find second large
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
		System.out.println("Second largest element in an array : "+max2);
		
		//=======================================================
		//Method3 : Using if else conditions
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
		System.out.println("Second largest element in an array : "+maxVal2);
		
		//Method4: 
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
		System.out.println("Second largest element in an array : "+second);
	}

}
