/**
 * 
 * Write a Program to reserve tickets in an online bus reservation system using synchronization. 
 * Program must have option for single thread to book multiple seats.
 * For each seat, the program must take a passenger name. Program should print number of seats booked at the end as report.
 */
package Assignment_8;																			// Package declared

/**
 * All the comments in the program will be placed on the Right-Hand-Side.
 * @author Sahil Khurana <sahilkhurana369@gmail.com
 */
public class VolvoBusService {																	// VolvoBusService Class Declared
	public static void main(String[] args){										    			// main method started
		BusReservation busReservation = new BusReservation();									// new object initialized 
		PassengerThread passengerThread1 = new PassengerThread(2,busReservation,"Sahil");		// passengerThread1 object initialized and parameters are passed
		PassengerThread passengerThread2 = new PassengerThread(2, busReservation, "Jack");		// passengerThread2 object initialized and parameters are passed
		PassengerThread passengerThread3 = new PassengerThread(2, busReservation, "Mac");		// passengerThread2 object initialized and parameters are passed
		passengerThread1.start();																// Call start() method to start executing the thread object. 
		passengerThread2.start();																// Call start() method to start executing the thread object.
		passengerThread3.start();																// Call start() method to start executing the thread object.
	}																							// main method closed
}																								// class VolvoBusService closed
