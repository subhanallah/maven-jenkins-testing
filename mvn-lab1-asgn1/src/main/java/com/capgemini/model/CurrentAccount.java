package com.capgemini.model;

public class CurrentAccount extends Account{

	private double minBalance = 5000;
	public CurrentAccount(int accountNo, double balance) throws Exception {
		
		if(balance < minBalance)
			throw new Exception("Minimum balance constraint");
		else {
			setBalance(balance);
			setAccountNo(accountNo);
		}
	}

}
