package com.strategy;

public class Car {
	
	private Engine engine;
	
	public Car(Engine engine) {
		this.engine = engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public void start() {
		this.engine.startEngine();
	}

}
