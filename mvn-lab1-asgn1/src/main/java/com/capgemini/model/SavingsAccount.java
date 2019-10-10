package com.capgemini.model;

public class SavingsAccount extends Account{

	private double compoundInterest;
	public SavingsAccount(int accountNo, double balance) {
		super(accountNo, balance);
		setCompoundInterest(5);
	}
	public double getCompoundInterest() {
		return compoundInterest;
	}
	public void setCompoundInterest(double compoundInterest) {
		this.compoundInterest = compoundInterest;
	}
	
	public boolean withdraw(double amount) {
		double balance;
		balance = getBalance(); 
		if(balance > 0) { 
			setBalance(balance-amount);
			return true;
		}
		else 
			return false;
	}
	
	public double calculateInterestAfterMonths(int months) {
		double balance = getBalance()*(Math.pow(1+compoundInterest/100, months));
		return balance;
	}

}
