package com.zettamine.day5.assignment4;

import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("How many products to be saved: ");
		int numOfProd = scn.nextInt();
		Product[] product = new Product[numOfProd];
		
		for (int i = 0; i < product.length; i++) {
			System.out.print("Enter product id: ");
			int id = scn.nextInt();
			scn.nextLine();
			System.out.print("Enter product Name: ");
			String name = scn.nextLine();
			product[i] = new Product(id,name);
		}
		Product.seriallizeProduct(product);
	}
}
