package reservation;
import java.util.Scanner;

import flightsAndPlanes.AeroplaneCatalog;
import flightsAndPlanes.Flight;
import flightsAndPlanes.FlightCatalog;
import food.Menu;
import passenger.PassengerList;

public class BookingGuiTextVersion {

		public BookingGuiTextVersion() {}
		
		public void run(){
		boolean running = true;
		Scanner sc = new Scanner(System.in);
		// We start by creating a new Reservation
		AeroplaneCatalog aeroplaneCatalog =  new AeroplaneCatalog();
		FlightCatalog flightCatalog =  new FlightCatalog(aeroplaneCatalog);
		PassengerList passengerList = new PassengerList();
		Reservation reservation = new Reservation(flightCatalog, passengerList);

		System.out.println("Welcome to BAM Airline Booking Systems \n ");

		while (running) {


			try {
				Thread.sleep(1000);
			} 
			catch (Exception e) {
				e.printStackTrace();

			}
			int reservationType = 0;
			boolean testValue3 = true;
			while(testValue3) {
				System.out.println("First Class Price: 20 000 KR\nEconomy Class Price: 5 000 KR");
				System.out.println("First Class (press 1) or Economy Class(press 2)?");
				try {
					String  s =sc.next();
					reservationType = Integer.parseInt(s);
					if (reservationType==1 ||reservationType == 2) {
						reservation.choiceResrvationType(reservationType);
						testValue3=false;
					} 

				}

				catch(NumberFormatException ime) {
					testValue3 = true;
				}

				catch (Exception e) {
					e.printStackTrace();
				}


			}

			//TODO:Check available flights
			FlightCatalog reservationFlightCatalog = reservation.getFlightCatalog();
			System.out.println(reservationFlightCatalog);


			//TODO Check available seats
			//reservationFlight.getSeats();
			//System.out.println(reservationFlight.getSeatsToString());
			//display result of search

			// Asks the user what it want to do
			


			// Enter date and destination

			
			boolean testValue =true;
			while(testValue) {
				System.out.println("Select a Flight:\n");
				int flightChoice = 0;
				try {
					String  s =sc.next();
					flightChoice = Integer.parseInt(s);
					if (flightChoice <= reservationFlightCatalog.countNrOfFlights()) {
						reservation.setReservationFlight(flightChoice);
						reservation.getReservationFlight().setReservationType(reservationType);
						System.out.println("Flight chosen:\t" + reservation.getReservationFlight());
						
						testValue=false;
					} 

				}

				catch(NumberFormatException ime) {
					testValue = true;
				}

				catch (Exception e) {
					e.printStackTrace();
				}


			}
				
			//System.out.println("Please select an available seat:\n");

			System.out.println(reservation.getReservationFlight().getSeatsToString());

			boolean testValue2 =true;
			while(testValue2) {
				System.out.println("Please select an available seat:\n");
				int seatChoice = 0;
				try {
					String  s =sc.next();
					seatChoice = Integer.parseInt(s);
					if (seatChoice <= reservation.getReservationFlight().countNrOfSeats()) {
						reservation.getReservationFlight().setSeatToBooked(seatChoice);
						System.out.println("Seat chosen:\n" + reservation.getReservationFlight().getSeatsToString());
						testValue2=false;
					} 

				}

				catch(NumberFormatException ime) {
					testValue = true;
				}

				catch (Exception e) {
					e.printStackTrace();
				}


			}			


			System.out.println("Enter passenger details: ");
			String x = sc.nextLine();
			System.out.println("Firstname: ");
			String fName = sc.nextLine();
			System.out.println("Lastname: ");
			String lName = sc.nextLine();
			System.out.println("PassPortId ");
			int passPortId = sc.nextInt();

			reservation.createPassenger(fName, lName, passPortId);			



			//TODO: LOOP HERE?
			//Reserve seat
			//set first or economy status

			//System.out.println("Would you like to eat? yes/no");
			boolean runAgain =false;
			System.out.println("Would you like to eat? yes/no");
			do {
			try {

				String value=sc.next().toLowerCase().trim();

				switch (value) {
				case "yes":
					System.out.println("Please choose a number from the menu.\n");
					Menu m=new Menu();
					System.out.println(m.printFoodList(reservation.getReservationType()));
					int foodIndex = 0;
					while (foodIndex == 0)
					{
						foodIndex=sc.nextInt();
						if (foodIndex == 0) {
							break;
						}
						reservation.createFoodOrder(reservation.getReservationType(), foodIndex);
						System.out.println();

						System.out.println(reservation.printFoodOrder());
						System.out.println(m.printFoodList(reservation.getReservationType()));
						System.out.println("Please choose a number from the menu.\npress 0 to finish your order.");

						foodIndex = 0;
					}
					System.out.println(" Food Price ");
					reservation.printFoodOrderPrice();
					//System.out.println(" Total Price  ");
					//System.out.println( reservation.getTotalPrice());

					break;
				case "no":
					System.out.println(" Total Price  ");
					System.out.println( reservation.getTotalPrice());
					runAgain= false;
					break;

				default: 
					runAgain =true;
					throw new Exception("WRONG!!!");

				}
			} catch (Exception e) {
				//e.printStackTrace();
				System.out.println("ERROR: FUCKER, You entered an illegal command.");


			}
			}while (runAgain);




			System.out.println("THIS IS YOUR TICKET\nFlight chosen:\t" + reservation.getReservationFlight() + "\n" +
			"Your Personal Information: " + reservation.getpL() + "\n" +
					"Your Food Order:" + reservation.printFoodOrder() + "\n" + "Total Price\n:"  + reservation.getTotalPrice() + reservation.printFoodOrderPrice());

			// This just exits the program
			System.out.println("-- Exiting program --\n****HAVE A NICE FLIGHT******");
			sc.close();
			running = false;

		}
	}}