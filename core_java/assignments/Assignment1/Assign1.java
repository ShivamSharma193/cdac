/*
Assignment 1 for Concepts of Programming in Java


Part -A 
1. Print Hello World
2. Add two Numbers
3. Swap two numbers 
4. Calculate area of rectangle

PartB
1. Find all factors of a given positive integer N
2. Given a positive integer N, find its reverse.
3. Find sum of all numbers between two positive integers N anD M, including N and M.
4. Find prime numbers between two positive integers N and M, including N and M.
5. Find the first digit in a positive integer
6. Find the sum of all digit of a positive integer.
7. Find the sum of all digit of a integer (both positive and negative)
8. Find the product of all digit of a positive integer
9. Given a positive integer N, check if its a palindrome or not. A palindrome number is a number that is same as its reverse. 
*/
import java.util.Scanner ;
import java.lang.Math ;

public class Assign1{

	public static void addTwoNumbers(int num1, int num2){ // ---------------------------
		System.out.println("The sum of the numbers is ") ;
		System.out.println( num1 + num2) ;
		System.out.println() ;
	}

	public static void swapTwoNumbers(int num1, int num2){ // ---------------------------
		int temp = num2 ;
		num2 = num1  ;
		num1 = temp ;

		System.out.println("The swapped numbers are, ") ;
		System.out.print("num1 = " + num1 + " ") ;
		System.out.print("num2 = " + num2) ;
		System.out.println() ;
	}

	public static void calculateAreaOfRectangle(int length, int breadth){ //------------
		if (length > 0 && breadth > 0 ){
			System.out.println("The area of reactangle is " + length*breadth+ ".") ;
		}else{
			System.out.println("Length and breadth cannot be negative") ;
		}
	}

	public static void findFactors(int num){ // ---------------------------------------
		/*
		Find factors of given integer
		*/
		System.out.println("The factors are as followed") ;
		for (int i=1 ; i<=num/2 ; i++){
			if (num%i==0)
				System.out.print(i + " ") ;
		}
		System.out.println();
	}

	public static void reverseTheNumber(int num){ // -----------------------------------------
		int reverse = 0 ;
		int remainder = 0 ;
		int stop = 0  ;

		while(stop==0){
			remainder = num%10 ;
			num = num/10 ;
			reverse = reverse*10 + remainder ;
			if (num==0) stop =1 ;
		}

		System.out.println(reverse+" is the reversed number.") ;
	}

	public static void findSumBetweenNandM(int lowerBound, int upperBound){ //--------------

		// Check whether number are positive
		if (lowerBound<0 || upperBound<0)
			System.out.println("Invalid Input") ;
		else {
			// Check lower and upper bound
			if (lowerBound > upperBound){
				int temp = lowerBound ;
				lowerBound = upperBound ;
				upperBound = temp ;
			}

			int sum = (upperBound*(upperBound+1) - lowerBound*(lowerBound-1))/2 ;
			System.out.println(sum + " is the sum of numbers between given numbers.") ;
		} // End of else 

	}

	public static void findFirstDigit(int num){ //------------------------------------------
		int firstNumber = 0 ;
		while (num>0){
			firstNumber = num%10 ;
			num /= 10 ;
		}
		System.out.println(firstNumber + " is the first digit of the given number.") ;
		System.out.println() ;
	}

	public static boolean isPrime(int num){ //---------------------------------------------
		/*
		Check if a number is prime
		*/
		int upperBound = (int)Math.round(Math.sqrt(num))+1 ;
		if (num%2==0)
			return false ;
		else {

			for (int i=3 ; i< upperBound ; i+=2  ){
				if (num%i==0) return false ;
			}

		}
		return true ;
	}



	public static void findPrimesBetweenNandM(int num1, int num2){ // --------------
		/*
		Find Primes between two given numbers
		*/
		// Set bound

			int lowerBound = num1 ;
			int upperBound = num2 ;

		if (num2 < num1){
			lowerBound = num2 ;
			upperBound = num1 ;
		}
//		else {
//			lowerBound = num1 ;
//			upperBound = num2 ;
//		}

		if (lowerBound%2 == 0) lowerBound++ ;

		for (int i =lowerBound ; i<= upperBound ; i+=2){
			if (isPrime(i)){
				System.out.print(i+", ") ;
			}
		}

	}

	public static void addDigits(int num ){ //----------------------------------------
		int sum = 0 ;
		if (num<0){
			num = -1*num ;
		}
		
		while(num > 0) {
			sum += num%10 ;
			num /= 10 ;
		}
		System.out.println(sum + " is the sum of the digits of the given Number.") ;
	}

	public static void multiplyDigits(int num ){ //------------------------------------
		int product = 1  ;
		if (num<0){
			num = -1*num ;
		}
		
		while(num > 0) {
			product *= num%10 ;
			num /= 10 ;
		}
		System.out.println(product + " is the product of the digits of the given Number.") ;

	}

	public static void  checkIfPalindrome(int num){ // ---------------------------------
		int reverse = 0 ;
		int remainder = 0 ;
		int stop = 0  ;
		int copyNum = num ;
		while(stop==0){
			remainder = copyNum%10 ;
			copyNum /= 10 ;
			reverse = reverse*10 + remainder ;
			if (copyNum==0) stop =1 ;
		}
		
		if (reverse == num){
			System.out.println("The given number is a palindrome.") ;
		}else {
			System.out.println("The given number is not a palindrome.") ;
		}

	}

	public static void main( String[] argv){

		Scanner scan = new Scanner(System.in) ;
/*
		// 	Part A - Question 1
		System.out.println("Hello World!") ;
*/
/*
		// Part A - Question 2  and Question 3
		System.out.println("Enter two integers ") ;
		System.out.print("num1 = ") ;
		int num1 = scan.nextInt() ;
		System.out.print("num2 = ") ;
		int num2 = scan.nextInt() ;
		scan.close() ;
		addTwoNumbers(num1, num2) ;
		swapTwoNumbers(num1, num2) ;
*/
/*
		// Part A - Question 4 
		System.out.println("----------- I Calculate the Area of a Rectangle ------------------") ;
		System.out.println("Please Enter length and breadth of the rectangle") ;
		System.out.print("length = ");
		int length = scan.nextInt() ;
		System.out.print("breadth = ") ;
		int breadth = scan.nextInt() ;

		calculateAreaOfRectangle(length, breadth) ;
*/
/*
		// Part B - Question 1
		System.out.println("---------- I calculate factors of a given number ---------------") ;
		System.out.print("Num = ") ;
		int num = scan.nextInt() ;

		findFactors(num) ;
*/
/*
		// Part B - Question 2 
		System.out.println("--------- I reverse the number you give me -----------------") ;
		System.out.print("Num = ") ;
		int num = scan.nextInt() ;
		reverseTheNumber(num) ;
*/
/*
		// Part B - Question 3.
		System.out.println("-------- I calculate the sum of numbers between two numbers ----");
		System.out.println("Enter two positive integers") ;
		System.out.print("num1 = ") ;
		int num1 = scan.nextInt() ;
		System.out.print("num2 = ") ;
		int num2 = scan.nextInt() ;
		findSumBetweenNandM(num1, num2) ;
*/

/*
		// Part B - Question 4 
		System.out.println("-------- I find the primes between two numbers ----");
		System.out.println("Enter two positive integers") ;
		System.out.print("num1 = ") ;
		int num1 = scan.nextInt() ;
		System.out.print("num2 = ") ;
		int num2 = scan.nextInt() ;
		if (num1 > 0 && num2 > 0){
			System.out.println("The primes beween given numbers are as follows") ;
			findPrimesBetweenNandM(num1,num2) ;
		}else {
			System.out.println("The input is not valid.") ;
		}
*/

/*
		// Part B - Question 5 
		System.out.println("--------- I find the first digit of a number ----------------") ;
		System.out.println("Enter a positive integer ") ;
		System.out.print("num = ")  ;
		int num = scan.nextInt() ;
		if (num > 0 ){
			findFirstDigit(num) ;
		}else {
			System.out.println("You were supposed to enter a positive integer") ;
		}
*/
/*
		// Part B - Question 6 & 7 
		// Treat the digits of negative number as positive values
		System.out.println("--------- I find the sum of digits of a number -------------") ;
		System.out.println("Enter a number") ;
		int num = scan.nextInt() ;

		addDigits(num) ;
*/
/*
		// Part B - Question 8
		System.out.println("------- I find the product of digits of a number -----------") ;
		System.out.println("Enter a number ") ;
		int num = scan.nextInt() ;
		multiplyDigits(num) ;
*/
		// Part B - Question 9 
		System.out.println("------- I check if a number is palindrome -----------") ;
		System.out.println("Enter a number ") ;
		int num = scan.nextInt() ;
		checkIfPalindrome(num) ;

	}
}
