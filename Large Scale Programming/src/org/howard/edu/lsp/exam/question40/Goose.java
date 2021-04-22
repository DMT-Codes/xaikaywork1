package org.howard.edu.lsp.exam.question40;
/**
 * 
 * @author Deante
 *
 */
public class Goose extends Animal implements Flying {
	
	public void speak() {
		System.out.println("This Goose speaks");
	}
	
	public void move() {
		System.out.println("This Goose moves forward");
	}
	
	public void fly() {
		System.out.println("This Goose flies");
	}
};