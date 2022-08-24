package com.Surge.Aug23;
class EmailId{
	void emailIdCreation(String email) {
		System.out.println("you email id : "+email);
	}
}
class NewEmailId extends EmailId{
	void emailIdCreation(String newId) {
		System.out.println("your updated emial id : "+newId);
	}
}
public class Polymorphism {
	public static void main(String[] args) {
		EmailId email = new EmailId();
		email.emailIdCreation("STS173@surge.com");
		
		NewEmailId newEm = new NewEmailId();
		newEm.emailIdCreation("AkhilaKamadi@Suge.com");
		
		EmailId reassign = new NewEmailId();
		reassign.emailIdCreation("Akhilakamadi@Surge.com");
	}
}
