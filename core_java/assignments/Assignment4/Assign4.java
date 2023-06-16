/*
Assignment 4 

1. Following function will count number of bits with value as 1, 
in the number passed as argument and return that count.
int CountOneBits(byte num) ;


2.Following function will set the value of specified bit in the number passed as argument.
 Function will return the updated value byte SetBitTooOneOne(byte num, int bitPosition) ;
Consider the rightmost (LSB) having zero as its bit position.

3. Following function wiil get the value of specified bit in the number passed as argument. Function will return the bit value
int GetValueOfBit(byte num, int bitPosition) ;
Consider the right most (LSB) having zero as its bit position .

Implement all the above functions for int values instead of byte. 
*/
import java.lang.Math ;
import java.util.Scanner ;
public class Assign4{
/*	public static int CountOneBits(byte num){
		int count = 0 ;
//		double base = 2 ;
		byte[] mask = {2,4,8,16,32,64} ;
		for (int i=0 ; i<6 ; i++){
//			double mask = Math.pow(2,i) ;
//			System.out.println(mask) ;
			if ( (num & mask[i]) != 0)
				count++ ;
		}
             System.out.println(mask) ;
		return count ;
	}
*/
	 public static int CountOneBit(int num){ //********************************
		/*
		Cound the number of 1's in a given number
		*/
        int count = 0 ;
        for ( int i=1; (i>0)&&(i<=2147483647); i*=2){
//			System.out.print(i) ;
			if( (num&i)!=0 ){
   				count++;
            }
        }
        return count ;
    }

    public static int SetBitToOne(int num, int bitPosition){
		/*
		Set bit and give the updated number 
		*/
		int mask = 1 ;
		for (int i = 1 ; i<bitPosition ; i++){ // Calculate 2**i
			mask *= 2 ;
		}
//		System.out.println(mask);
		int updatedBit = num| mask ;
		return updatedBit ;
    }

    public static int SetBitToOe(int num, int bitPosition){
        /*
        Set bit and give the updated number 
        */
        
        int mask = (int)Math.pow(2,bitPosition-1);
//      System.out.println(mask);
        int updatedBit = num| mask ;
        return updatedBit ;
    }

    public static int GetValueOfBit(int num, int bitPosition){
		/*
		Set bit and give the updated number 
		*/
		int mask = 1 ;
		for (int i = 1 ; i<bitPosition ; i++){ // Calculate 2**i
			mask *= 2 ;
		}
//		System.out.println(mask);
		int updatedBit = num& mask ;
		if (updatedBit==mask){
			return 1 ;
		}else {
			return 0 ;
		}
    }





	public static void main(String[] argv) {
		Scanner scan  = new Scanner(System.in) ;

/* // Question 1
		System.out.println("Enter a number between 1 and 2147483648.");
		int num =  scan.nextInt() ;
		//System.out.println("Checking the number of 1's ........") ;
        int count = CountOneBit(num) ;
		System.out.println("The number of 1's in the bit representation of given numbers is "+count) ;
*/

/*  // Question 2
  		System.out.println("Enter a number and the position to be set ");
		System.out.print("Number = ");
  		int num = scan.nextInt() ;
		System.out.print("Bit Position = ") ;
  		int bitPosition = scan.nextInt() ;
  	//	System.out.println("The updated bit is " + SetBitToOne(num, bitPosition)) ;
  	 	System.out.println("The updated bit is " + SetBitToOe(num, bitPosition)) ;
*/

 // Question 3 
  		System.out.println("Enter a number and the position to be set ");
		System.out.print("Number = ");
  		int num = scan.nextInt() ;
		System.out.print("Bit Position = ") ;
  		int bitPosition = scan.nextInt() ;
		System.out.println("The value of bit at given position is " + GetValueOfBit(num, bitPosition)) ;
//	System.out.println(count) ;
	}

}
