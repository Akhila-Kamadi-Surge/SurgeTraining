package com.Surge.Aug29;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MainClass {
	static void serialize(AdditionalAccountDetails acct) {
		try {
			FileOutputStream fileOut = new FileOutputStream("BankaccountLinkedWithAadhar.txt");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			
			out.writeObject(acct);
			out.flush();
			out.close();
			fileOut.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	static void deserialize(AdditionalAccountDetails acct) {
//		BankAccount deserAct;
		AdditionalAccountDetails deserAct;
		try {
			FileInputStream fileIn = new FileInputStream("BankaccountLinkedWithAadhar.txt");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			
			//deserAct =(BankAccount) in.readObject();
			deserAct =(AdditionalAccountDetails) in.readObject();
			in.close();
			fileIn.close();
			
			System.out.println("Name : "+deserAct.getName());
			System.out.println("Address : "+deserAct.getAddress());
			System.out.println("Home Branch : "+deserAct.getHomeBranch());
			System.out.println("Account Id : "+deserAct.getAccountId());
			System.out.println("IFSC code : "+deserAct.getIfscCode());
			System.out.println("Bank balance : "+deserAct.getAccountBalance());
			System.out.println("Phone Number : "+deserAct.getPhoneNumber());
			System.out.println("PAN Number : "+deserAct.getPanNumber());
			System.out.println("Aadhar Number : "+deserAct.getLinkedAadharNumber());
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		BankAccount acctObj = new BankAccount("Akhila Kamadi", "Hyderabad", "Chandanagar", "12345678910", "KKBK0007489", 1000);
//		serialize(acctObj);
//		deserialize(acctObj);
		AdditionalAccountDetails extraDetailsObj = new AdditionalAccountDetails("Akhila K", "Hyderabad", "Chandanagar", 
				"50123456781", "KKBK0007489", 1000, 891234560, "GYUPQ8950B", "123467899876");
		serialize(extraDetailsObj);
		deserialize(extraDetailsObj);
	}

}
