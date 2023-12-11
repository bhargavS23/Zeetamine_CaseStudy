package com.zettamine.day4;

import java.util.Scanner;

public class BankApp {
	
	static SavingsAccount savingsAccount;
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.print("Enter A/C Number: ");
		int accNo = scn.nextInt();
		System.out.print("Enter customer id: ");
		int custId = scn.nextInt();
		scn.nextLine();
		System.out.print("Enter customer name: ");
		String name = scn.nextLine();
		System.out.print("Enter customer email: ");
		String email = scn.nextLine();
		System.out.print("Enter balance:");
		int balance = scn.nextInt();
		System.out.print("Enter minimum balance:");
		int minBalance = scn.nextInt();
		
		Customer customer = new Customer(custId, name, email);
		savingsAccount = new SavingsAccount(accNo, customer, balance, minBalance);
		
		System.out.print("Enter Amount to withdraw: ");
		int withdrawAmt = scn.nextInt();
		
		if(savingsAccount.withdraw(withdrawAmt)) {
			System.out.println("Rs."+withdrawAmt + " debited " + "| Balance: " + savingsAccount.getBalance());
		}
		else System.out.println("Insufficient Balance");

	}
}
