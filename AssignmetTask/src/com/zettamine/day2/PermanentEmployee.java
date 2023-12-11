package com.zettamine.day2;

public class PermanentEmployee  extends Employee{

	private double basicPay;
	private double pfAmt;
	
	public PermanentEmployee(int empId, String empName, double basicPay) {
		super(empId, empName);
		this.basicPay = basicPay;
	}
	
	private void calculatePf(double amt) {
		 this.pfAmt = this.basicPay * 0.12;
	} 
	@Override
	public void calculateSalary() {
		calculatePf(this.basicPay);
		 this.salary = this.basicPay - pfAmt; 
	}
}
