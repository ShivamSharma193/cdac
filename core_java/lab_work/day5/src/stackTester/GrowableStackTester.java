package stackTester;

import customer.Customer;
import stack.GrowableStack;

public class GrowableStackTester {

	public static void main(String[] args) {
		
		
		GrowableStack stack = new GrowableStack() ;
		stack.push(new Customer(1, "Rohan", "address1"));
		stack.push(new Customer(2, "Rohan2", "address2"));
		stack.push(new Customer(3, "Rohan3", "address3"));
		stack.push(new Customer(4, "Rohan4", "address4"));
		stack.push(new Customer(5, "Rohan5", "address5"));
		stack.push(new Customer(6, "Rohan6", "address6"));
		stack.push(new Customer(7, "Rohan7", "address7"));
		stack.push(new Customer(8, "Rohan8", "address8"));
		stack.pop() ;
		stack.pop() ;
		stack.pop() ;
		stack.pop() ;
		stack.pop() ;
		stack.pop() ;
		stack.pop() ;
		stack.pop() ;
		stack.pop() ;
		stack.pop() ;
		
	}

}
