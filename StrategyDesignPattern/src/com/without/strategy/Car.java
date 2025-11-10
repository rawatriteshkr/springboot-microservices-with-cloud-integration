package com.without.strategy;

public class Car {
	
	private PetrolEngine petrolEngine;
//	private DieselEngine dieselEngine;
//	private ElectricEngine electricEngine;
	
	public Car(PetrolEngine petrolEngine) { // DieselEngine dieselEngine, ElectricEngine electricEngine
		this.petrolEngine = petrolEngine;
//		this.dieselEngine = dieselEngine;
//		this.electricEngine = electricEngine;
	}

	public void start() {
		this.petrolEngine.startEngine();
//		this.dieselEngine.startEngine();
//		this.electricEngine.startEngine();
	}

}
