package com.Surge.Aug16;

public class PassByRef {
	static void add1ToEachElement(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			arr[i] += 1;
		}
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		System.out.println("Before calling add1ToEachElement() method");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");//1 2 3 4 5
		}
		System.out.println();
		add1ToEachElement(arr);
		System.out.println("After calling add1ToEachElement() method");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");//2 3 4 5 6
		}
	}
}
