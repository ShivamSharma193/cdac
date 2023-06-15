package tester;

import java.util.Scanner;
import static com.cdac.geometry.Point2D.* ;
import com.cdac.geometry.Point2D;

public class driver {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			
			System.out.println("How many points do you want to enter?");
			int totalPoints = sc.nextInt() ;
			Point2D[] points = new Point2D[totalPoints] ; 
			
			System.out.println("Please enter the x and y coordinates");
			for (int i=0 ; i<totalPoints ; i++) {
				System.out.println("x and y for "+ i+1 + "th point") ;
				points[i] = new Point2D(sc.nextInt(), sc.nextInt()) ;
			}
			
			System.out.println("The points entered so far are as below");
			for (Point2D pointObj : points) {
				System.out.println(pointObj);
			}
			
			System.out.println("Enter indices of two points to compare");
			System.out.print("index1 = ");
			int index1 = sc.nextInt() ;
			System.out.print("index2 = ");
			int index2 = sc.nextInt() ;	
			
			if ((points[index1]).isEqual(points[index2])) {
				System.out.println("Points are equal");
			}else {
				System.out.println("Points are not equal") ;
				System.out.println("Distance between the points is "+ calculateDistance(points[index1], points[index2])) ;
			}
			System.out.println("Terminating. Sayonara.......") ;
			
		}
	}
}
