package com.app.banking;

import static java.time.LocalDate.parse;

public class TransferOperations {
	
	public static void deposit(BankAccount[] accounts, long toAccount, double amount) {
		for(BankAccount account : accounts) {
			if  ( (long)account.getAccountNumber() ==  toAccount) {
				account.deposit(amount);		
			}
		}
	}
	
	public static void withdraw(BankAccount[] accounts, long fromAccount, double amount) {
		for(BankAccount account : accounts) {
			if  ( (long)account.getAccountNumber() ==  fromAccount) {
				account.withdraw(amount);		
			}
		}
	}
	
	public static void transferFunds( BankAccount[] accounts, long transferFrom, long transferTo, double transactionammount) {
		
	//	long transferFrom = from;
	//	long transferTo = to;
		BankAccount fromAccount = null ;
		BankAccount toAccount  = null;
		boolean foundToAccount = false ;
		boolean foundFromAccount = false ;
		
	for (BankAccount account : accounts) {
		if  ( (long)account.getAccountNumber() ==  transferFrom ) {
			fromAccount = account ;
			foundFromAccount = true ;
		} else if( (long)account.getAccountNumber() ==  transferTo ){
			toAccount = account ;
			foundToAccount = true ;
		} 	
	}
		if (!foundFromAccount) {
			System.out.println("Account from which the money is to be trasffered does not exist.");				
		} 
		if (!foundToAccount) {
			System.out.println("Account to which the money is to be trasffered does not exist.");
		}
		fromAccount.transferFunds(toAccount, transactionammount);
	}
}
