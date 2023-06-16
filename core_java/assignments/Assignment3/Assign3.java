/*
COP - lab Assignment 3 
1. Find the factorial of a number
2. Display prime numbers between 1 and N
3. Print Fibonacci Series till N
4. Calculate power of a number.
5. Calculate compound interest
*/
import java.util.Scanner  ;
public class Assign3{
	public static long FindFactorialOfN(int num){
		long fact = 1;
		while(num>=1){
			fact *= num ;
			num-- ;
		}
		return fact ;
	}

	public static boolean IsPrime(int num){
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

	public static void FindFibonacci (int upperBound){
		long f_n_2 = 0 ;
		long  f_n_1 = 1 ;
		long  fib = 0 ;
		if (upperBound==0) System.out.print(f_n_2) ;
		else if(upperBound==1) System.out.print(f_n_2+" "+ f_n_1 );
		else{
			System.out.print(f_n_2 + " "+ f_n_1 + " ") ;
			for (int i = 2; i<=upperBound ; i++ ){
				fib = f_n_1 + f_n_2 ;
				System.out.print(fib+" ") ;
				f_n_2 = f_n_1 ;
				f_n_1 = fib ;
			}
		}
		System.out.println("") ;
	}

	public static float FindPower(int base, int exponent){
		float power = 1 ;
		if (exponent>=0){
			for (int i = 0 ; i<exponent ;i++){
				power*= base ;
			}
			return power ;
		} else{
			for (int i = 0 ; i< -1*exponent ;i++){
				power/= base ;
			}
			return power ;
	
		}
	}
// --------------------------------------------------------
	public static void main(String[] argv){
		Scanner scan = new Scanner(System.in) ;

/* // Question 2  
		System.out.print("Enter the base :") ;
		int base = scan.nextInt() ;
		System.out.print("Enter the power(or exponent) : ") ;
		int power = scan.nextInt() ;
		System.out.println(FindPower(base, power) ) ;
*/
 /* // Question 3
		System.out.println("Enter an upper bound for Fibonacci Sequence")  ;
		int upperBound = scan.nextInt() ;
		FindFibonacci(upperBound) ;
*/

/* // Question 4
		System.out.println("Please input an upper bound") ;
		int upperBound = scan.nextInt() ;
		if (IsPrime(2)) System.out.println(2 + " is a prime.") ;
		for (int i = 3; i<=upperBound ;i+=2){
			if (IsPrime(i)) System.out.println(i + " is a prime.") ;
		}
*/
/* // Question 5
		int num = scan.nextInt() ;
		System.out.println(FindFactorialOfN(num) );
*/
	}
}
