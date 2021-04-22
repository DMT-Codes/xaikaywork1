package org.howard.edu.lsp.assignment7.tollbooth;
/**
 * 
 * This class implements the TollBooth interface
 * and the methods specified by the interface
 * @author Deante Taylor
 */
public class CityTollBooth implements TollBooth{
	/**
	 * Tracks the total number of trucks and receipts
	 */
	int trucksTotal = 0;
	int receiptsTotal = 0;
	/**
	 * Calculates the receipt for a truck and the current total number of trucks 
	 */
	public void calculateToll(int axels, int weight) {
		receiptsTotal += ((axels*5) + ((weight/1000) * 10));
		trucksTotal += 1;
	};
	
	/**
	 * 
	 * Displays the total number of receipts and trucks 
	 */
	public void displayData() {
		System.out.println("Totals So far");
		System.out.println("Receipt Total: $" + receiptsTotal );
		System.out.println("Truck Total: " + trucksTotal);
	};

	public void reset() {
		this.displayData();
		trucksTotal = 0;
		receiptsTotal = 0;
	};
	

	public int getReceiptsTotal() {
		return receiptsTotal;
	};
	

	public int getTrucksTotal() {
		return trucksTotal;
	};
};