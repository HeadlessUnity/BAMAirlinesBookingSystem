package reservation;
import java.util.Scanner;

import food.Menu;

public class BookingGuiTextVersion {

	public static void main(String[] args) {
		ReservationType rT;

		boolean running = true;

		// We start by creating a new Reservation
		Reservation reservation = new Reservation();

		System.out.println("Welcome to BAM Airline Booking Systems \n ");

		while (running) {

<<<<<<< HEAD
		boolean running = true;

		// We start by creating a new Reservation
		Reservation reservation = new Reservation();

		System.out.println("Welcome to BAM Airline Booking Systems \n ");

		while (running) {

=======
>>>>>>> origin/food
			try {
				Thread.sleep(2000);
			} 
			catch (Exception e) {
				e.printStackTrace();
			}
			// Asks the user what it want to do
			System.out.println("Where and when would you like to fly?");
<<<<<<< HEAD
			Scanner sc = new Scanner(System.in);				  
			// Enter date and destination
			String input = sc.nextLine().toLowerCase().trim();

			//TODO get available flights
			//TODO get available seats
=======
			Scanner sc = new Scanner(System.in);				
			// Enter date and destination
			String input = sc.nextLine().toLowerCase().trim();

			//TODO:Check available flights
			//TODO Check available seats
>>>>>>> origin/food

			//display result of search
			System.out.println("destination" + "date of departure");				
			System.out.println("Seats available in First and economy class available "+ "number of seats" );


<<<<<<< HEAD
			System.out.println("First or Economy Class?");

			//TODO Reserve seat
			//TODO set first or economy status

			System.out.println("What would you like to eat?");

//TODO shit

			switch (input) {

=======
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

			System.out.println("What would you like to eat? (No food press: q)");
			
			Menu m=new Menu();
			m.printFoodList(rT);
			sc.nextLine().toLowerCase().trim();
			



			switch (input) {
			case "":
>>>>>>> origin/food

			case "help":
				// This is just some help if the user don't know what to type
				//System.out.println(helpMessage());
				break;

			case "exit":
				// This just exits the program
				System.out.println("-- Exiting program --");
				sc.close();
				running = false;
				break;

			default:
				System.out.println(" -- Invalid command, type \"help\" for command list --\n");

				break;
			}
		}
	}
	public String startHint() {
		return " +-------------------------------------+\n" +
				" | Type \"help\" to see the command list |\n" +
				" |     Type \"exit\" to exit program     |\n" +
				" +-------------------------------------+\n";
	}

	public String helpMessage() {
		return "  -- This is the help section -- \n" + 
				" +--------------------------------------+\n" + 
				" |\t Command | Function\t\t|\n" +
				" +--------------------------------------+\n" + 
				" |\t-add\t   Add task\t\t|\n" +
				" |\t-remove\t   Remove task\t\t|\n" +
				" |\t-list\t   List all tasks\t|\n" +
				" |\t-find\t   Find tasks\t\t|\n" +
				" |\t-edit\t   Edit a task\t\t|\n" +
				" |\t-exit\t   Exit program\t\t|\n" +
				" +--------------------------------------+\n";
	}
}


