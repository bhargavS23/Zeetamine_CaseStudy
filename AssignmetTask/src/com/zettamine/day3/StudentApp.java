package com.zettamine.day3;

import java.util.Scanner;

public class StudentApp {

	static Hosteller student;
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter the Student Details & Hostel Details:");
		System.out.print("Student ID: ");
		int id = scn.nextInt();
		scn.nextLine();
		System.out.print("Student name: ");
		String name = scn.nextLine();
		System.out.print("Department ID: ");
		int depId = scn.nextInt();
		System.out.print("Gender: ");
		String gender = scn.next();
		System.out.print("Phone Number: ");
		String phoneNum = scn.next();
		
		//Validating the phone Number
		while (!phoneNum.matches("^[6-9][0-9]{9}")) {
			System.err.println("Please enter valid phone number");
			System.out.print("Phone Number: ");
			phoneNum = scn.next();
		}
		System.out.print("Hostel Name: ");
		String hostelName = scn.next();
		System.out.print("Room Number: ");
		int roomNum = scn.nextInt();

		student = new Hosteller(id, name, depId, gender, phoneNum, hostelName, roomNum);
		getHostellerDetails();

		System.out.println("Student ID     :" + student.getStudentId());
		System.out.println("Student name   :" + student.getName());
		System.out.println("Department ID  :" + student.getDepartmentId());
		System.out.println("Gender         :" + student.getGender());
		System.out.println("Phone Number   :" + student.getPhone());
		System.out.println("Hostel Name    :" + student.getHostelName());
		System.out.println("Room Number    :" + student.getRoomNumber());

	}

	// to modify roomNum and PhoneNum
	public static Hosteller getHostellerDetails() {

		System.out.print("Modify Phone Number(Y/N): ");
		char phoneNumChng = scn.next().charAt(0);
		if (phoneNumChng == 'Y' || phoneNumChng == 'y') {
			System.out.println("Enter new phone number");
			String phoneNum = scn.nextLine();
			student.setPhone(phoneNum);
		}
		System.out.print("Modify Room Number(Y/N): ");
		char roomChng = scn.next().charAt(0);
		if (roomChng == 'y' || roomChng == 'Y') {
			System.out.print("Enter new room number: ");
			int roomNum = scn.nextInt();
			student.setRoomNumber(roomNum);
		}
		return student;
	}
}
