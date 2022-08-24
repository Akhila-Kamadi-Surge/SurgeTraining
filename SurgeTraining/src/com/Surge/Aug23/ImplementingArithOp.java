package com.Surge.Aug23;

public class ImplementingArithOp implements ArithmeticOperations {

	@Override
	public int addition(double number1, double number2) {
		// TODO Auto-generated method stub
		return (int)(number1+number2);
	}

	@Override
	public int subtraction(double number1, double number2) {
		// TODO Auto-generated method stub
		if(number1>number2) {
			return (int)(number1-number2);
		}
		else {
			return (int)(number2-number1);
		}
	}

	@Override
	public int intMultiplication(double a, double b) {
		// TODO Auto-generated method stub
		return (int)(a*b);
	}

	@Override
	public int intDivision(double a, double b) {
		// TODO Auto-generated method stub
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
	
}
