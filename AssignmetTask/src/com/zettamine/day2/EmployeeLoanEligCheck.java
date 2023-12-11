package com.zettamine.day2;

import java.util.Scanner;

public class EmployeeLoanEligCheck {

	public static void main(String[] args) {
		Employee emp = null;
		Scanner scn = new Scanner(System.in);
		System.out.print("Select employee type [1.Permanent 2.Temporary Employee] : ");
		int empType = scn.nextInt();

		System.out.print("Enter emloyee id: ");
		int empId = scn.nextInt();
		scn.nextLine();
		System.out.print("Enter employee name: ");
		String empName = scn.next();
		System.out.print("Enter employee salary: ");
		double empSalary = scn.nextDouble();

		switch (empType) {

		case 1:
			emp = new PermanentEmployee(13442, "Bhargav", 50000);
			break;

		case 2:
			System.out.println("Enter employee hours worked");
			int hours = scn.nextInt();
			System.out.println("Enter hourly pay");
			int pay = scn.nextInt();
			emp = new TemporaryEmployee(empId, empName, hours, pay);
			break;

		default:
			System.out.println("Enter valid employement type");
			break;
		}
		emp.calculateSalary();
		System.out.println("Eployee ID : " + emp.empId);
		System.out.println("Eployee Name : " + emp.empName);
		System.out.println("Eployee ID : " + emp.salary);
		Loan loan = new Loan();
		System.out.println("Loan Amount Eligible: " + loan.calculateLoanAmount(emp));
	}
}
