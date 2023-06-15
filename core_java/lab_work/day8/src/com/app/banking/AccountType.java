package com.app.banking;

public enum AccountType {
	SAVING(3000), CURRENT(1000) ;
	
	private final double MIN_BAL ;
	
	
	
	AccountType(double MIN_BALANCE){
		this.MIN_BAL = MIN_BALANCE ;
	}



	public double getMIN_BAL() {
		return MIN_BAL;
	}
}