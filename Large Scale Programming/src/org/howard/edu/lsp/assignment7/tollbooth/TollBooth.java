package org.howard.edu.lsp.assignment7.tollbooth;
/**
 * 
 * Interface for TollBooth and it's behaviours
 * 
 * @author Deante Taylor
 *
 */
public interface TollBooth {
	public void calculateToll(int axels, int weight);
	public void displayData();
	public void reset();
	public int getReceiptsTotal();
	public int getTrucksTotal();
};