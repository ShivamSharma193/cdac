package generic_stack;

import customer.Customer;

public class GrowableStack implements Stack {
	private Customer[] customerArray = new Customer[STACK_SIZE] ;
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
	public void push(Customer c) {
		if (!isFull()) {
			customerArray[++top] = c;
			System.out.println("push success!");
			System.out.println(customerArray[top] + " ,pushed to stack.") ;
		}else {
			Customer[] tempArray = new Customer[customerArray.length*2] ;
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
	public Customer pop() {
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
