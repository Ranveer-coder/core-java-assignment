package com.kaizen.corejava.class_object;

public class BankDriver {

	public static void main(String[] args) {

		Bank sbi = new Bank();
//		sbi.setAccountNumber(123131234235l);
//		sbi.setBalance(9000000000000000000l);
//		sbi.setCustomerName("Ranveer");
//		sbi.setEmail("Ranveeranand85@gmail.com");
//		sbi.setMobNumber(7748848346l);
		System.out.println(sbi.getAccountNumber());
		System.out.println(sbi.getBalance());
		System.out.println(sbi.getCustomerName());
		System.out.println(sbi.getEmail());
		System.out.println(sbi.getMobNumber());
		System.out.println(sbi.getClass());
		
		System.out.println(sbi.depositFunds(7000000000l));
		System.out.println(sbi.withdraw(300000000000000l));
		
	}

}
