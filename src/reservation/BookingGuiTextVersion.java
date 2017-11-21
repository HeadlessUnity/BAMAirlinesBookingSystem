package reservation;
import java.util.Scanner;

public class BookingGuiTextVersion {

	public static void main(String[] args) {

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

				//Check available flights
				//Check available seats
				
//display result of search
				System.out.println("destination" + "date of departure");				
				System.out.println("Seats available in First and economy class available "+ "number of seats" );
				
				
				System.out.println("First or Economy Class?");

				//Reserve seat
				//set first or economy status

				System.out.println("What would you like to eat?");
				
				

				switch (input) {
				

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


