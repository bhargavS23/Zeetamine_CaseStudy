package com.zettamine.day2;
import java.util.Scanner;


public class StudentMain {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the Student ID: ");
		int studentId = scn.nextInt();
		scn.nextLine();

		System.out.print("Enter the Student Name: ");
		String name = scn.nextLine();

		System.out.print("Enter the Student Address: ");
		String address = scn.nextLine();

		System.out.print("Whether the student from NIT: ");
		String nitCheck = scn.nextLine();

		String collegeName;

		while (true) {

			if (nitCheck.equals("YES") || nitCheck.equals("yes")) {
				collegeName = "NIT";
				break;
			} else if (nitCheck.equals("NO") || nitCheck.equals("no")) {
				System.out.print("Enter the College Name: ");
				collegeName = scn.nextLine();
				break;
			} else {
				System.out.println("\u001B[31mWrong input please enter valid input (YES/NO): ");
				System.out.print("Whether the student from NIT: ");
				 nitCheck = scn.nextLine();
			}
		}
		Student student;
		if (nitCheck.equals("YES") || nitCheck.equals("yes")) {
			student = new Student(studentId, name, address);
		}
		else {
			 student = new Student(studentId, name, address, collegeName);
		}
		System.out.println("Student ID\t: "+ student.getStudentID());
		System.out.println("Student Name\t: "+ student.getStudentName());
		System.out.println("Student Address\t: "+ student.getStudentAddress());
		System.out.println("Colege Name\t: "+ student.getCollegeName());
	}

}
