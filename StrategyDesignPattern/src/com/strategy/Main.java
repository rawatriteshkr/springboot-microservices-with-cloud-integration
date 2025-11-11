package com.strategy;

// Tester class.
public class Main {

	public static void main(String args[]) {
		Car c = new Car(new PetrolEngine());
		c.start();
		
//		Car c = new Car(new DieselEngine());
//		c.start();
//		
//		Car c = new Car(new ElectricEngine());
//		c.start();
	}
}
