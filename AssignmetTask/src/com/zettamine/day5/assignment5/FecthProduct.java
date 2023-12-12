package com.zettamine.day5.assignment5;

import com.zettamine.day5.assignment4.Product;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;



public class FecthProduct {

	static Product[] prod;
	static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {

		if (deserializeProduct() != null) {
			System.out.println(fecthProduct());
		}
	}

	public static Product[] deserializeProduct() {

		try (FileInputStream fis = new FileInputStream("D:\\File Handling\\New Directory\\New File\\Product.ser")) {
			ObjectInputStream ois = new ObjectInputStream(fis);

			prod = (Product[]) ois.readObject();
			if (prod.length > 0) {
				return prod;
			}

		} catch (FileNotFoundException e) {
			System.out.println("Please Enter Stock");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Please enter Stock Details");
		return null;
	}

	public static String fecthProduct() {
		System.out.print("Enter product Id: ");
		int id = scn.nextInt();
		for (Product product : prod) {
			if (product.getProductId() == id) {
				return product.getProductName();
			}
		}
		return "Product Not Available";
	}
}
