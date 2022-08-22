package com.Surge.Aug22;

public class Calculator extends AbstractModulus{
	@Override
	int modulus(int number1, int number2) {
		// TODO Auto-generated method stub
		if(number1!=0 && number2!=0) {
			if(number1>number2) {
				return (int)(number1%number2);
			}
			else {
				return (int)(number2%number1);
			}
		}
		else {
			return 0;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator objCalc = new Calculator();
		int add = objCalc.addition(8.9, 10.2);
		int sub = objCalc.subtraction(19, 32.2);
		int multiplication = objCalc.intMultiplication(5,6.5);
		int division = objCalc.intDivision(10,6.5);
		int modulus = objCalc.modulus(10, 9);
		
		double addition = objCalc.doubleAddition(8.9, 10.2);
		double subtract  = objCalc.doubleSubtraction(19, 32.2);
		double multi = objCalc.multiplication(5,6.5);
		double div = objCalc.division(10,6.5);
		
		System.out.println("The int addition of two numbers 8.9 + 10.2 = "+add);
		System.out.println("The double addition of two numbers 8.9 + 10.2 = "+addition);
		
		System.out.println("The int subtraction of two numbers 32.2 - 19 = "+sub);
		System.out.println("The double subtraction of two numbers 32.2 - 19 = "+subtract);
		
		System.out.println("The int multiplication of two numbers 5 * 6.5 = "+multiplication);
		System.out.println("The double multiplication of two numbers 5 * 6.5 = "+multi);
		
		System.out.println("The int division of two numbers 10/6.5 = "+division);
		System.out.println("The double division of two numbers 10/6.5 = "+div);
		
		System.out.println("Modulus of two numbers 10 % 9 = "+modulus);
		
	}

	

}
