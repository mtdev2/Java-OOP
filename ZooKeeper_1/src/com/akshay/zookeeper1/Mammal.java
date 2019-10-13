package com.akshay.zookeeper1;

public class Mammal {
	public int energyLevel;
	
	public Mammal() {
		this.energyLevel = 100;
	}
	
	public int displayEnergy() {
		return this.energyLevel;
	}
}
