package tester;

import static applications.ExpressionConversion.infixToPostfix;

public class InfixToPostfixTester {

	public static void main(String[] args) {
		try {
			System.out.println(infixToPostfix("(a*(b+c)+d/f*l)+(m+(n/o))"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
// "(a*(b+c)+d/f*l)+ (m+(n/o))" -> abc+*df/l*+mno/++ 