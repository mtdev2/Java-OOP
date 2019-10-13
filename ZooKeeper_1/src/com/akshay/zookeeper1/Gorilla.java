package com.akshay.zookeeper1;

public class Gorilla extends Mammal {
	
	public void throwSomething() {
		System.out.print("\nGorilla has thrown something!\n");
		this.energyLevel -= 5;
		System.out.printf("\nEnergy decreased by 5 and the current Energy Level is: %d", this.energyLevel);
	}
	
	public void eatBananas() {
		System.out.print("\nGorilla khushhh hua!!!\nJust had a fiest!");
		this.energyLevel +=10;
		System.out.printf("\nEnergy increased by 10 and the current Energy Level is: %d", this.energyLevel);
	}
	
	public void climb() {
		System.out.print("\nGorilla has climbed a tree!\n");
		this.energyLevel -= 5;
		System.out.printf("\nEnergy decreased by 5 and the current Energy Level is: %d", this.energyLevel);
	}
}
