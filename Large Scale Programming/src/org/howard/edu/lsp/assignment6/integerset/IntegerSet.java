package org.howard.edu.lsp.assignment6.integerset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.howard.edu.lsp.assignment4.implementation.EmptySetException;
/**
 * 
 * Classes implemented to make IntegerSet
 * 
 * @author Deante Taylor
 *
 */
public class IntegerSet {
	
	/**
	 *Variable made to create the Set
	 */
	private List<Integer> set = new ArrayList<Integer>();
	
	/**
	 * This clear method removes all values from the set
	 */
	public void clear() {
		set= new ArrayList<Integer>();

	};
	
	/**
	 * This method returns the length of the set
	 * 
	 * @return - An integer value that represents the length of the set
	 */
	public int length() {
		int set_len = set.size();
		return  set_len;
	};
	
	/**
	 * This equals method determines if two sets are equal to each other 
	 * 
	 * @param b - IntegerSet to be compared
	 * @return - boolean which indicates whether two sets are equal or not
	 */
	public boolean equals(IntegerSet b) {
		if (this.length() == b.length()) {
			for (int i = 0; i < set.size(); i++) {
				if (!b.contains(set.get(i))) {
					return false;
				}
			}
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * This contains method checks whether a set contains a value
	 * 
	 * @param value - Value to search for in set
	 * @return - Boolean representing whether the set contains the value
	 */
	public boolean contains(int value) {
		for (int i = 0; i < set.size(); i++) {
			if (set.get(i) == value) {
				return true;
			}
		}
		return false;
	};
	
	/**
	 * Returns the largest item in the set; Throws a EmptySetException if the set is empty 
	 * 
	 * @return - integer value representing the largest value in the set.
	 * @throws EmptySetException
	 */
	public int largest() throws EmptySetException {
		if(set.size() == 0){
			throw new EmptySetException("IntegerSet is empty!");
		}
		
		int max_val = 0;
		for (int i = 0; i < set.size(); i++) {
			if (set.get(i) >= max_val) {
				max_val = set.get(i);
			}
		}
		return max_val;
	};
	
	
	/**
	 *Returns the smallest item in the set; Throws a IntegerSetException if the set is empty
	 * 
	 * @return - integer value representing the smallest value in the set.
	 * @throws EmptySetException
	 */
	public int smallest() throws EmptySetException{
		if(set.size() == 0){
			throw new EmptySetException("IntegerSet is empty!");
		}
		
		int min_val = set.get(0);
		for (int i = 1; i < set.size(); i++) {
			if (set.get(i) <= min_val) {
				min_val = set.get(i);
			}
		}
		return min_val;
	};
	
	
	/**
	 * This add method adds integer values to set if they are not already in it
	 * 
	 * @param item - integer value to add to the set
	 */
	public void add(int item) {
		if (!this.contains(item)) {
			set.add(item);
		}
	};
	
	
	/**
	 * This remove method removes an item from the set or does nothing if not there
	 * 
	 * @param item - integer value to be removed
	 */
	public void remove(int item) {
		if (this.contains(item)) {
			set.removeAll(Arrays.asList(item));
		}
	};
	
	
	/**
	 * This union method finds the union of two sets.
	 * 
	 * @param intSetb - IntegerSet to union with.
	 */
	public void union(IntegerSet intSetb) {
		List<Integer> set_b = intSetb.getAllElements();
		
		
		for (int i = 0; i < set_b.size(); i++) {
			if (!this.contains(set_b.get(i))) {
				this.add(set_b.get(i));
			}
		}
		
	};
	
	
	/**
	 * This intersect method finds the intersection of two sets.
	 * 
	 * @param intSetb - IntegerSet to intersect with.
	 */
	public void intersect(IntegerSet intSetb) {
		List<Integer> set_b = intSetb.getAllElements();
		List<Integer> new_set = new ArrayList<Integer>();
		for (int i = 0; i < set_b.size(); i++) {
			if (this.contains(set_b.get(i))) {
				new_set.add(set_b.get(i));
			}
		}
		set = new_set;
	};
	
	
	/**
	 * This diff method finds the difference of two sets.
	 * 
	 * @param intSetb - IntegerSet to find difference of
	 */
	public void diff(IntegerSet intSetb) {
		List<Integer> set_b = intSetb.getAllElements();
		set.removeAll(set_b);
	};
	
	
	/**
	 * This isEmpty method checks whether the set is empty or not
	 * 
	 * @return - boolean value representing whether the set is empty or not
	 */
	public boolean isEmpty() {
		if (this.length() == 0) {
			return true;
		}
		return false;
	};
	
	
	/**
	 * This toString method converts the set to a String value
	 * 
	 * @return - String representing the set
	 */
	public String toString() {
		String stringList = set.toString();
		return stringList;
	};
	
	/**
	 * This getAllElements method returns the all the values of the set
	 * 
	 * @return - List representing the IntegerSet
	 */
	public List<Integer> getAllElements(){
		return set;
	};

}