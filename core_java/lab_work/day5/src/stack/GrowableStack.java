package stack;

import customer.Customer;

public class GrowableStack<T> extends FixedStack<T> implements Stack<T>  {
	private T[] customerArray = new T<>[STACK_SIZE] ;
	private int top = -1 ;
	
	public boolean isFull(){
		if (top == STACK_SIZE-1) 
			return true;
		else 
			return false ;
	}
	public boolean isEmpty() {
		if (top == -1)
			return true ;
		else 
			return false ;
	}
	public void push(T c) {
		if (!isFull()) {
			customerArray[++top] = c;
			System.out.println("push success!");
			System.out.println(customerArray[top] + " ,pushed to stack.") ;
		}else {
			T[] tempArray = new T[customerArray.length*2] ;
			for (int i=0 ; i < customerArray.length; i++) {  // Copy the old array to larger array
				tempArray[i] = customerArray[i] ;
			}
			customerArray = tempArray ;
			customerArray[++top] = c ;
			System.out.println("push success!");
			System.out.println(customerArray[top] + " ,pushed to stack.") ;
		}
	}
	
	@Override
	public T pop() {
		if (!isEmpty()) {
			System.out.println("Pop Success!");
			System.out.println(customerArray[top] + " popped from stack");
			return customerArray[top--] ;
			

		}else {
			System.out.println("Stack underflow");
			return null ;
		}
	}
	
}
