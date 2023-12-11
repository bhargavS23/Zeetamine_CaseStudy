package com.zettamine.day2;

import java.util.Scanner;

public class BankApp {

	static Account acc = null;
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		while (true) {
			System.out.println("1.Create Account");
			System.out.println("2.Deposit");
			System.out.println("3.Withdraw");
			System.out.println("4.Details");
			System.out.println("5.Exit");
			System.out.println();
			System.out.print("Select an Option: ");
			int option = scn.nextInt();
			switch (option) {

			case 1:
				createAccount();
				break;

			case 2: {
				if (acc != null) {
					System.out.print("Enter amount to deposit: ");
					double amt = scn.nextDouble();
					if(acc.deposit(amt) != -1) {
						System.out.println("Rs." + amt + " Credited | Balance: " + acc.balance);
					}else System.err.println("Negative amount is not accepted");
						
				} else
					System.out.println("please open a a/c with us...");
				break;
			}

			case 3: {

				if (acc != null) {
					System.out.print("Enter amount to withdraw: ");
					double amt = scn.nextDouble();
					if(acc.debitAmount(amt) != -1) {
					
						System.out.println("Rs." + amt + " debited | Balance: " + acc.balance);
					}else System.err.println("Negative amount is not accepted");
				} else System.out.println("please open a a/c with us...");
				break;
			}

			case 4: {
				if (acc != null) {
					System.out.println(acc.getDetails());
				} else
					System.out.println("please open a a/c with us...");
				break;
			}

			case 5:
				System.out.println("Thanku for banking with us");
				System.exit(0);
			}
		}

	}

	public static void createAccount() {
		System.out.print("Enter a/c number: ");
		long accNo = scn.nextLong();
		scn.nextLine();
		System.out.print("Enter name: ");
		String name = scn.nextLine();
		System.out.print("Enter initial deposit: ");
		double inidepo = scn.nextDouble();

		System.out.println("Please select the account type:\n" + "1.Savings Account\n" + "2.Current Account");
		int acctype = scn.nextInt();
		if (acctype == 1) {
			acc = new SavingAccount(accNo, name, inidepo);
			System.out.println("Account Opened");
		} else if (acctype == 2) {
			acc = new CurrentAccount(accNo, name, inidepo);
		} else {
			System.err.println("Please give valid input");
			createAccount();
		}
	}
}
