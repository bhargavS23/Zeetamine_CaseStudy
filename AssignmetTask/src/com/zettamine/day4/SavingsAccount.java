package com.zettamine.day4;

public class SavingsAccount extends Account {

	private double minimumBalance;
	
	public SavingsAccount(int accNumber, Customer customer, double balance, double minimumBalance) {
		super(accNumber, customer, balance);
		this.minimumBalance = minimumBalance;
	}

	public double getMinimumBalance() {
		return minimumBalance;
	}

	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}

	@Override
	public boolean withdraw(double amt) {
		if(this.balance > this.minimumBalance && this.balance > amt) {
			this.balance -= amt;
			return true;
		}
		return false;
	}
}
