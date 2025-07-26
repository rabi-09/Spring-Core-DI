package org.example;

public class PetrolEngine implements IEngine{
	PetrolEngine(){
		System.out.println("Petrol Engine Constructor");
	}
	
	@Override
	public int start() {
		System.out.println("Petrol Engine Car Started");
		return 1;
	}
}
