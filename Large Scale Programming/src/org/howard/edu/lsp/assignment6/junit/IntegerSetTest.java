package org.howard.edu.lsp.assignment6.junit;

import static org.junit.jupiter.api.Assertions.*;
import org.howard.edu.lsp.assignment6.integerset.IntegerSet;
import org.howard.edu.lsp.assignment6.integerset.IntegerSetException;
import org.howard.edu.lsp.assignment4.implementation.EmptySetException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class IntegerSetTest {
	
	private final IntegerSet test1 = new IntegerSet();
	private final IntegerSet test2 = new IntegerSet();
	private final IntegerSet test3 = new IntegerSet();
	
	
	@Test
	@DisplayName("Testing Add Method")
	public void testAddMethod1() {
		test1.add(21);
		assertFalse(test1.isEmpty());
	};
	
	@Test
	@DisplayName("Testing Add Method with String character")
	public void testAddMethod2() {
		test1.add('D');
		
		assertFalse(test1.isEmpty());
	};
	
	
	@Test
	@DisplayName("Testing Length Method")
	public void testLengthMethod1() {
		test1.add(2);
		test1.add(1);

		
		int test1_length = test1.length();
		
		assertTrue(test1_length == 2);
	};
	
	@Test
	@DisplayName("Testing Length Method with empty set")
	public void testLengthMethod2() {

		int test1_length = test1.length();
		
		assertTrue(test1_length == 0);
	};
	
	
	
	@Test
	@DisplayName("Testing Clear Method")
	public void testClearMethod1() {
		test1.add(5);
		test1.add(12);
		test1.add(300);
		test1.clear();
		assertTrue(test1.length() == 0);
	};
	
	
	@Test
	@DisplayName("Testing isEmpty Method on set with one item")
	public void testEmptyMethod1() {
		test1.add(1);
		assertFalse(test1.isEmpty());
	};
	
	@Test
	@DisplayName("Testing isEmpty Method on empty set")
	public void testEmptyMethod2() {
		assertTrue(test1.isEmpty());
	};
	
	@Test
	@DisplayName("Testing IsEmpty method after clearing the set")
	public void testEmptyMethod3() {
		test1.add(1);
		test1.clear();
		assertTrue(test1.isEmpty());
	};
	
	
	@Test
	@DisplayName("Testing EqualMethod on two equal sets")
	public void testEqualMethod1() {
		test1.add(5);
		test1.add(12);
		test1.add(300);
		
		test2.add(5);
		test2.add(12);
		test2.add(300);
		
		assertTrue(test1.equals(test2));
	};
	
	@Test
	@DisplayName("Testing equal method on two unequal sets")
	public void testEqualMethod2() {
		test1.add(5);
		test1.add(120);
		test1.add(9);
		
		test2.add(5);
		test2.add(12);
		test2.add(300);
		
		assertFalse(test1.equals(test2));
	};
	
	
	
	@Test
	@DisplayName("Testing Remove Method when removing one item from set")
	public void testRemoveMethod1() {
		test1.add(5);
		test1.add(12);
		test1.add(300);
		
		test2.add(5);
		test2.add(12);
		test2.add(300);
		
		test1.remove(5);
		test2.remove(5);
		
		
		assertTrue(test1.equals(test2));
	};
	
	@Test
	@DisplayName("Testing remove method with number not in set")
	public void testRemoveMethod2() {
		test1.add(5);
		test1.add(12);
		test1.add(300);
		
		test2.add(5);
		test2.add(5);
		test2.add(12);
		test2.add(300);
		
		test2.remove(10000);
		
		
		assertTrue(test1.equals(test2));
	};
	
	@Test
	@DisplayName("Testing Remove method with duplicates")
	public void testRemoveMethod3() {
		test1.add(5);
		test1.add(12);
		test1.add(300);
		
		test2.add(5);
		test2.add(5);
		test2.add(12);
		test2.add(300);
		
		test2.remove(5);
		
		
		assertFalse(test1.equals(test2));
	};
	
	
	
	@Test
	@DisplayName("Testing Contains Method with item contained in set ")
	public void testContainsMethod1() {
		test1.add(5);
		test1.add(12);
		test1.add(300);
		
		assertTrue(test1.contains(300));
	};
	
	@Test
	@DisplayName("Testing contains methjod with number not in set")
	public void testContainsMethod2() {
		test1.add(5);
		test1.add(12);
		test1.add(300);
		
		assertFalse(test1.contains(25));
	};
	
	
	@Test
	@DisplayName("Testing Larget Method")
	public void testLargestMethod1() {
		test1.add(5);
		test1.add(12);
		test1.add(300);
		int largest = 0;
		
		try {
			largest = test1.largest();
		}
		catch (EmptySetException e) {
			System.out.println(e.getMessage());
		}
		
		assertTrue(largest == 300);
	};
	
	@Test
	@DisplayName("Testing Largest Method with duplicates")
	public void testLargestMethod2() {
		test1.add(5);
		test1.add(5);
		test1.add(2);
		test1.add(1);
		int largest = 0;
		
		try {
			largest = test1.largest();
		}
		catch (EmptySetException e) {
			System.out.println(e.getMessage());
		}
		
		assertTrue(largest == 5);
	};
	
	@Test
	@DisplayName("Testing Largest Method with negative duplicate numbers")
	public void testLargestMethod3() {
		test1.add(-23);
		test1.add(-11);
		test1.add(-23);

		int largest = 0;
		
		try {
			largest = test1.largest();
		}
		catch (EmptySetException e) {
			System.out.println(e.getMessage());
		}
		assertTrue(largest == 0);
	};
	
	@Test
	@DisplayName("Testing largest method with empty set")
	public void testLargestMethod4() {
		int largest = 0;
		
		try {
			largest = test1.largest();
		}
		catch (EmptySetException e) {
			System.out.println(e.getMessage());
		}
		
		assertTrue(largest == 0);
	};
	
	@Test
	@DisplayName("Testing Smallest Method")
	public void testSmallestMethod1() {
		test1.add(5);
		test1.add(12);
		test1.add(300);
		int smallest = 0;
		
		try {
			smallest = test1.smallest();
		}
		catch (EmptySetException e) {
			System.out.println(e.getMessage());
		}
		
		
		assertTrue(smallest == 5);
	};
	
	@Test
	@DisplayName("Testing Smallest Method with duplicates")
	public void testSmallestMethod2() {
		test1.add(5);
		test1.add(5);
		int smallest = 0;
		
		try {
			smallest = test1.smallest();
		}
		catch (EmptySetException e) {
			System.out.println(e.getMessage());
		}
		
		assertTrue(smallest == 5);
	};
	
	@Test
	@DisplayName("Testing smallest method with negatives")
	public void testSmallestMethod3() {
		test1.add(-23);
		test1.add(-11);
		int smallest = 0;
		
		try {
			smallest = test1.smallest();
		}
		catch (EmptySetException e) {
			System.out.println(e.getMessage());
		}
		
		assertFalse(smallest == -11);
	};
	
	@Test
	@DisplayName("Testing smallest method with empty set")
	public void testSmallestMethod4() {
		int smallest = 0;
		
		try {
			smallest = test1.smallest();
		}
		catch (EmptySetException e) {
			System.out.println(e.getMessage());
		}
		
		assertTrue(smallest == 0);
	};
	
	
	@Test
	@DisplayName("Testing Union Method")
	public void testUnionMethod1() {
		test1.add(5);
		test1.add(12);
		test1.add(300);
		
		
		test2.add(50);
		test1.union(test2);
		
		test3.add(5);
		test3.add(12);
		test3.add(300);
		test3.add(50);
		
		assertTrue(test1.equals(test3));
	};
	
	@Test
	@DisplayName("Testing Union Method with empty set")
	public void testUnionMethod2() {
		test1.add(3);
		test1.add(200);
		
		test1.union(test2);
		
		test3.add(3);
		test3.add(200);
		assertTrue(test1.equals(test3));
	};
	
	
	
	@Test
	@DisplayName("Testing Intersect Method")
	public void testIntersectMethod1() {
		test1.add(5);
		test1.add(12);
		test1.add(300);
		
		
		test2.add(50);
		test2.add(5);
		test2.add(12);
		
		test1.intersect(test2);
		
		test3.add(5);
		test3.add(12);
		
		assertTrue(test1.equals(test3));
	};
	
	@Test
	@DisplayName("Testing Intersect Method with sets that have no intersect")
	public void testIntersectMethod2() {
		test1.add(5);
		
		test2.add(50);
		
		test1.intersect(test2);
		
		assertTrue(test1.equals(test3));
	};
	
	@Test
	@DisplayName("Testing Diff Method")
	public void testDiffMethod1() {
		test1.add(5);
		test1.add(12);
		test1.add(300);
		
		
		test2.add(50);
		test2.add(5);
		test2.add(12);
		test1.diff(test2);
		
		test3.add(300);
		test3.add(50);
		
		assertFalse(test1.equals(test3));
	};
	
	@Test
	@DisplayName("Testing Diff method with set that has no diff")
	public void testDiffMethod2() {
		test1.add(5);
		test1.add(12);
		test1.add(300);
		
		
		test2.add(5);
		test2.add(12);
		test2.add(300);
		
		test1.diff(test2);
		
		
		assertTrue(test1.equals(test3));
	};
	
	@Test
	@DisplayName("Testing toString Method with one element in set")
	public void testStringMethod1() {
		test1.add(5);
		
		String str1 = test1.toString();
		String str2 = "[5]";
		
		assertTrue(str1.equals(str2));
	};
	
	@Test
	@DisplayName("Testing toString Method with empty set")
	public void testStringMethod2() {
		
		String str1 = test1.toString();
		String str2 = "[]";
		
		assertTrue(str1.equals(str2));
	};
};