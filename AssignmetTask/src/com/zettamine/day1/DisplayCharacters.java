package com.zettamine.day1;

import java.util.Scanner;

public class DisplayCharacters {

	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		
		displayCharacters();
	}
	public static void displayCharacters() {
		
		int[] numArray = new int[4];
		System.out.println("Enter the first number: ");
		numArray[0] = scn.nextInt();
		System.out.println("Enter the second number: ");
		numArray[1] = scn.nextInt();
		System.out.println("Enter the third number: ");
		numArray[2] = scn.nextInt();
		System.out.println("Enter the fourth number: ");
		numArray[3] = scn.nextInt();
		
		for (int i = 0; i < numArray.length; i++) {
			System.out.println(numArray[i] + " - " + (char)numArray[i]);
		}
	}

	

}
