package com.app.banking;

import java.time.LocalDate;

import custom_exceptions.InsufficientBalanceException;
import validation_rules.ValidationRules;

public class BankAccount implements Comparable<BankAccount> {
	private Long accountNumber;
	private String customrName;
	private AccountType accountType;
	private double accountBalance;
	private LocalDate openingDate;

	// Constructor
	// --------------------------------------------------------------------
	public BankAccount(Long accountNumber, String customrName, AccountType accountType, double accountBalance,
			LocalDate openingDate) {
		super();
		this.accountNumber = accountNumber;
		this.customrName = customrName;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
		this.openingDate = openingDate;
	}

	public BankAccount(Long accountNumber) {
		this.accountNumber = accountNumber;
	}

	// Override toString to print account details
	@Override
	public String toString() { // --------------------------------------------------------------
		return "BankAccount [accountNumber=" + accountNumber + ", customrName=" + customrName + ", accountType="
				+ accountType + ", accountBalance=" + accountBalance + ", openingDate=" + openingDate + "]";
	}

	// Override equals
	// --------------------------------------------------------------------
	@Override
	public boolean equals(Object o) {
		return (this.accountNumber).equals(((BankAccount) o).accountNumber);
	}

	// Override compareTo
	// --------------------------------------------------------------------
	@Override
	public int compareTo(BankAccount anotherAccount) {
		return (this.accountNumber).compareTo(anotherAccount.accountNumber);
	}

	
	
	
	
	
	
	// withdraw //
	// ------------------------------------------------------------------------
	public void withdraw(double debitAmount) {
		// Check for min balance condition
		ValidationRules.validateMinBal(this.accountBalance, debitAmount, this.accountType);
		this.accountBalance -= debitAmount ;
		/*
		 * if ((this.accountBalance - debitAmount) > accountType.getMIN_BAL()) {
		 * this.accountBalance -= debitAmount;
		 * System.out.println("Amount debited successfully!"+" "+ this.accountBalance);
		 * } else { System.out.println("Insufficient funds in account!"); }
		 */
	}

	// Deposit //
	// ------------------------------------------------------------------------
	public void deposit(double creditAmount) {
		this.accountBalance += creditAmount;
		System.out.println("Credit successfull" + " " + this.accountBalance);
	}


	// transfer funds
	// ------------------------------------------------------------------
	public void transferFund(BankAccount creditAccount, double trasferAmount) {
		double originalBal = this.accountBalance;
		this.withdraw(trasferAmount);
		if (accountBalance != originalBal) {
			creditAccount.accountBalance += trasferAmount;
			System.out.println(
					"Funds transferred successfully!" + " " + this.accountBalance + " " + creditAccount.accountBalance);
		}
	}
	
	
	public AccountType getAccountType() {
		return accountType;
	}

	public Object getAccountNumber() {
		// TODO Auto-generated method stub
		return null;
	}

}