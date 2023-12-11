package com.zettamine.day1;

import java.util.Scanner;

public class MovieTicketCalculation {

	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		calcTiktPrice();
	}
	private static void calcTiktPrice() {
		
		double ticketPrice = 0; 
		
		System.out.print("Enter the number of tickets: ");
		int numOfTickets = scan.nextInt();
		if(numOfTickets < 5 || numOfTickets > 40 ) {
			System.out.println("\u001B[31mMinimum of 5 and Maximum of 40 Tickets");
			return;
		}
		System.out.print("Do you want refreshment: ");
		char refreshment = scan.next().charAt(0);
		System.out.print("Do you have cupon code: ");
		char cuponCode = scan.next().charAt(0);
		
		System.out.print("Enter the Circle: ");
		char circle = scan.next().charAt(0);
		
		if(circle == ('K' | 'k')) {
			ticketPrice = 75;
		}
		else if(circle == ('Q' | 'q')) {
			ticketPrice = 50;
		}
		else {
			System.out.println("\u001B[31mInvalid Input");
			return;
		}
		
		double totalPriceBefDis = ticketPrice * numOfTickets;
		double totalPriceAftDis = totalPriceBefDis;
		
		if(numOfTickets > 20) {
			totalPriceAftDis -= (totalPriceBefDis * 0.1);
			System.out.println("totalPriceAftDis: "+ totalPriceAftDis);
		}
		if(cuponCode == ('Y' | 'y')) {
			totalPriceAftDis = totalPriceAftDis - (totalPriceAftDis * 0.02) ;
			System.out.println("cupon dis totalPriceAftDis: "+ totalPriceAftDis);
		}
		if(refreshment == ('Y' | 'y')) {
			totalPriceAftDis =  (50 * numOfTickets) + totalPriceAftDis;
		}
		System.out.println("\n Total cost: " + totalPriceAftDis);
	}
}
