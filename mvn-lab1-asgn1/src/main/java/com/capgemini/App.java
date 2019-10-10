package com.capgemini;

import com.capgemini.model.Account;
import com.capgemini.model.CurrentAccount;
import com.capgemini.model.SavingsAccount;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello" );
        Account account;
        System.out.println("1. For Savings\n2. For Current");
        SavingsAccount savingsAccount = new SavingsAccount(10001, 5000);
        try {
			CurrentAccount currentAccount = new CurrentAccount(1002, 4000);
		} catch (Exception e) {
			e.printStackTrace();
		}
        double interest = savingsAccount.calculateInterestAfterMonths(1);
        System.out.println(interest);
    }
}
