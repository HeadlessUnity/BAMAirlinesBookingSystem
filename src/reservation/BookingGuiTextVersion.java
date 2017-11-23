package reservation;
import java.util.Scanner;

import Food.Menu;

public class BookingGuiTextVersion {

	public static void main(String[] args) {
		ReservationType rT;

		boolean running = true;

		// We start by creating a new Reservation
		Reservation reservation = new Reservation();

		System.out.println("Welcome to BAM Airline Booking Systems \n ");

		while (running) {


			try {
				Thread.sleep(1000);
			} 
			catch (Exception e) {
				e.printStackTrace();
			}
			// Asks the user what it want to do
			System.out.println("Where and when would you like to fly?");

			Scanner sc = new Scanner(System.in);				
			// Enter date and destination
			String input = sc.nextLine().toLowerCase().trim();

			//TODO:Check available flights
			//TODO Check available seats


			//display result of search
			System.out.println("destination" + "date of departure");				
			System.out.println("Seats available in First and economy class available "+ "number of seats" );



			System.out.println("First (press 1) or Economy Class(press 2)?");

			String i=sc.nextLine();
			if (i.equals("1")) {
				rT= ReservationType.FIRST_CLASS;
			} else {
				rT=ReservationType.ECONOMY_CLASS;
			}



			//TODO: LOOP HERE?
			//Reserve seat
			//set first or economy status


			System.out.println("What would you like to eat? (No food press: 0)");
			Menu m=new Menu();
			m.printFoodList(rT);
			int foodIndex;
			do {
				foodIndex=sc.nextInt();
				if (foodIndex!=0) {
					reservation.createFoodOrder(rT, foodIndex);
				}
			} while (foodIndex ==0);			
		
			System.out.println("Enter passenger details: ");
			//String x = sc.nextLine();
			System.out.println("Firstname: ");
			String fName = sc.nextLine();
			System.out.println("Lastname: ");
			String lName = sc.nextLine();
			System.out.println("PassPortId ");
			String passPortId = sc.nextLine();
			
			reservation.createPassenger(fName, lName, passPortId);			

			System.out.println();
						
			// This just exits the program
			System.out.println("-- Exiting program --");
			sc.close();
			running = false;

		}
	}
}

