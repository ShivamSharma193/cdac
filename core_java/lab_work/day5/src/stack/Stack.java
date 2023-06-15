package stack;

import customer.Customer;

public interface Stack<T> {
	int STACK_SIZE = 4 ;
	
	public void push(T c) ;
	public T pop() ;
	boolean isFull() ;
	boolean isEmpty() ;
}
