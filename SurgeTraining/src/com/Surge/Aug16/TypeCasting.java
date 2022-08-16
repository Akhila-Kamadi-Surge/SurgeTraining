package com.Surge.Aug16;

public class TypeCasting {
	static long product(int a,int b) {
		//Explicit conversion as a and b are very large integer
		//their product may exceed the int range and will lead to overflow.
		return (long)a*b;//making 1 variable a as long so product will be converted to long type
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		float b = 6.5f;
		//Gives result in float type 
		//Because if it converts float into int type there will be loss of data.
		System.out.println(a+b);//16.5
		int x = 1000000000, y = 1000000000;//10^9
		System.out.println(product(x,y));//prints 10^18 in the form of 1000000000000000000 =>This huge value doesn't fit in int type
		System.out.println((double)product(x,y));//prints 10^18 as 1.0E18
		
	}

}
