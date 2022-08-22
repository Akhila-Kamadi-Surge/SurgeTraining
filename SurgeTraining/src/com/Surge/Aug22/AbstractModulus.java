package com.Surge.Aug22;

public abstract class AbstractModulus implements AddSub, MultiplyDivide {
	public double doubleAddition(double number1, double number2) {
		return number1+number2;
	}
	public double doubleSubtraction(double number1, double number2) {
		//returns only positive result
		if(number1>number2) {
			return number1-number2;
		}
		else {
			return number2-number1;
		}
	}
	
	//int addition and subtraction
	public int addition(double number1, double number2) {
		return (int)(number1+number2);
	}
	public int subtraction(double number1, double number2) {
		if(number1>number2) {
			return (int)(number1-number2);
		}
		else {
			return (int)(number2-number1);
		}
	}
	
	public double multiplication(double a, double b) {
		return a*b;
	}
	public double division(double a, double b) {
		if(a!=0 && b!=0) {
			if(a>b) {
				return (a/b);
			}
			else {
				return (b/a);
			}
		}
		else {
			return 0;
		}
	}
	//int multiplication and division
	public int intMultiplication(double a, double b) {
		return (int)(a*b);
	}
	public int intDivision(double a, double b) {
		if(a!=0 && b!=0) {
			if(a>b) {
				return (int)(a/b);
			}
			else {
				return (int)(b/a);
			}
		}
		else {
			return 0;
		}
	}
	
	//abstract method modulus()
	abstract int modulus(int number1, int number2);
}
