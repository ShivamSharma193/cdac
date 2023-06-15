package tester;

import java.time.LocalDate;


import com.app.banking.AccountType;
import com.app.banking.BankAccount;
import static java.time.LocalDate.parse;
import static com.app.banking.TransferOperations.*;
import java.util.Scanner;

public class BankAccountTester {

	public static void main(String[] args) {
		
		try(Scanner scan = new Scanner(System.in)){
		
			BankAccount[] accounts = {new BankAccount((long) 201, "Suraj", AccountType.SAVING, 30000.0, parse("2022-01-22"))
				    , new BankAccount((long) 202, "Rohan", AccountType.SAVING, 20000.0, parse("2022-04-22"))
				    , new BankAccount((long) 203, "Sujit", AccountType.SAVING, 50000.0, parse("2022-02-22"))} ;
				                            		 
			boolean exit = false ;
			
			while(!exit) {
				System.out.println("Select one of the following option :\n"+ 
			    "1. Create Account\n2. Withdraw \n3. Deposit \n4. Transfer to another account \n5. Exit.\n");
				
				int index = 0 ;	
				switch (scan.nextInt()) {
				case 1:	
					System.out.println("Out of service\n");
					break;
				case 2 : 
					System.out.println("Account number to withdraw from and amount to wthdraw.\n");
					withdraw(accounts, scan.nextLong(), scan.nextDouble());
					break ;
				case 3 : 
					System.out.println("Account number to deposit from and amount to deposit.\n");
					deposit(accounts, scan.nextLong(), scan.nextDouble());
					break ;	
					
				case 4 : 
					System.out.println("From which account number to transfer, to which account number deposit, and amount to deposit.\n");
					transferFunds(accounts, scan.nextLong(), scan.nextLong(), scan.nextDouble());
					break ;	
					
				case 5 : 
					exit(0);
					break ;
					
				default:
					break;
				}
			}
		}	
	}
}
