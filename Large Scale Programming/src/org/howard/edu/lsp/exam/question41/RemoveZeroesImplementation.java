  
package org.howard.edu.lsp.exam.question41;

import java.util.ArrayList;

public class RemoveZeroesImplementation {
	/**
	 * 
	 * @param intArr integer array containing numbers to be examined
	 * @return
	 */
	public static ArrayList<Integer> removeZeroes(ArrayList<Integer> intArr){
		for (int i = 0 ; i < intArr.size(); i++) {
			if(intArr.get(i) == 0)
			{
				intArr.remove(i);
				i--;
			}
		}
		return intArr;
	}
};