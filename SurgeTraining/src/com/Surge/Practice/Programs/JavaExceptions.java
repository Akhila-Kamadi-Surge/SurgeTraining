package com.Surge.Practice.Programs;

//Java Program to Handle the Exception Methods-be elaborate


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JavaExceptions {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Checked exception
		//FileReader file = new FileReader("C:\\Users\\STS179\\Desktop\\test.txt");//May throw file not found exception => so gives compile time error
		FileReader file;
		try {
			file = new FileReader("C:\\Users\\STS179\\Desktop\\test.txt");
			BufferedReader fileInput = new BufferedReader(file);
			System.out.println(fileInput.readLine());
		}
		catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		catch(IOException e) {//IOEException is a base class of FileNotFoundException
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Checked exception is executed without abrupt termination");
		}
		
		//Unchecked exception
		String s = "Akhila";
		try {
			int i = Integer.parseInt(s);
		}
		catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("Given string cannot be converted to int");
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			System.out.println("Unchecked exception is executed without abrupt termination");
		}
	}

}
