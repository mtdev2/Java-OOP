package com.akshay_java.phone;

public class Galaxy extends PhoneClass implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    
    @Override
    public String ring() {
        return "Galaxy Jingle";
    }
    
    @Override
    public String unlock() {
        return "Touch ID.";
    }
    
    @Override
    public void displayInfo() {
        System.out.println("This is Samsung Galaxy that we created!");
    }
}