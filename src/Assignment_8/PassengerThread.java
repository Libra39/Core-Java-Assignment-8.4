package Assignment_8;													// Package declared
public class PassengerThread extends Thread{							// class declared with extension Thread. A thread can be created in java by extending Thread class.
	private int seatsNeeded;											// private integer declared
	public PassengerThread(int seats, Runnable target, String name) {	// Parameterized constructor declared 
		super(target,name);												// Super keyword is used to distinguish between class variables and instance variables
		this.seatsNeeded = seats;}										// This keyword is used to distinguish between class variables and instance variables
	public int getSeatsNeeded() {										// getter method created
		return seatsNeeded;}
}																		// class PassengerThread closed