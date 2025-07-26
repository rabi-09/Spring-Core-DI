package org.example;

public class Car {
	IEngine engine;
	public void setEngine(IEngine engine) {
		this.engine = engine;
	}
	Car(){
		System.out.println("Car Constructor");
	}
	Car(IEngine engine){
		this.engine = engine;
	}
	void drive(){
		if(engine.start()==1){
			System.out.println("Car Drove");
		}
		else{
			System.out.println("Car not Drove");
		}
	}
}
