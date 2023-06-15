package tester;

import java.util.Scanner;
import static com.cdac.geometry.Point2D.* ;
import com.cdac.geometry.Point2D;

public class driverMenu {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			
			int count = 0 ;
			boolean exit = false ;
			
			while (!exit) {
				
				System.out.println("Select the number of menu item ");
				System.out.println("1. Enter points\n2. Compare two points");
				int totalPoints = sc.nextInt() ;
				Point2D[] points = new Point2D[totalPoints] ; 
				
				System.out.println("How many points do you want to enter?");
				System.out.println("Please enter the x and y coordinates");
				for (int i=0 ; i<totalPoints ; i++) {
					System.out.println("x and y for "+ i+1 + "th point") ;
					points[i] = new Point2D(sc.nextInt(), sc.nextInt()) ;
				}
				
				System.out.println("The points entered so far are as below");
				for (Point2D pointObj : points) {
					System.out.println(pointObj);
				}
				
				System.out.println("Enter indices of two points to compare. Index start from 0");
				System.out.print("index1(int) = ");
				int index1 = sc.nextInt() ;
				System.out.print("index2(int) = ");
				int index2 = sc.nextInt() ;	
				if ((index1<totalPoints && index1>=0) && (index2<totalPoints && index2>0)) {
					if ((points[index1]).isEqual(points[index2])) {
						System.out.println("Points are equal");
					}else {
						System.out.println("Points are not equal") ;
						System.out.println("Distance between the points is "+ calculateDistance(points[index1], points[index2])) ;
					}
				}else 
					System.out.println("Invalid indexes") ;
				System.out.println("Terminating. Sayonara.......") ;
			
		
			}
		}	
	}
}
