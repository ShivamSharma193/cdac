package utils;
import com.app.banking.AccountType;
import com.app.banking.BankAccount;

import exceptions.AccountAlreadyExistsException;
import exceptions.InvalidOpeningBalException;

public class ValidationRules {
	
	// Validate minimum account balance when opening new account
	
	public static void validateMinBal  (Double openingBal, AccountType type) throws InvalidOpeningBalException {
		if (openingBal< type.getMIN_BALANCE()) 
			throw new InvalidOpeningBalException("Oopps! Opening balance less than minimum balance.") ;
		
	}
	
	
	// Validate minAccount balance for withdrawl
	public static void validateMinBalance(Double accountBalance, Double debitAmount, AccountType type) throws InvalidOpeningBalException {
		if ((accountBalance - debitAmount) < type.getMIN_BALANCE());
			throw new InvalidOpeningBalException("Oopps! Cannot withdraw, balance less than minimum balance");
			
	}
	
	// Check for duplicate account
	public static void checkForDuplicateAcc(Long accountNumber, BankAccount[] accounts) throws AccountAlreadyExistsException {
		for (BankAccount account : accounts ) {
			if(accountNumber.equals(account.getAccountNumber()))
				throw new AccountAlreadyExistsException("Account already exists with given account number");
		}
	}	
}	


