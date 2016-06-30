package at.fhj.itm.herzelek15;

import static org.junit.Assert.*;

import org.junit.Test;

public class Point2dTest {
	
	/**
	 * Set some Point2d for testing their functionality
	 */
	
	Point2d p1 = new Point2d(3,2);
	Point2d p2 = new Point2d(2,2);
	Point2d p3 = new Point2d(3,4);
	

	/**
	 * Test the Setter of the x-coordinate
	 * - set the coordinate
	 * - get the value from the object
	 * - try to compare your value with the return value of x
	 */
	@Test
	public void testSetX(){
		
		p1.setX(3.0);
		assertEquals(3, p1.getX(), 0.00001);
		
	}

	/**
	 * Test the Setter of the y-coordinate
	 * - set the coordinate
	 * - get the value from the object
	 * - try to compare your value with the return value of y
	 */
	@Test
	public void testSetY(){
		
		p1.setY(2);
		assertEquals(2, p1.getY(), 0.00001);
		
	}
	

	/**
	 * Test the distanceFrom() Method
	 * - call the method distanceFrom and calculate the distance
	 * - calculate the distance by your own implementation
	 * - try to compare your result with the return value of distanceFrom()
	 */
	@Test
	public void testDistanceFrom(){
		
		Point2d p4 = new Point2d(3,3);
		Point2d p5 = new Point2d(2,2);
		
		double dist = p4.distanceFrom(p5);
		
		assertEquals(1.41421356, dist,0.01);
		
		
	}

	/**
	 * Test the distanceFromOrigin() Method
	 * - call the method distanceFromOrigin and calculate the distance
	 * - calculate the distance by your own implementation
	 * - try to compare your result with the return value of distanceFromOrigin()
	 */
	@Test
	public void testDistanceFromOrigin(){
		
		Point2d p6 = new Point2d(1,1);
		
		
		double dist = Math.sqrt(Math.pow(1, 2) + Math.pow(1, 2));
		assertEquals(1.41421, dist, 0.00001);
		
		
	}
}
