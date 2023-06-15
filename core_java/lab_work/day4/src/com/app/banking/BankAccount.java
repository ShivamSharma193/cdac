package com.app.banking;

import java.time.LocalDate;

public class BankAccount {
	// Instance variables for the Bank account
	private long accountNumber ;
	private String customerName ;
	private String accountType ;
	private double accountBalance ;
	private LocalDate accountOpeningDate ;
	
	private final static double MIN_BALANCE ; // Minimum balance to be maintained by the account
	static {
		MIN_BALANCE = 3000 ;
	}
	
	public BankAccount(int an, String name, String accType, double bal, LocalDate oDate) { // Constructor to initialise the account
		accountNumber = an ;
		customerName = name ;
		this.accountType = accType ;
		accountBalance = bal ;
		accountOpeningDate = oDate ;
	}
	
	@Override
	public String toString() { // Override toString to Give account summary 
		return "Account Details : "+"\n\t" + "Account Number : " + this.accountNumber+ 
				"\n\t"+ "Customer Name : "+ this.customerName + 
				"\n\t"+ "Account Type : "+ this.accountType +
				"\n\t"+ "Account Balance : "+ this.accountBalance + 
				"\n\t" + "Account Opening Date : "+ this.accountOpeningDate + "\n";
	}
	
	public boolean withdraw(double debitAmount) { // ----------------------------------
		if ( (accountBalance-debitAmount) > MIN_BALANCE ) {
			accountBalance -= debitAmount ;
			System.out.println("Account Debited successfully,"+"debit amount : "+debitAmount );
			System.out.println("Current Balance : "+ accountBalance );
			return true ;
		} else {
			System.out.println("Balance too low for withdrawl.") ;
			// Throw an exception here 
			return false ;
		}
	}
	
	public void deposit(double creditAmount) { // -----------------------------------
		accountBalance += creditAmount ;
		System.out.println("Account successfully credit with "+ creditAmount);
		System.out.println("Current Balance : "+ accountBalance);
	}
	
	public void transferFunds(BankAccount creditAccount, double transferAmount) {
		if (this.withdraw(transferAmount)){
			creditAccount.deposit(transferAmount);
			System.out.println(transferAmount + " transfered from account "+ getAccountNumber() + " to " + creditAccount.getAccountNumber());
		} else 
			System.out.println("Transfer Failed!!");

	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public double getAccountBalance() {
		return accountBalance;
	}
}