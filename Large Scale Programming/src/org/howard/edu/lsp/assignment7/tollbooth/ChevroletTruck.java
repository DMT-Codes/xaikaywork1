package org.howard.edu.lsp.assignment7.tollbooth;

/**
 * This class contains the interface for trucks and their behaviours
 * @author Deante Taylor
 */
public class ChevroletTruck extends Truck{
	
	/**
	 * Axels- Number of Axels on Truck
	 * TotalWeight- Total weight of Truck
	 */
	public final int axels;
	public final int totalWeight;
	
	/**
	 * Constructor method to store truck data
	 * @param axels
	 * @param totalWeight
	 */
	public ChevroletTruck(int axels, int totalWeight) {
		this.axels = axels;
		this.totalWeight = totalWeight;
	}
	
	public int getAxels() {
		return this.axels;
	};
	
	public int getTotalWeight() {
		return this.totalWeight;
	};
};