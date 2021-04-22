package org.howard.edu.lsp.exam.question41;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RemoveZeroesTest {
	
	@Test
	@DisplayName("Test Case 1: Given by instructor")
	public void testRemoveZeroes1() {
		ArrayList<Integer> intArr = new ArrayList<Integer>();
		intArr.add(0);
		intArr.add(7);
		intArr.add(2);
		intArr.add(0);
		intArr.add(0);
		intArr.add(4);
		intArr.add(0);
		
		intArr = RemoveZeroesImplementation.removeZeroes(intArr);
		System.out.println(intArr.toString());
		assertTrue(!intArr.contains(0));
	};
	
	@Test
	@DisplayName("Test Case 2: No zeroes in arraylist")
	public void testRemoveZeroes2() {
		ArrayList<Integer> intArr = new ArrayList<Integer>();
		intArr.add(1);
		intArr.add(9);
		intArr.add(9);
		intArr.add(9);
	
		intArr = RemoveZeroesImplementation.removeZeroes(intArr);
		System.out.println(intArr.toString());
		
		assertTrue(!intArr.contains(0));
	};
}