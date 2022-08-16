package com.Surge; 

class ArithmeticOperators{
	int addition(int a, int b){
		return a + b;
	}
	int subtraction(int a, int b){
		return a - b;
	}
	int multiplication(int a, int b){
		return a * b;
	}
	int division(int a, int b){
		if(b > 0){
			return a / b;
		}
		return -1;
	}
	int modulus(int a, int b){
		if(b > 0){
			return a % b;
		}
		return -1;
	}

}

public class Aug12Day3 {
	public static void main(String[] args) {
		ArithmeticOperators oper = new ArithmeticOperators();
		int a = 2, b = 0;
		//int add = oper.addition(a,b);
		//int sub = oper.subtraction(a,b);
		//int mul = oper.multiplication(a,b);
		//int div = oper.division(a,b);
		//int mod = oper.modulus(a,b);
		System.out.println(oper.addition(a,b));
		System.out.println(oper.subtraction(a,b));
		System.out.println(oper.multiplication(a,b));
		if(oper.division(a, b) == -1) {
			System.out.println("Number divided by zero not allowed. Give valid input");
		}
		else {
			System.out.println(oper.division(a,b));
		}
		if(oper.modulus(a, b) == -1) {
			System.out.println("Number divided by zero not allowed. Give valid input");
		}
		else {
			System.out.println(oper.modulus(a,b));
		}
	}
}
