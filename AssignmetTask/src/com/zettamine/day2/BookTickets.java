package com.zettamine.day2;

import java.util.Scanner;

public class BookTickets {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		Ticket ticket = new Ticket();
		
		System.out.print("Enter no of bookings: ");
		int noOfbookings = scn.nextInt();
		
		System.out.print("Enter available tickets: ");
		int setAvailableTickets = scn.nextInt();
		Ticket.setAvailableTickets(setAvailableTickets);
		int availableTickets = Ticket.getAvailableTickets();
		
		System.out.print("Enter the ticket Id: ");
		int ticketId = scn.nextInt();
		ticket.setTicketid(ticketId);
		
		System.out.print("Enter the ticket price: ");
		int price = scn.nextInt();
		ticket.setPrice(price);
		
		System.out.print("Enter the no of ticket: ");
		int noOfTickets = scn.nextInt();
		int totalTktCost = ticket.calculateTicketCost(noOfTickets);
		
		System.out.println("Tickets available\t:" + availableTickets);
		System.out.println("Total cost\t\t   :" + totalTktCost);
		System.out.println("Tickets available after booking :" + Ticket.getAvailableTickets());
	}

}
