package stackTester;

import customer.Customer;
import stack.FixedStack;

public class FixedStackTester {

	public static void main(String[] args) {
		
		
		FixedStack stack = new FixedStack() ;
		stack.push(new Customer(1, "Rohan", "address1"));
		stack.push(new Customer(2, "Rohan2", "address2"));
		stack.push(new Customer(3, "Rohan3", "address3"));
		stack.push(new Customer(4, "Rohan4", "address4"));
		stack.push(new Customer(5, "Rohan5", "address5"));
		stack.pop() ;
		stack.pop() ;
		stack.pop() ;
		stack.pop() ;
		stack.pop() ;
		
	}

}
