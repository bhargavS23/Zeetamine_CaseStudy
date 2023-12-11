package com.zettamine.day2;

public class Loan {
	
	public double calculateLoanAmount(Employee emp) {
		
		double loanAmount = 0.0;
		if(emp instanceof PermanentEmployee) {
			return emp.salary * 0.15;
		}
		else {
			return emp.salary * 0.10;
		}
		
	}

}
