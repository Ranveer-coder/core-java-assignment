package com.kaizen.corejava.class_object;

public class Bank {
	
	public long accountNumber;
	public long balance;
	public String customerName;
	public String email;
	public long mobileNo;
	
	public Bank() {
		this(007l,999999999999999l,"Ranveer","ranveeranand85@gmail.com", 77488_48346l);
		System.out.println("Called Default!!!");
	}
	
	
	public Bank(long accountNumber, long balance, String customerName, String email, long mobileNo) {
		System.out.println("Paramatrized called  : ");
		System.out.println("Account Holder Info : ");
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.customerName = customerName;
		this.email = email;
		this.mobileNo = mobileNo;
	}


	public void setAccountNumber(long acc) {
		this.accountNumber = acc;
	}
	
	public long getAccountNumber() {
		return this.accountNumber;
	}
	
	public void setBalance(long bal) {
		this.balance = bal;
	}
	
	public long getBalance() {
		return this.balance;
	}
	
	public void setCustomerName(String name) {
		this.customerName = name;
	}
	
	public String getCustomerName() {
		return this.customerName;
	}
	
	public void setEmail(String mail) {
		this.email = mail;
	}
	
	public String getEmail() {
		return this.email;
	}

	public void setMobNumber(long num) {
		this.mobileNo = num;
	}
	
	public long getMobNumber() {
		return this.mobileNo;
	}
	
	public double depositFunds(double depositAmount) {
		System.out.println("Current balance : " + balance);
		System.out.println("Balance After Deposit : " );
		return this.balance += depositAmount;
	
	}
	
	public long withdraw(long deduct) {
		if(balance > 0) {
			System.out.println("Transaction in process!!!! ");
		}else{
			System.out.println("no balance");
		}
		System.out.println("Dectuded Balance After Witdrawn : ");
		return balance-deduct;
		
	}
	
}
