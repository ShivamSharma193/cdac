package tester;

import java.util.Scanner;

import stack.StaticStack;

public class StackTester {

	public static void main(String[] args) {
		StaticStack stack = new StaticStack(10) ;
		try(Scanner sc = new Scanner(System.in)) {
			/*
			 * stack.push(1); stack.push(20); stack.push(34); stack.push(45);
			 * stack.push(3232); System.out.println(stack.pop() );
			 * System.out.println(stack.pop());
			 */
			System.out.println("Enter a number to be converted to binary");
			int num = sc.nextInt() ;
			while (num!= 0 ) {
				stack.push(num%2) ;
				num = num/2 ;
			}
			while(!stack.isEmpty()) {
				System.out.print(stack.pop());
			}
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
