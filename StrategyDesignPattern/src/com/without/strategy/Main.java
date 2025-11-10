package com.without.strategy;

public class Main {

	public static void main(String[] args) {
		
//		Petrol Engine
		Car petrolCar = new Car(new PetrolEngine());
		petrolCar.start();
		
//		Diesel Engine
//		Car dieselCar = new Car(new DieselEngine());
//		dieselCar.start();
		
//		Electric Engine
//		Car electricCar = new Car(new ElectricEngine());
//		electricCar.start();

	}

}
