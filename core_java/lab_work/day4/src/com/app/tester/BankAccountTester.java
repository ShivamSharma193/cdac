package com.app.tester;

import static java.time.LocalDate.parse ;

import java.util.Scanner;

import com.app.banking.BankAccount;

public class BankAccountTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		BankAccount acc1 = new BankAccount(201, "Suraj", "Saving", 300000.0, parse("2022-01-22")) ;
		BankAccount acc2 = new BankAccount(202, "Rohan", "Saving", 200000.0, parse("2022-04-22")) ;
		System.out.println(acc1);
		System.out.println(acc2);
		
		System.out.println("Enter amount to be withdrawn");
		acc1.withdraw(sc.nextInt());
		
		System.out.println("Enter amount to be deposited");
		acc2.deposit(sc.nextInt());
		
	//	System.out.println(acc1) ;
	//	System.out.println(acc2) ;
		System.out.println("Enter amount to be transferred") ;
		acc1.transferFunds(acc2, sc.nextInt());
		sc.close();
	}

}