package com.Surge;

public class Aug11Day2 {
	class Ball{
		String color;
		int diameter;
		float weight;
		public String ballType(String Colour,int Diameter,float weight) 
		{
			// write of statements and based on it return the sport
		    if(Colour == "white" && Diameter == 25 && weight == 1 ) {
		    	return ("sport is : Football");
		    }
		    else if(Colour == "brown" && Diameter == 30 && weight == 1.5f) {
		    	return ("sport is : Basketball");
		    }
		    else {
		    	return ("sport is : Cricket ball");
		    }
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aug11Day2 classObj = new Aug11Day2();
		Ball objBall =classObj.new Ball();
		objBall.color = "Red";
		objBall.diameter = 25;
		objBall.weight = 0.05f; 
		System.out.println(objBall.ballType(objBall.color, objBall.diameter, objBall.weight));
		
	}

}
