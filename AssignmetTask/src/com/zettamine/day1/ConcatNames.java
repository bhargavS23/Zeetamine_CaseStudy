package com.zettamine.day1;

import java.util.Scanner;

public class ConcatNames {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Inmate's name: ");
		String inmateName = scan.nextLine().toUpperCase();
		System.out.print("Inmate's father name: ");
		String inmatesFatherName = scan.nextLine().toUpperCase();
		scan.close();
		if(inmateName.matches("[a-zA-Z\\s]+") && inmatesFatherName.matches("[a-zA-Z]+")) {
			System.out.println(inmateName.concat(" "+inmatesFatherName).replace("\\s+"," "));
		} else System.out.println("\u001B[31mInvalid Name");
	}
}
