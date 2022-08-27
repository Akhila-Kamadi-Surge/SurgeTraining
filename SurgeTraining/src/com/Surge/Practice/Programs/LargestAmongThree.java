package com.Surge.Practice.Programs;

// Java Program to find Largest Among 3 Numbers

public class LargestAmongThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 38, num2 =89, num3 = 1;
		//Method1 : Using if-else
		if(num1 >=num2 && num1 >= num3) {
			System.out.println(num1 +" is largest");
		}
		else if(num2>=num3) {
			System.out.println(num2 +" is largest");
		}
		else {
			System.out.println(num3 +" is largest");
		}
		
		//=======================
		//Method2 : Using Math.max inbuilt function
		int maxVal = Math.max(num1, Math.max(num2, num3));
		System.out.println("largest number among three : "+maxVal);
	}

}
