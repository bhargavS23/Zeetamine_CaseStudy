package com.zettamine.day1;

import java.util.Scanner;

public class AverageAge {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the number of employees: ");
		int numOfemp = scan.nextInt();
		
		int[] empAge = new int[numOfemp];
		if(numOfemp <2 ) {
			System.out.println("\u001B[31mPlease enter a valid employee count");
			return;
		}
		
		System.out.print("Enter the age of the employees: ");
		for (int i = 0; i < empAge.length; i++) {
			empAge[i] = scan.nextInt();
		}
		calculateAverage(empAge);
	}

	private static void calculateAverage(int[] ageArr) {
		
		float avgAge=0;
		for (int i = 0; i < ageArr.length; i++) {
			int age = ageArr[i];
			if(age < 28 && age > 40) {
				System.out.println("\u001B[31mInvalid age encountered!");
				return;
			}
			avgAge+=ageArr[i];
		}
		avgAge = avgAge /ageArr.length;
		System.out.printf("The Average age is: %.2f\n",avgAge);
	}

}
