package Assignment_8;																																// Package declared
public class BusReservation implements Runnable{																									// class declared, Java Thread By Implementing Runnable Interface
	private int totalSeatsAvailable=4;																												// private Integer variable declared 
	public void run() {																																// implementation for run() method	
		PassengerThread pt = (PassengerThread) Thread.currentThread();																				// thread called
		boolean ticketsBooked = this.bookTickets(pt.getSeatsNeeded(), pt.getName());																// boolean condition for the availability of seats
		if(ticketsBooked==true){
			System.out.println(Thread.currentThread().getName()+" : The Number of Seats Requested "+pt.getSeatsNeeded()+" are BOOKED ");
		}else{
			System.out.println(Thread.currentThread().getName()+" : The number of seats requested "+pt.getSeatsNeeded()+" are not available");}
	}																																				// run() method closed
	
   public  synchronized boolean bookTickets(int seats, String name){																				// Parameterized synchronized method bookTickets() by using BusReservation class created
	  System.out.println("\n             Welcome to Volvo Bus Service \n"+"==========================================================");			// print statement
			  System.out.println(Thread.currentThread().getName()+" : Number of Tickets Available are : "+this.getTotalSeatsAvailable());			// print statement
		if (seats>this.getTotalSeatsAvailable()) {																									// if else condition to check total Seats Available
			return false;
		} else {
			totalSeatsAvailable = totalSeatsAvailable-seats;
			return true;}
	}

	private int getTotalSeatsAvailable() {																											// getter declared
		return totalSeatsAvailable;}
}																																					// class closed

