package com.zettamine.day4;

import java.util.Scanner;

public class StudentApp {

	static Scanner scn = new Scanner(System.in);
	static Student stu;
	public static void main(String[] args) {


		System.out.println("Enter the Student Details & Hostel Details:");
		
		System.out.print("Student ID: ");
		int id = scn.nextInt();
		scn.nextLine();
		System.out.print("Student name: ");
		String name = scn.nextLine();
		while(!name.matches("^[a-z A-Z]+")) {
			System.err.println("Enter valid name");
			System.out.print("Student name: ");
			name = scn.nextLine();
		}
		System.out.print("Department ID: ");
		int depId = scn.nextInt();
		System.out.print("Gender: ");
		String gender = scn.next();
		System.out.print("Phone Number: ");
		String phoneNum = scn.next();
		while(!phoneNum.matches("^[6-9][0-9]{9}+")) {
			System.err.println("Enter valid Phone Nuber");
			System.out.print("Phone Number: ");
			phoneNum = scn.nextLine();
		}
		
		System.out.print("Hostel Name: ");
		String hostelName = scn.next();
		System.out.print("Room Number: ");
		int roomNum = scn.nextInt();
		
		Hosteller hosteller = new Hosteller(hostelName, roomNum);
		
		stu = new Student(id, hostelName, depId, gender, phoneNum, hosteller);
		getHostellerDetails();
		
		System.out.println("Student ID     :" + stu.getStudentId());
		System.out.println("Student Name   :" + stu.getName());
		System.out.println("Department ID  :" + stu.getDepartmentId());
		System.out.println("Gender         :" + stu.getGender());
		System.out.println("Phone Number   :" + stu.getPhone());
		System.out.println("Hostel Name    :" + stu.hosteller.getHostelName());
		System.out.println("Room Number    :" + stu.hosteller.getRoomNum());

	}
	public static Hosteller getHostellerDetails() {
		
		System.out.print("Modify Phone Number(Y/N): ");
		char phoneNumChng = scn.next().charAt(0);
		scn.nextLine();
		if (phoneNumChng == 'Y' || phoneNumChng == 'y') {
			System.out.print("Enter new phone number: ");
			String phoneNum = scn.nextLine();
			stu.setPhone(phoneNum);
		}
		System.out.print("Modify Room Number(Y/N): ");
		char roomChng = scn.next().charAt(0);
		if (roomChng == 'y' || roomChng == 'Y') {
			System.out.print("Enter new room number: ");
			int roomNum = scn.nextInt();
			stu.hosteller.setRoomNum(roomNum);
		}
		return stu.hosteller;
		
	}

}
