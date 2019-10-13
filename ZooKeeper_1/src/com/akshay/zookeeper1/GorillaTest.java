package com.akshay.zookeeper1;

public class GorillaTest {
	public static void main(String [] args) {
		Gorilla gorilla = new Gorilla();
		
		gorilla.throwSomething();
		gorilla.throwSomething();
		gorilla.throwSomething();
		
		gorilla.eatBananas();
		gorilla.eatBananas();
		
		gorilla.climb();
		
		int energyLevel = gorilla.displayEnergy();
		System.out.printf("\n\nFinal Energy Level at this point: " + energyLevel);
	}
}	
