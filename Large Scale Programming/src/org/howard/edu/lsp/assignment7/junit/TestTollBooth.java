package org.howard.edu.lsp.assignment7.junit;
import static org.junit.jupiter.api.Assertions.*;
import org.howard.edu.lsp.assignment7.tollbooth.FordTruck;
import org.howard.edu.lsp.assignment7.tollbooth.ChevroletTruck;
import org.howard.edu.lsp.assignment7.tollbooth.TollBooth;
import org.howard.edu.lsp.assignment7.tollbooth.CityTollBooth;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class TestTollBooth {
	
	@Test
	@DisplayName("Test Case 1: Toll with No Trucks")
	public void testToll1() {
		TollBooth toll1 = new CityTollBooth();
		int receipts = toll1.getReceiptsTotal();
		int trucks = toll1.getTrucksTotal();
			 
		assertTrue(receipts == 0 && trucks == 0);
	};
	
	@Test
	@DisplayName("Test Case 2: Toll with One Truck")
	public void testToll2() {
		
		TollBooth toll1 = new CityTollBooth();
		FordTruck ford1 = new FordTruck(5, 12500);
		
		toll1.calculateToll(ford1.getAxels(),ford1.getTotalWeight());
		
		int receipts = toll1.getReceiptsTotal();
		int trucks = toll1.getTrucksTotal();
	 
		assertTrue(receipts == 145 && trucks == 1);
	};
	
	
	@Test
	@DisplayName("Test Case 3: Toll with Two Trucks")
	public void testToll3() {
		
		TollBooth toll1 = new CityTollBooth();
		FordTruck ford1 = new FordTruck(5, 12500);
		ChevroletTruck chev1 = new ChevroletTruck(2, 5000);
		
		toll1.calculateToll(ford1.getAxels(),ford1.getTotalWeight());
		toll1.calculateToll(chev1.getAxels(),chev1.getTotalWeight());
		
		int receipts = toll1.getReceiptsTotal();
		int trucks = toll1.getTrucksTotal();
		 
		assertTrue(receipts == 205 && trucks == 2);
	};
	
	
	@Test
	@DisplayName("Test Case 4: Reset with no trucks")
	public void testReset1() {
		TollBooth toll1 = new CityTollBooth();
		toll1.reset();
		 
		int receipts = toll1.getReceiptsTotal();
		int trucks = toll1.getTrucksTotal();
		 
		assertTrue(receipts == 0 && trucks == 0);
	};
	
	@Test
	@DisplayName("Test Case 5: Reset with one truck")
	public void testReset2() {
		TollBooth toll1 = new CityTollBooth();
		FordTruck ford1 = new FordTruck(5, 12500);
		
		toll1.calculateToll(ford1.getAxels(),ford1.getTotalWeight());
		toll1.reset();
		
		int receipts = toll1.getReceiptsTotal();
		int trucks = toll1.getTrucksTotal();
		
		assertTrue(receipts == 0 && trucks == 0);
	};
	
	@Test
	@DisplayName("Test Case 6: Reset with two trucks")
	public void testReset3() {
		TollBooth toll1 = new CityTollBooth();
		FordTruck ford1 = new FordTruck(5, 12500);
		ChevroletTruck chev1 = new ChevroletTruck(2, 5000);
		
		toll1.calculateToll(ford1.getAxels(),ford1.getTotalWeight());
		toll1.calculateToll(chev1.getAxels(),chev1.getTotalWeight());
		toll1.reset();
		 
		int receipts = toll1.getReceiptsTotal();
		int trucks = toll1.getTrucksTotal();
		
		assertTrue(receipts == 0 && trucks == 0);
	};
	
};