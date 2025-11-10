package com.strategy;

public class Main {

	public static void main(String args[]) {
		Car c = new Car(new PetrolEngine());
		c.start();
		
		c.setEngine(new DieselEngine());
		c.start();
		
		c.setEngine(new ElectricEngine());
		c.start();
	}
}
