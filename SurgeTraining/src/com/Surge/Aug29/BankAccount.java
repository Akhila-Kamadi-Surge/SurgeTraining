package com.Surge.Aug29;

import java.io.Serializable;

class BankAccount implements Serializable {
	
	private static final long serialVersionUID = 6010743336284600506L;
	
	private String name, address;
	private int accountBalance;
	transient String homeBranch, ifscCode, accountId;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getHomeBranch() {
		return homeBranch;
	}
	public void setHomeBranch(String homeBranch) {
		this.homeBranch = homeBranch;
	}
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	public int getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}
	public BankAccount(String name, String address, String homeBranch, String accountId, String ifscCode, int accountBalance) {
		this.name = name;
		this.address = address;
		this.homeBranch = homeBranch;
		this.accountId = accountId;
		this.ifscCode = ifscCode;
		this.accountBalance = accountBalance;
	}
}

@SuppressWarnings("serial")
class AdditionalAccountDetails extends BankAccount{
	private long phoneNumber;
	private	String panNumber, linkedAadharNumber;
	
	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public String getLinkedAadharNumber() {
		return linkedAadharNumber;
	}

	public void setLinkedAadharNumber(String linkedAadharNumber) {
		this.linkedAadharNumber = linkedAadharNumber;
	}

	public AdditionalAccountDetails(String name, String address, String homeBranch, String accountId, String ifscCode,
			int accountBalance, long phoneNumber, String panNumber, String linkedAadharNumber) {
		super(name, address, homeBranch, accountId, ifscCode, accountBalance);
		// TODO Auto-generated constructor stub
		this.phoneNumber = phoneNumber;
		this.panNumber = panNumber;
		this.linkedAadharNumber = linkedAadharNumber;
	}
	
}
