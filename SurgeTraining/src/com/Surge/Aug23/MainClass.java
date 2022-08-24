package com.Surge.Aug23;

import java.util.Scanner;

public class MainClass extends ImplementingArithOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementingArithOp arith = new ImplementingArithOp();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Give an operator like +,-,*,/");
		String operator = sc.next();
		System.out.println("Give any two numbers");
		double number1 = sc.nextDouble();
		double number2 = sc.nextDouble();
		sc.close();
		switch(operator) {
			case "+" : {
				System.out.println("Addition : "+arith.addition(number1, number2));
				break;
			}
			case "-" : {
				System.out.println("Subtraction : "+arith.subtraction(number1, number2));
				break;
			}
			case "*" : {
				System.out.println("Multiplication : "+arith.intMultiplication(number1, number2));
				break;
			}
			case "/" : {
				System.out.println("Division : "+arith.intDivision(number1, number2));
				break;
			}
			default : {
				System.out.println("Invalid operator");
				break;
			}
		}
	}

}
