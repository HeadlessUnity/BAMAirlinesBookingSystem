package tests;

import java.util.Scanner;

import org.junit.Test;

import food.Menu;
import reservation.Reservation;
import reservation.ReservationType;

public class foodTest {

	@Test
	public void test() {

		ReservationType rT = null;

		boolean running = true;

		// We start by creating a new Reservation
		Reservation reservation = new Reservation();

		System.out.println("Welcome to BAM Airline Booking Systems \n ");

		while (running) {

			try {
				Thread.sleep(2000);
			} 
			catch (Exception e) {
				e.printStackTrace();
			}
			// Asks the user what it want to do
			System.out.println("Where and when would you like to fly?");
			Scanner sc = new Scanner(System.in);				
			// Enter date and destination
			String input = sc.nextLine().toLowerCase().trim();


			//display result of search
			System.out.println("destination" + "date of departure");				
			System.out.println("Seats available in First and economy class available "+ "number of seats" );


			System.out.println("First (press 1) or Economy Class(press 2)?");

			int i=sc.nextInt();
			if (i==1) {
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
			int foodIndex = 0;
			while (foodIndex == 0)
			{
				foodIndex=sc.nextInt();
				if (foodIndex == 0) {
					break;
				}
				reservation.createFoodOrder(rT, foodIndex);
				System.out.println();

				reservation.printFoodOrder();
				System.out.println("Would you like more food?");
				
				foodIndex = 0;
			}
		}

	}
}
