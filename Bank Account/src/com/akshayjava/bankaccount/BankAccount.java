package com.akshayjava.bankaccount;
import java.util.Random;


public class BankAccount {
	
	private String accountNumner;
	private double checkingBalance;
	private double savingsBalance;
	
	private static int totalNumberOfAccounts = 0;
	private static double totalAccountBalance = 0;
	
	public BankAccount () {
		this.totalNumberOfAccounts++;
		this.accountNumner = Integer.toString(this.randomNumberGenerator());
	}
	
	private int randomNumberGenerator () {
		Random randomNumber = new Random();
		int accountNumber = randomNumber.nextInt(9000000) + 1000000; 
		return accountNumber;
	}
	
	public double getCheckingBalance () {
		return this.checkingBalance;
	}
	
	public void setCheckingBalance (double amount) {
		this.checkingBalance = amount;
	}
	
	public double getSavingsBalance () {
		return this.savingsBalance;
	}
	
	public void setSavingsBalance (double amount) {
		this.savingsBalance = amount;
	}
	
	public void depositChecking (double amount) {
		this.checkingBalance += amount;
		this.totalAccountBalance += this.checkingBalance;
		
		System.out.printf("\nDeposited $"+ amount +" in your Checking Account.");
		System.out.printf("\nChecking Account Balance: " + this.checkingBalance);
		System.out.printf("\nTotal Account Balance: " + this.totalAccountBalance);
	}
	
	public void depositSavings (double amount) {
		this.savingsBalance += amount;
		this.totalAccountBalance += this.savingsBalance;
		
		System.out.printf("\nDeposited $"+ amount +" in your Savings Account.");
		System.out.printf("\nSavings Account Balance: " + this.savingsBalance);
		System.out.printf("\nTotal Account Balance: " + this.totalAccountBalance);
	}
	
	public void withdrawChecking (double amount) {
		if(this.checkingBalance <= amount) {
			System.out.printf("Insufficient Balance in your Checking Account");
		}
		
		else {
			this.checkingBalance -= amount;
			this.totalAccountBalance -= amount;
		
			System.out.printf("\nWithdrawn $"+ amount +" from your Checking Account.");
			System.out.printf("\nChecking Account Balance: " + this.checkingBalance);
			System.out.printf("\nTotal Account Balance: " + this.totalAccountBalance);
		}
	}
	
	public double displayTotalBalance() {
		this.totalAccountBalance = this.checkingBalance + this.savingsBalance;
		return this.totalAccountBalance;
	}
	
//	public String getAccountNumner() {
//		return accountNumner;
//	}
//
//	public void setAccountNumner(String accountNumner) {
//		this.accountNumner = accountNumner;
//	}
//
	public static int getTotalNumberOfAccounts() {
		return totalNumberOfAccounts;
	}
//
//	public static void setTotalNumberOfAccounts(int totalNumberOfAccounts) {
//		BankAccount.totalNumberOfAccounts = totalNumberOfAccounts;
//	}
//
//	public static double getTotalAccountBalance() {
//		return totalAccountBalance;
//	}
//
//	public static void setTotalAccountBalance(double totalAccountBalance) {
//		BankAccount.totalAccountBalance = totalAccountBalance;
//	}
//
//	public int totalNumberOfAccounts() {
//		return this.totalNumberOfAccounts;
//	}
}
