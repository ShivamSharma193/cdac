package stackTester;

import java.util.Scanner;

import customer.Customer;
import stack.FixedStack;
import stack.GrowableStack;
import stack.Stack;

public class StackMenuTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		Stack stack = null;
		boolean exit = false ; 
		boolean stackDecided = false ;
		while (!exit) {
			System.out.println("Choose one of the follwing\n 1. Fixed \n 2. Growable Stack \n 3. Push data \n 4. Pop data \n 5. Exit");
			switch (sc.nextInt()){
				case	1 :
					if(!stackDecided) {
						stack = new FixedStack() ;
						stackDecided = true ;
					}else {
						System.out.println("Stack already selected.");
					}
					break ;
				case 2 :
					if(!stackDecided) {
						stack = new GrowableStack() ;
						stackDecided = true ;
					}else {
						System.out.println("Stack already selected.");
					} 
					break ;
				case 3: // push data 
					System.out.println("Enter the follwing: id Name Address.");
					stack.push(new Customer(sc.nextInt(), sc.next(), sc.next()) ) ;
					break ;
				case 4 : // Pop data 
					stack.pop() ;
					break ;
				case 5 :  // Exit 
					exit = true ;
					System.out.println("Bye! ");
					break ;
			}
		}
		sc.close() ;
		
	}

}
