package org.howard.edu.lsp.assignment2.test;
import java.util.Arrays;

import org.howard.edu.lsp.assignment2.combination.CombinationSum;

/**
 * This class is used to test the CombinationSum file.
 * 
 * @author Deante
 *
 */

public class TestAssignment2 {
	
	
	/**
	 * This method is used to debug and test the CombinationSum java file for different inputs
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		/**
		 * Test Case 1
		 * Base Test Case 
		 */
		CombinationSum test = new CombinationSum();
		int[] input1 = {5, 5, 15, 10};
		int target1 = 15;
		System.out.println("TEST CASE 1");
		System.out.println("Input: " +  Arrays.toString(input1));
		System.out.println("Target: " +  target1);
		System.out.println("Output: " + test.totalCombinations(input1, target1).toString() + "\n");
		
		
		/**
		 * Test Case 2
		 * Base Test Case
		 */
		int[] input2 = {1, 2, 3, 4, 5, 6};
		int target2 = 6;
		System.out.println("TEST CASE 2");
		System.out.println("Input: " +  Arrays.toString(input2));
		System.out.println("Target: " +  target2);
		System.out.println("Output: " + test.totalCombinations(input2, target2).toString() + "\n");
		
		
		
		
		
		/**
		 * Test Case 3
		 * Testing when there is no valid combination
		 */
		int[] input3 = {5, 5, 10};
		int target3 = 30;
		System.out.println("TEST CASE 3");
		System.out.println("Input: " +  Arrays.toString(input3));
		System.out.println("Target: " +  target3);
		System.out.println("Output: " + test.totalCombinations(input3, target3).toString() + "\n");
		
		
		
		/**
		 * Test Case 4
		 * Testing when there is a negative input in the array
		 */
		int[] input4 = {-2,-3,10,15,20};
		int target4= 12;
		System.out.println("TEST CASE 4");
		System.out.println("Input: " +  Arrays.toString(input4));
		System.out.println("Target: " +  target4);
		System.out.println("Output: " + test.totalCombinations(input4, target4).toString() + "\n");
		
		/**
		 * Test Case 5
		 * Testing when there is a negative target value
		 */
		int[] input5 = {-4,-15,10,6,12};
		int target5 = -3;
		System.out.println("TEST CASE 5");
		System.out.println("Input: " +  Arrays.toString(input5));
		System.out.println("Target: " +  target5);
		System.out.println("Output: " + test.totalCombinations(input5, target5).toString() + "\n");
		
		/**
		 * Test Case 6
		 * Testing when there is an empty array as input
		 */
		int[]  input6= {};
		int target6 = 10;
		System.out.println("TEST CASE 6");
		System.out.println("Input: " +  Arrays.toString(input6));
		System.out.println("Target: " +  target6);
		System.out.println("Output: " + test.totalCombinations(input6, target6).toString() + "\n");
	}

}