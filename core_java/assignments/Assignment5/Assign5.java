/*
 Implement the following functions
1. Print following pattern having N lines void PrintPatter(int n) ;
*
##
***
####
*****

2. Print following pattern haivng N line
	void Printpattern2(int n):
		1
	   121
	  12321
	 1234321
	123454321

3. Set a valid month in the given date and erturn updated date.
	int SetMonthInDate(int date, int month);
	Month bits should be set in bits number 8-5 in date. Consider the 
	rightmost (LSB) having 0 as its bit position.
	Value of month will be used in place of mask. If we directly use value of month as mask then
	bits in date will not be set at correct position. We need to align the bits value of month to correct position. Use bit shifting.
*/
import java.util.*; 
class Assign5{
	public static void PrintPattern1(){
         Scanner scan = new Scanner(System.in); 
		 int n= scan.nextInt();


		for(int i = 1; i<=n; i++){
			if(i%2!=0){
				for(int j= 1;j<=i;j++){
		 	           System.out.print("*");
		 	         }
		 	         System.out.println("");
		}
            else{
               for(int j=1;j<=i;j++){
                      System.out.print("#");
                    }
                   System.out.println("");
                }
        }
	}




	public static void PrintTriangle(int rows){
		for(int presentRow=0; presentRow <= rows ; presentRow++ ){
//			System.out.println(presentRow) ;

			for (int i=1; i <= presentRow; i++){
				System.out.print(i) ;
			}

			System.out.print(presentRow+1) ;

//			System.out.print(presentRow) ;
			for (int i=presentRow; i>=1 && i>0 ;i--){
				System.out.print(i) ;
			}
			System.out.println() ;

		}

	} 

	public static int SetMonthInDate(int date, int month){
		int dateMonth = month<<5 ;
		dateMonth = date | dateMonth ;
		return dateMonth ;
	}

  	public static void main(String[] args){
				//PrintPattern1();
/*
/				PascalTriangle();
		Scanner scan = new Scanner(System.in) ;
        System.out.println("Enter a date and month.");
		System.out.print("Date = ") ;
	    int date =  scan.nextInt() ;

       //System.out.println("Checking the number of 1's ........") ;
   		System.out.print("Month = ") ;
		int month = scan.nextInt() ;
//		System.out.println(" "+count)>

//		System.out.print("")
//		System.out.println(SetMonthInDate(date,month)) ;
*/

		PrintTriangle(5) ;
      }

}
