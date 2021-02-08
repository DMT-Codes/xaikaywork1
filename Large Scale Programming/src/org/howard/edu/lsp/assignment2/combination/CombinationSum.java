package org.howard.edu.lsp.assignment2.combination;

import java.util.Arrays;
import java.util.HashMap;
import java.util.ArrayList;


/**
 * Computes combinations that sum to a particular target
 * @author Deante
 *
 */
public class CombinationSum {
	
	

	
	
	/**
	 * This method is the main method that calls all the other functions and then returns the solution.
	 * 
	 * 
	 * @param input - An array of integers
	 * @param target- The target value we are looking to sum to
	 * @return - A 2D array containing the solutions that sum to the target
	 */
	public ArrayList<ArrayList<Integer>> totalCombinations(int[] input, int target) {

		ArrayList<ArrayList<Integer>> output = new ArrayList<ArrayList<Integer>>();
		HashMap<Integer, ArrayList<Integer>> index = findIndex(input);
		Arrays.sort(input);
		output = findCombinations(input, target, 0, new ArrayList<Integer>(),output);
		output=findResult(index,output);
		return output;
	}
	
	
	
	/**
	 * This findIndexes method is used to create a HashMap 
	 * where the keys are the integers in the input array and
	 * the values are arrays of the indexes at which every occurrence 
	 * of the integer is in the original input array.
	 * 
	 * @param input - Array of values
	 * @return - Hashmap of values 
	 */
	public HashMap<Integer, ArrayList<Integer>> findIndex(int[] input){
		HashMap<Integer, ArrayList<Integer>> indexes = new HashMap<>();
		
		for(int i = 0; i < input.length; i++) {
			if (indexes.get(input[i]) == null) {
				ArrayList<Integer> arr  = new ArrayList<>();
				arr.add(i);
				indexes.put(input[i], arr);
				
				
			} else {
				ArrayList<Integer> new_array  = indexes.get(input[i]);
				new_array.add(i);
				indexes.put(input[i], new_array);
			}
		}
		return indexes;
	}
	
	
	/**
	 * This method computes all the combinations that sum to a given target
	 * 
	 * @param input - Integer Array 
	 * @param target - Target Value
	 * @param index - Index in the Array
	 * @param current_combination - Stores the combinations that sum to target
	 */
	public ArrayList<ArrayList<Integer>> findCombinations(int[] input, int target, int index, ArrayList<Integer> current_combination,ArrayList<ArrayList<Integer>> result) {
		if (target == 0) {
			result.add(new ArrayList<Integer>(current_combination));
			return result;
		}
		
	    for(int i = index; i < input.length; i++){
	        if(target > 0){
	        	current_combination.add(input[i]);
	            findCombinations(input, target - input[i],i+1,current_combination,result);
	            current_combination.remove(current_combination.size()-1);
		    }
		}
	    return result;
	}
	
	/**
	 * This method is used to find the index of the combinations previously found
	 * 
	 * @param indexes - Hashmap containing the integers and their corresponding indexs
	 */
	public ArrayList<ArrayList<Integer>> findResult(HashMap<Integer, ArrayList<Integer>> indexes,ArrayList<ArrayList<Integer>> result) {
		for (int i = 0; i < result.size(); i++){
			for (int j = 0; j < result.get(i).size(); j++) {
				int num = result.get(i).get(j);
				result.get(i).set(j, indexes.get(num).get(0));
				if (indexes.get(num).size() != 1) {
					indexes.get(num).remove(0);
				}
			}
		}
		return result;
	}
}