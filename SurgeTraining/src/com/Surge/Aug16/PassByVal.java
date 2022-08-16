package com.Surge.Aug16;

public class PassByVal {
	static void addition(float num1, float num2) {
		num1 += 10;//20.5
		num2 += 20;//32.6
		float add = num1+num2;
		System.out.println("The addition of num1 and num 2 is: "+add);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float num1 = 10.5f, num2 = 12.6f;
		float add = num1+num2;
		System.out.println("The addition of num1 and num2 before calling addition method: "+add);//23.1
		addition(num1,num2);//53.1
		add = num1+num2;
		System.out.println("The addition of num1 and num2 after calling addition method: "+add);//23.1
	}

}
