package com.zettamine.day5.assignment1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateDirectoryAndFile {

	public static void main(String[] args) {

		File fileDirc = new File("D:\\File Handling\\New Directory\\New File");
		if (fileDirc.mkdirs()) {
			System.out.println("Directory created");
		} else
			System.out.println("Error while creating Directory");

		try (FileOutputStream fis = new FileOutputStream("D:\\File Handling\\New Directory\\New File\\Java.txt")) {

			System.out.println("File added to the directory");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
