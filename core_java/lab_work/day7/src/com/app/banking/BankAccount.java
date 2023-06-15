package com.app.banking;

import java.time.LocalDate;

public class BankAccount implements Comparable<BankAccount>{
	// Instance variables for the Bank account
	private Long accountNumber ;
	private String customerName ;
	private AccountType accountType ;
	private double accountBalance ;
	private LocalDate accountOpeningDate ;
	
//	private final static double MIN_BALANCE ; // Minimum balance to be maintained by the account
//	static {
//		MIN_BALANCE = 3000 ;
//	}
	
	public BankAccount(Long an, String name, AccountType accType, double bal, LocalDate oDate) { // Constructor to initialise the account
		accountNumber = an ;
		customerName = name ;
		accountType = accType ;
		accountBalance = bal ;
		accountOpeningDate = oDate ;
	}
	
//	public BankAccount() {
//	}

	@Override
	public String toString() { // Override toString to Give account summary 
		return "Account Details : "+"\n\t" + "Account Number : " + this.accountNumber+ 
				"\n\t"+ "Customer Name : "+ this.customerName + 
				"\n\t"+ "Account Type : "+ this.accountType +
				"\n\t"+ "Account Balance : "+ this.accountBalance + 
				"\n\t" + "Account Opening Date : "+ this.accountOpeningDate + "\n";
	}
	
	public void withdraw(double debitAmount) { // ----------------------------------
		if ( (accountBalance-debitAmount) > accountType.getMIN_BALANCE() ) {
			accountBalance -= debitAmount ;
			System.out.println("Account Debited successfully,"+"debit amount : "+debitAmount );
			System.out.println("Current Balance : "+ accountBalance );
		} else {
			System.out.println("Balance too low for withdrawl.") ;
			// Throw an exception here 
		}
	}
	
	public void deposit(double creditAmount) { // -----------------------------------
		accountBalance += creditAmount; 	
		System.out.println("Account successfully credit with "+ creditAmount);
		System.out.println("Current Balance : "+ accountBalance);
	}
	
	public void transferFunds(BankAccount creditAccount, double transferAmount) {
		this.withdraw(transferAmount);
		creditAccount.deposit(transferAmount);
		System.out.println(transferAmount + " transfered from account "+ getAccountNumber() + " to " + creditAccount.getAccountNumber());
	}
	
	
	

	@Override 
	public boolean equals(Object o) { // Checks if two accounts have same account number
		System.out.println("In banck accounts equals");
		if (o instanceof BankAccount) {
			return this.accountNumber.equals(((BankAccount)o).accountNumber) ;
		}
		return false ;
	}
	
	@Override 
	public int compareTo(BankAccount anotherAccount) { // 
		System.out.println("In bankaccount compare to ");
		return this.accountNumber.compareTo(anotherAccount.accountNumber) ;
	}
	
	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
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
