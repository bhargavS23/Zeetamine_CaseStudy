package com.zettamine.day2;

public class Student {
	
	private int studentID;
	private String studentName;
	private String studentAddress;
	private String collegeName;
	
	public Student(int studentID, String studentName, String studentAddress) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.collegeName = "NIT";
	}
	
	public Student(int studentID, String studentName, String studentAddress, String collegeName) {
		this(studentID, studentName, studentAddress);
		this.collegeName = collegeName;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
 }
