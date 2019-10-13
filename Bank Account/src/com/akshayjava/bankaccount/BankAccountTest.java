package com.akshayjava.bankaccount;

public class BankAccountTest {
	public static void main(String [] args) {
		BankAccount account1 = new BankAccount();
		BankAccount account2 = new BankAccount();
		account1.setCheckingBalance(5000);
		
		System.out.println(BankAccount.getTotalNumberOfAccounts());
		
		account1.depositChecking(1000);
		account1.depositSavings(1100);
		account1.withdrawChecking(300);
	 	

		double cb = account1.getCheckingBalance();
		System.out.printf("\n" + cb);
		
		
	}
}
