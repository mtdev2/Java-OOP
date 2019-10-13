package com.akshay_java.phone;

public class PhoneTester {
	
	public static void main(String [] args) {
		Galaxy s9 = new Galaxy("S9", 99, "Verizon", "Ring Ring Ring!");
		Iphone iPhoneXR = new Iphone("XR", 100, "Sprint", "Zing!");
		
		s9.displayInfo();
		System.out.println(s9.ring());
		System.out.println(s9.unlock());
		
		iPhoneXR.displayInfo();
		System.out.println(iPhoneXR.ring());
		System.out.println(iPhoneXR.unlock());
	}
}
