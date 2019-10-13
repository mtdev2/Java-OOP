package com.akshay_java.phone;

public class Iphone extends PhoneClass implements Ringable {
	public Iphone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
	
    @Override
    public String ring() {
    	return "Iphone Jingle";
    }
    
    @Override
    public String unlock() {
    	return "Face ID";
    }
    
    @Override
    public void displayInfo() {
    	System.out.println("This is iPhone XR that we created successfully!");
    }
}
