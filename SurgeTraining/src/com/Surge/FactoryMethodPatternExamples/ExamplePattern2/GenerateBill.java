package com.Surge.FactoryMethodPatternExamples.ExamplePattern2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class GenerateBill {
	public static void main(String[] args) throws IOException {
		GetPlanFactory planFactory = new GetPlanFactory();
		
		System.out.println("Enter the name of plan for which the bill will be generated : ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String planName = br.readLine();
		System.out.println("Enter the number of units for which the bill will be calculated : ");
		int units = Integer.parseInt(br.readLine());
		
		Plan p = planFactory.getPlan(planName);
		
		System.out.println("Bill amount for "+ planName + " of "+ units + " units is : ");
		p.getRate();
		p.calculateBill(units);
	}
}
