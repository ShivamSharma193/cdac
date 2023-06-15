package com.app.banking;

public enum AccountType {
// Account Types
	SAVING(3000), CURRENT(2000), FD(10000), NRE(5000), LOAN(1000), NRO(2500) ;
	private int  MIN_BALANCE ;
	
	private AccountType(int minBalance) {
		this.MIN_BALANCE = minBalance  ;
	}

	public int getMIN_BALANCE() {
		return MIN_BALANCE;
	}
	
	@Override
	public String toString() {
		return this.name() + "@" + MIN_BALANCE ;
	}
	
}
