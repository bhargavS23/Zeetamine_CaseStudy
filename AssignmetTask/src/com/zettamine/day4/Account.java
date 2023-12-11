package com.zettamine.day4;

public abstract class Account {

	protected int accNumber;
	protected Customer customer;
	protected double balance;
	public Account(int accNumber, Customer customer, double balance) {
		super();
		this.accNumber = accNumber;
		this.customer = customer;
		this.balance = balance;
	}
	public int getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public abstract boolean withdraw(double amt);
}
