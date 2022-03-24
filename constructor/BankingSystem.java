package com.kaizen.constructor;

class Account{
	
	int accNo;
	String name;
	double amount;
	
public Account(int a,String n, double am) {
	
	accNo =a;
	name = n;
	amount = am;
	
}
public Account() {}

void deposit(double amt) {
	amount = amount + amt;
	System.out.println(amt+ " : Desopited");
}
void withdraw(double amt) {
	
	if(amount < amt) {
		System.out.println("IN-SUFFICIENT BALANCE!!!");
	}else {
		amount -= amt;
		System.out.println(amt+ " : Withdraw Amount,Please Collect your card after that!");
	}
	
}
void checkBalance() {System.out.println("Balance in your account : " +amount);}

void display() {System.out.println(accNo+ " " + name + " " + amount);}



public class BankingSystem {

	public static void main(String[] args) {
		Account ac = new Account();
		ac.insert(7, "Ranveer", 777777777777777d);
		ac.display();
		ac.checkBalance();
		ac.deposit(999999999999d);
		ac.withdraw(1000000);
		ac.display();
	}

}



public void insert(int i, String s, double d) {
	
	accNo = i;
	name = s;
	amount = d;
}
}
