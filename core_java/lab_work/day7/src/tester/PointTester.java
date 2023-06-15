package tester;

import com.cdac.geometry.Point2D;
import static com.cdac.geometry.Point2D.* ;
public class PointTester {

	public static void main(String[] args) {
		Point2D pt = new Point2D(5,0) ;
		
		// Check if toString is overridden correctly
		System.out.println(pt);
	
		// Check if Two points are equal using custom method
//		Point2D pt2 = new Point2D(3, 5) ;
		System.out.println( pt.isEqual(new Point2D(2, 3)) ) ;
		
		// Check if two points are equal using overridden equals method
		Point2D pt2 = new Point2D(2,3) ;
		System.out.println(pt.equals(pt2 ));
		
		Point2D pt3 = new Point2D(0, 0) ;
		// Calculate distance between two points 
		System.out.println(calculateDistance(pt,pt3));
	}
	

}
