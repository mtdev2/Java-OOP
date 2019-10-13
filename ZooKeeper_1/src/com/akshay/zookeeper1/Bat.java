package com.akshay.zookeeper1;

public class Bat extends Mammal{

//	int energyLevel = 300;
	
	public Bat() {
		this.energyLevel = 300;
	}
	
	public void fly() {
		System.out.print("\nBat just took off for flying!");
		this.energyLevel -= 50;
		System.out.printf("\nEnergy decreased by 50 and the current Energy Level is: %d", this.energyLevel);
	}
	
	
	public void eatHuman() {
		System.out.print("\nBat khushhh hua!!! \nJust eat a human...");
		this.energyLevel +=25;
		System.out.printf("\nEnergy increased by 25 and the current Energy Level is: %d", this.energyLevel);
	}
	
	public void attackTown() {
		System.out.print("\nBat attacked the town!!! Bhangooooo.....");
		this.energyLevel -=100;
		System.out.printf("\nEnergy decreased by 100 and the current Energy Level is: %d", this.energyLevel);
	}
}
