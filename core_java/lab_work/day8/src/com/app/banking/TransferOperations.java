package com.app.banking;

import java.util.List;
import com.app.banking.BankAccount;

public class TransferOperations {

	// Withdraw using account number
	// ------------------------------------------------------------
	public static void withdraw(List<BankAccount> accounts, long fromAccount, double amount) {
		int index = accounts.indexOf(new BankAccount(fromAccount));
		if (index != -1) {
			accounts.get(index).withdraw(amount, accounts.get(index).getAccountType());
		} else {
			System.out.println("Account doesn't exist");
		}
	}

	// Deposit using account number
	// -------------------------------------------------------------
	public static void deposit(List<BankAccount> accounts, long toAccount, double amount) {
		int index = accounts.indexOf(new BankAccount(toAccount)) ;
		if (index !=-1) {
				accounts.get(index).deposit(amount);
		}else 
			System.out.println("Account doesn't exist") ;
	}

	// Transfer Funds using account number
	// -------------------------------------------------------------
	public static void transferFunds(List<BankAccount> accounts, Long transferFrom, Long transferTo,
			double trasferAmount) {
		int indexFrom = accounts.indexOf(new BankAccount(transferFrom)) ;
		int indexTo = accounts.indexOf(new BankAccount(transferTo)) ;
		if (indexFrom !=-1 && indexTo != -1) {
			accounts.get(indexFrom).transferFund(accounts.get(indexTo), trasferAmount, accounts.get(indexFrom).getAccountType());
		}else 
		{	System.out.println("Account doesn't exist");}
	}

	/*
	 * // Transfer Funds using account number //
	 * --------------------------------------------------- public static void
	 * transferFunds(List<BankAccount> accounts, long transferFrom, long transferTo,
	 * double transactionammount) {
	 * 
	 * BankAccount fromAccount = null; BankAccount toAccount = null; boolean
	 * foundToAccount = false; boolean foundFromAccount = false;
	 * 
	 * for (BankAccount account : accounts) { if ((long) account.getAccountNumber()
	 * == transferFrom) { fromAccount = account; foundFromAccount = true; } else if
	 * ((long) account.getAccountNumber() == transferTo) { toAccount = account;
	 * foundToAccount = true; } } if (!foundFromAccount) { System.out.
	 * println("Account from which the money is to be trasffered does not exist.");
	 * } if (!foundToAccount) { System.out.
	 * println("Account to which the money is to be trasffered does not exist."); }
	 * fromAccount.transferFunds(toAccount, transactionammount);
	 */
	// }
}