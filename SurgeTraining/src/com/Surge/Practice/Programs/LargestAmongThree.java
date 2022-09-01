package com.Surge.Practice.Programs;

// Java Program to find Largest Among 3 Numbers

public class LargestAmongThree {
	static int maxAmongThree(int num1, int num2, int num3) {
		if(num1 >=num2 && num1 >= num3) {
			return num1;
		}
		else if(num2>=num3) {
			return num2;
		}
		else {
			return num3;
		}
	}
	//Method2 : Using Math.max inbuilt function
	static int maxAmongThreeMethod2(int num1, int num2, int num3) {
		return Math.max(num1, Math.max(num2, num3));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 38, num2 =89, num3 = 1;
		//Method1 : Using if-else
		System.out.println(maxAmongThree(num1, num2, num3)+" is largest among three numbers");
		//=======================
		
		System.out.println("largest number among three : "+maxAmongThreeMethod2(num1, num2, num3));
	}

}
