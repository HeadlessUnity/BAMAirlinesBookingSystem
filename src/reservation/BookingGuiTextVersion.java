
package reservation;
import java.util.InputMismatchException;
import java.util.Scanner;
import food.Menu;
import reservation.Reservation;
public class BookingGuiTextVersion {

	public static void main(String[] args) {

		boolean running = true;
		Scanner sc = new Scanner(System.in);
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


			// Enter date and destination
			String input = sc.nextLine().toLowerCase().trim();

			//TODO:Check available flights
			//TODO Check available seats


			//display result of search
			System.out.println("destination" + "date of departure");				
			System.out.println("Seats available in First and economy class available "+ "number of seats" );




			boolean testValue =true;
			while(testValue) {
				System.out.println("First (press 1) or Economy Class(press 2)?");
				int reservationType = 0;
				try {
				String  s =sc.next();
				reservationType = Integer.parseInt(s);
				if (reservationType==1 ||reservationType == 2) {
					reservation.choiceResrvationType(reservationType);
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
			



			//TODO: LOOP HERE?
			//Reserve seat
			//set first or economy status

			//System.out.println("Would you like to eat? yes/no");
			boolean runAgain =false;
			do { System.out.println("Would you like to eat? yes/no");
			try {

				String value=sc.next().toLowerCase().trim();

				switch (value) {
				case "yes":

					Menu m=new Menu();
					m.printFoodList(reservation.getReservationType());
					int foodIndex = 0;
					while (foodIndex == 0)
					{
						foodIndex=sc.nextInt();
						if (foodIndex == 0) {
							break;
						}
						reservation.createFoodOrder(reservation.getReservationType(), foodIndex);
						System.out.println();

						reservation.printFoodOrder();
						System.out.println("Would you like more food? ");

						foodIndex = 0;
					}
					System.out.println(" Food Price ");
					reservation.printFoodOrderPrice();
					System.out.println(" Total Price  ");
					System.out.println( reservation.getTotalPrice());

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





			System.out.println("Enter passenger details: ");
				String x = sc.nextLine();
			System.out.println("Firstname: ");
			String fName = sc.nextLine();
			System.out.println("Lastname: ");
			String lName = sc.nextLine();
			System.out.println("PassPortId ");
			int passPortId = sc.nextInt();

			reservation.createPassenger(fName, lName, passPortId);			

			System.out.println();

			// This just exits the program
			System.out.println("-- Exiting program --");
			sc.close();
			running = false;

		}
	}}

