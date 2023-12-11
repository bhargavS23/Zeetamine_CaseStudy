package com.zettamine.day1;

import java.util.Arrays;
import java.util.Scanner;

public class CheckLeastOffer {

	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number of items: ");
		int numOfitems = scn.nextInt();
		scn.nextLine();
		String[] items = new String[numOfitems];
		String item = "";
		float[] disarray = new float[numOfitems];
		String[] itemName = new String[numOfitems];
		for (int i = 0; i < numOfitems; i++) {
			item = scn.nextLine();
			items[i] = item;
		}
		
		for (int i = 0; i < items.length; i++) {
			String[] item1 = items[i].split(",");
			itemName[i] = item1[0];
			int price = Integer.parseInt(item1[1]);
			int discount = Integer.parseInt(item1[2]);
			disarray[i] = (float) (price * discount) / 100;
		}

		System.out.println(Arrays.toString(itemName));
		System.out.println(Arrays.toString(disarray));
		float min = disarray[0];
		int index = 0;
		for (int k = 0; k < disarray.length; k++) {
			if (disarray[k] < min) {
				min = disarray[k];
				index = k;
			}
		}
		System.out.println("Items with Minimum Discount: " + itemName[index]);
	}

}
