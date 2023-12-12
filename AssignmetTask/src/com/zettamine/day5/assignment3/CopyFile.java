package com.zettamine.day5.assignment3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

	public static void main(String[] args) {
		
		try(FileInputStream fis = new FileInputStream("D:\\File Handling\\New Directory\\New File\\Original.txt")){
			FileOutputStream fos = new FileOutputStream("D:\\File Handling\\New Directory\\New File\\Copied.txt");
			int copy = 0;
			while(copy != -1) {
				copy = fis.read();
				fos.write(copy);
			}
			System.out.println("Copied the file sucessfully");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
