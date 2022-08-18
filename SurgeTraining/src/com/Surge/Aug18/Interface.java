package com.Surge.Aug18;
interface Cake{
	String flour = "Maida";
	int sugar = 1, eggs = 2, flourQuantity = 1, bakingPowder = 1, butter = 1; 
//	Cake(){//Interfaces cannot have constructors
//		
//	}
	void Mixing();
	void Baking();
	void print();
}
class MugCake implements Cake{

	@Override
	public void Mixing() {
		// TODO Auto-generated method stub
		System.out.println("Mixing all the ingredients");
	}

	@Override
	public void Baking() {
		// TODO Auto-generated method stub
		System.out.println("Pouring the batter into jar and Baking the mixed batter");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Your mug cake is ready to eat :)");
	}
	
}
public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stubo
		Cake objCake = new MugCake();
		objCake.Mixing();
		objCake.Baking();
		objCake.print();
	}

}
