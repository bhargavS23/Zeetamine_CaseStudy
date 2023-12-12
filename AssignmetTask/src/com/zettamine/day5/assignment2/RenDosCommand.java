package com.zettamine.day5.assignment2;

import java.io.File;

public class RenDosCommand {
	
	public static void main(String[] args) {
		
		File file = new File("D:\\File Handling\\New Directory\\New File\\New File.txt");
		File renamedFile = new File("D:\\File Handling\\New Directory\\New File\\Renamed_File.txt");
		
		 if(file.renameTo(renamedFile)) {
			 System.out.println("File Rename sucessfull");
		 }
		 else System.out.println("Error in renaming the file");
	}

}
