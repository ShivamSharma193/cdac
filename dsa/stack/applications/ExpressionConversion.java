package applications;

import java.util.Arrays;

import stack.GenericGrowableStack;
import stack.GenericStack;
import stack.GrowableStack;
import stack.Stack;

//import static applications.ExpressionConversion.infixToPostfix ;
public class ExpressionConversion {
	public static int getPrecedence(char operator) {
		switch (operator) {
		case '/':
			return 1;

		case '*':
			return 1;
		case '+':
			return 0;
		case '-':
			return 0;
		default:
			return -1;
		}
	}
	

	public static char[] infixToPostfix(char... infix) throws Exception {
		int counter = 0;		
		GenericStack<Character> stack = new GenericGrowableStack<>() ;
		char[] postfix = new char[infix.length];
		
		for (char c : infix) {
			if (c >= 'a' && c <= 'z') { // add operands to postfix output
		//		System.out.println("is operand");
				postfix[counter++] = c;
			} else {
				System.out.println(c + " is not operand");
				if (c == '(') { // If '(', add to stack
					stack.push(c);
				} else if (c == ')') { // If ')' pop all elements in stack till '('
					while (stack.peek() != '(') {
						postfix[counter++] = stack.pop();
					}
					stack.pop() ;
					// If stack is not empty, pop the top element add it to postfix output and add the new element 
					//if the precedence of new operator is higher than the top element
				} else if ( (!stack.isEmpty()) && (getPrecedence( stack.peek()) > getPrecedence(c))) {
					System.out.println("Popping ") ;
					char temp =  stack.pop() ;
					postfix[counter++] = temp ;
					System.out.println("Popped " + temp );
					System.out.println("pushing " + c);
					stack.push(c);
				} else { // If stack is empty or precedence of the new operator is higher than the top element
					stack.push(c);
				}
			}
			System.out.println(postfix);
		}
		postfix[counter++] = stack.pop();
		return postfix;
	}

	public static String infixToPostfix(String infix) throws Exception {
			char[] postfix = infixToPostfix(infix.toCharArray()) ;
			String postfixString = "";
			for(char c : postfix) { // Char =[] to string 
				postfixString += c ;
			}
		return postfixString  ;
		
	}
	


}
