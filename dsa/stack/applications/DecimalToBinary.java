package applications;

import stack.GrowableStack;

public class DecimalToBinary {
	public static String decimalToBinary(int num) throws Exception {
		String binary = "" ;
		GrowableStack stack = new GrowableStack(2);

		while (num != 0) {			 // Store the binary
			stack.push(num % 2);
			num /=  2;
		}
		
		while (!stack.isEmpty()) { 	// Store the binary in stack
			binary += stack.pop() ;
		}
		return binary ;
	}
}
