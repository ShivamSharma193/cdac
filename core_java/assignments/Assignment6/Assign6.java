/*
Assignment 6
Implement the following methods for StudentInfo class.

class StudentInfo{
	int rollNo ;
	int sub1Marks ;
	int sub2Marks ;
	int sub3Marks ;
}
1. Student will pass if minimum marks in each subject is 40 and total marks are atleast 120. 
boolean isStudentPassed() ;

2. Student will fail if marks in any subject is less than 40 and total marks are less than 120.
boolean isStudentFailed() 
;

Test the implementation by createing a few objects for StudentInfo.
*/

public class StudentInfo{
	int rollNo = NULL ;
	int sub1Marks = NULL ;
	int sub2Marks = NULL ;

	public static void setMarks(int sub1Marks, int sub2Marks){
		this.sub1Marks = sub1Marks ;
		this.sub2Marks = sub2Marks ;
	}

//	public static int getMarks(int rollNo){
//		return this.sub1Marks, this.sub2Marks ;
//	}

	public static boolean isStudentPassed(){
		if (this.sub1Marks >=40 && this.sub2Marks >=40 && (this.sub1Marks+this.sub2Marks) >=120 )
			return true ;
		return false ;
	}

	public static boolean isStudentFailed(){
		if (this.sub1Marks < 40 && this.sub2Marks < 40 && (this.sub1Marks+this.sub2Marks) < 120 )
			return true ;
		return false ;
	}

	public static void main(String[] argv){
		setMarks(65, 43) ;
		System.out.println(isStudentPassed()) ;
	}
}
