package com.Surge.FactoryMethodPatternExamples.ExamplePattern2;

abstract class Plan {
	protected double rate;
	abstract void getRate();
	
	public void calculateBill(int units) {
		System.out.println(units*rate);
	}
}
