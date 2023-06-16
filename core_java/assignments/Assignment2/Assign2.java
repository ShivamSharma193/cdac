/*
COP - Assignment 2
1. Check if a number is perfect or not.
	Perfect number is a positive integer that is equal to the
	sum of its factors(excluding the number itself)
	Test case : 6 = 1+2+3

2. Given a positive integer N, check if it is an armstrong number or not
	Armstrong number is a number that is the sum of its own digits
	each raised to the power of the number of digits
	Test case : 153

3.Find the count of a digit in a given positive integer
	Test case : 12123  has 2 1's, 2 2's and 1 3.

4. Given a positive integer N, print the digits in the number as words.
	Test case : 213 - two one three
*/

import java.util.Scanner ;
import java.lang.Math ;

public class Assign2{

	public static int sizeOfNumber(int num){
		int count = 0 ;
		while (copyNum>0){
			copyNum /= 10 ;
			count++ ;
		}
	}
	public static int[] findFactors(int num){ // ----------------------------------
		/*
		Find factors of given integer
		*/
		int[] factors = new int[num/2] ;

		for (int i=1 ; i<=num/2 ; i++){
			if (num%i==0) factors[i-1] = i ;
			else factors[i-1] = 0 ;
		}

		return factors ;
	}

	public static int addFactors(int num){ // -----------------------------------------
		/*
		Find sum of factors of a given number
		*/

		boolean isNumNegative = false  ;
		if (num<0){
			isNumNegative=true ;
			num *= -1 ;
		}
		int[] factors = findFactors(num) ;

 		// Add the factors
 		int sum = 0 ;
 		for (int i=0 ; i<factors.length; i++) {
			sum += factors[i] ;
 		}
 		if (isNumNegative)
 			return -1*sum ;
		else
			return sum ;
	}

	public static boolean isPerfect(int num){ //---------------------------------------
		/*
		Check if a number is perfect 
		*/
		if (num == addFactors(num))
			return true ;
		else
			return false ;

	}

	public static void isArmstrong(int num){ //---------------------------------------------
		/*
		Check if a number is armstrong or not
		*/

        int copyNum = num;
		// Get the number of digits in the number
		int count = 0 ;
		while (copyNum>0){
			copyNum /= 10;
			count++;
		}

		int  sum= 0;
		int  digit=0;

		copyNum = num;

		while(copyNum>0){
				digit = copyNum%10;
                sum  += ((int)Math.pow(digit,count));
                copyNum /=10;
		}

     	System.out.println(sum);
		if((int)Math.round(sum)==num)
			System.out.println("It is an armstrong no.");
		else
			System.out.println("It is not an armstrong no.");
//		System.out.println(sum) ;
	}

	public static void printDigits(int num){
		// Find the size of the number
		int size = size
	}

	public static void main(String[] argv){ // **********************************

		Scanner scan = new Scanner(System.in) ;
/*
	// Question 1.
	// Check if Number is perfect ------------------
		System.out.println("-------- I check if a number is perfect or Not ------------") ;
		System.out.print("num = ") ;
		int num = scan.nextInt() ;
		if (isPerfect(num))
			System.out.println(num + " is perfect.") ;
		else
			System.out.println(num+" is not perfect") ;
*/
/*
	// Question2
	//Check if a number is an Armstrong();
		System.out.println("-------- I check if a number is armstrong or Not ------------") ;
		System.out.print("num = ") ;
		int num = scan.nextInt() ;
		isArmstrong(num) ;
*/

	// Question 3
	// Find the count of a digits
		System.out.println("-------- I Find the number of appearances of a particular number "---) ;
		System.out.print("num = ") ;
		int num = scan.nextInt() ;
		findCountOfDigit(num) ;

	}
}
