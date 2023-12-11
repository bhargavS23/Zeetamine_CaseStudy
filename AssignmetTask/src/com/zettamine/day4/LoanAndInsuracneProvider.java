package com.zettamine.day4;

import java.util.Scanner;

public class LoanAndInsuracneProvider {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the Vehicle Deatils");
		
		System.out.print("Enter vehicle number: ");
		String vechileNum = scn.nextLine();
		System.out.print("Enter Model Name: ");
		String modelName = scn.nextLine();
		System.out.print("Enter vehicle type [4 wheeler, 3 wheeler, 2 wheeler]: ");
		String vehicleType = scn.nextLine();
		System.out.print("Enter vehicle price: ");
		double price = scn.nextDouble();
		
		Vehicle vehicle = new Vehicle(vechileNum, modelName, vehicleType, price);
		
		
		System.out.printf("Vechile Number    	: %s \n",vehicle.getVehicleNumber());
		System.out.printf("Vechile model name	: %s \n",vehicle.getModelName());
		System.out.printf("Vechile type 	 	: %s \n",vehicle.getVehicleType());
		System.out.printf("Vechile price 	    : %.2f \n",vehicle.getPrice());
		System.out.printf("Eligible loan amount : %.2f \n",vehicle.issueLoan());
		System.out.printf("Insurance amount     : %.2f \n",vehicle.takeInsurance());

	}

}
