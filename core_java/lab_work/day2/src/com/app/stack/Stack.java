package com.app.stack;

import com.app.core.Customer;

public interface Stack {
	int STACK_SIZE = 4 ;
	
	public void push(Customer c) ;
	public Customer pop() ;
	boolean isFull() ;
	boolean isEmpty() ;
}
