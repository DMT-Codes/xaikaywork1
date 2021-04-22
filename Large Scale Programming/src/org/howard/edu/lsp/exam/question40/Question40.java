package org.howard.edu.lsp.exam.question40;
/**
 * 
 * @author Deante
 *
 */
public class Question40 {
	
	public static void main(String[] args) {
		Animal tiger = new Tiger();
		Animal goose = new Goose();
		Flying srirachaGoose = new Goose();
		Flying caribbeanAirlines = new Airplane();
		tiger.speak();
		tiger.move();
		goose.speak();
		goose.move();	
		srirachaGoose.fly();
		caribbeanAirlines.fly();
	};
};