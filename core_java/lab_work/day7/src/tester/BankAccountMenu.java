package tester;

import java.time.LocalDate;
import java.util.Scanner;

import com.app.banking.AccountType;
import com.app.banking.BankAccount;

import utils.ValidationRules;

import static java.time.LocalDate.parse ;

public class BankAccountMenu {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)){
			System.out.println("How many accounts do you want to open");
			int noOfAccounts = scan.nextInt() ;
			
			BankAccount[] accounts = new BankAccount[noOfAccounts] ;
			
			accounts[0] = new BankAccount(201L, "Suraj",AccountType.SAVING , 300000.0, parse("2022-01-22"))  ;
			accounts[1]  = new BankAccount(202L, "Rohan", AccountType.SAVING, 200000.0, parse("2022-04-22")) ;			
			
			boolean exit = false ;
			
			while(!exit) {
				System.out.println("Select one of the following option :\n"+ 
			    "1. Create Account\n2. Withdraw \n3. Deposit \n4. Transfer to another account \n5. Exit.");
				int index = 0 ;	
				switch (scan.nextInt()) {
				case 1:
					if (index < noOfAccounts) {
						System.out.println("Enter AccountNo");
						long acc = scan.nextLong();
							ValidationRules.checkForDuplicateAcc(acc, accounts);
						System.out.println("Enter AccountNo. CustomerName AccountType OpeningBalance AccountOpeningDate");
						accounts[++index] = new BankAccount(acc, scan.next(), AccountType.valueOf(scan.next()), scan.nextDouble(), parse(scan.next())) ;
					}else {
						System.out.println("Total no. of account exceeded") ;
					}					
					break;
				case 2 : 
						System.out.println();
					break ;
				default:
					break;
				}
				
				
			}
	//		acc1.withdraw(20000);
	//		acc2.deposit(3000);
	//		System.out.println(acc1) ;
	//		System.out.println(acc2) ;
	//		acc1.transferFunds(acc2, 12345);
		}
	}
}