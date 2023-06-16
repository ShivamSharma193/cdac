package tester;

import java.util.Scanner;

import stack.GrowableStack;
import stack.StaticStack;

public class GrowableStackTester {

	public static void main(String[] args) {
		GrowableStack stack = new GrowableStack(2);
		try (Scanner sc = new Scanner(System.in)) {
			/*
			 * stack.push(1); stack.push(20); stack.push(34); stack.push(45);
			 * stack.push(3232); System.out.println(stack.pop() );
			 * System.out.println(stack.pop());
			 */
		//	 System.out.println("In try");
			
			// Get binary corresponding to a number
			System.out.println("Enter a number to be converted to  bingary");
			int num = sc.nextInt();
			
			while (num != 0) {			 // Store the binary
				stack.push(num % 2);
				num /=  2;
			}
			
			while (!stack.isEmpty()) { 	// print the binary
				System.out.print(stack.pop() );
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
