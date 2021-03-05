package org.howard.edu.lsp.assignment4.test;
import org.howard.edu.lsp.assignment4.implementation.IntegerSet;
import org.howard.edu.lsp.assignment4.implementation.EmptySetException;

/**
 * This class is used as the driver class for the IntegerSet file
 * @author Deante Taylor
 *
 */

public class IntegerSetDriver {
	
	
	/**
	 * This main method is used to call and test the methods in IntegerSet
	 * @param args
	 */
	
	public static void main(String[] args) {
		/**
		 * Testing Add, Length, isEmpty and Clear methods
		 */
		System.out.println("Test Case One");
		IntegerSet test_set1 = new IntegerSet();
		test_set1.add(56);
		System.out.println("Test to see Add Method: " + test_set1.toString());
		System.out.println("Test to see Length method: " + test_set1.length());
		System.out.println("Test to see Empty Method: " + test_set1.isEmpty() );
		test_set1.clear();
		System.out.println("Test to see Clear Method: " + test_set1.toString());
		System.out.println("Length after Clear Method: " + test_set1.length());
		System.out.println("Test to see Empty Method: " + test_set1.isEmpty() + "\n");
		
		/**
		 * Testing Add, Equals and Remove method
		 */
		System.out.println("Test Case Two");
		IntegerSet test_set2 = new IntegerSet();
		test_set2.add(10);
		test_set2.add(13);
		test_set2.add(15);
		
		test_set1.add(10);
		test_set1.add(13);
		test_set1.add(15);
		System.out.println("Test to see Add Method on set2: " + test_set2.toString());
		System.out.println("Test to see Add Method on set1: " + test_set2.toString());
		System.out.println("Test to see Equals Method: "  + test_set1.equals(test_set2));
		test_set2.remove(13);
		test_set2.remove(15);
		System.out.println("Test to see Remove Method: " + test_set2.toString());
		System.out.println("Test to see Equals Method: " + test_set1.equals(test_set2) + "\n");
		

		/**
		 * Testing  Smallest, Largest, Union, Difference, Intersection
		 */
		System.out.println("Test Case Three");
		IntegerSet test_set3 = new IntegerSet();
		test_set3.add(21);
		test_set3.add(17);
		test_set3.add(5);
		test_set3.add(16);
		
		try {
			System.out.println("Testing Smallest Method: " + test_set3.smallest());
		}
		catch (EmptySetException EmptyError) {
			System.out.println(EmptyError.getMessage());
		}
		
		try {
			System.out.println("Testing Largest Method: " + test_set3.largest());
		}
		catch (EmptySetException EmptyError) {
			System.out.println(EmptyError);
		}
		test_set3.clear(); /* Testing when the set is empty */
		try {
			System.out.println(test_set3.smallest());
		}
		catch (EmptySetException EmptyError) {
			System.out.println("The set is empty thus EmptySetException: " + EmptyError.getMessage());
		}
		
		try {
			System.out.println(test_set3.largest());
		}
		catch (EmptySetException EmptyError) {
			System.out.println("The set is empty thus EmptySetException: " + EmptyError.getMessage());
		}
		
		test_set3.add(21);
		test_set3.add(17);
		test_set3.add(5);
		

		IntegerSet test_set4 = new IntegerSet();
		test_set4.add(21);
		test_set4.add(17);
		test_set4.add(5);
		test_set4.add(16);
		test_set4.union(test_set3);
		
		System.out.println("Testing Union Method: " + test_set4.toString());
		
		test_set4.diff(test_set3);
		System.out.println("Testing Diff Method " + test_set4.toString());
		test_set4.add(21);
		test_set4.add(17);
		test_set4.add(5);
		test_set4.add(16);
		test_set4.intersect(test_set3);
		System.out.println("Testing Intersect Method " + test_set4.toString());
		
	
		
		
	};
}