package com.Surge.Practice.Programs;

//Java Program to Convert String to Float Value

public class StringToFloat {
	static void stringToFloatConversion(String val) {
		try {
			float converted = Float.parseFloat(val);
			System.out.println(converted);
		} catch (NumberFormatException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	static float stringToFloat(String val)  throws NumberFormatException{
		return Float.parseFloat(val);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String val = "56.9";
		stringToFloatConversion(val);
		
		//Method 2
		try {
			float converted = stringToFloat(val);
			System.out.println(converted);
		}
		catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());;
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
