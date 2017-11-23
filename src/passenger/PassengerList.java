package passenger;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PassengerList {

	private List<Passenger> passengerList;
	
	/**
	 * method that take a search parameter and returns a specific passenger
	 * @param searchCriteria
	 * @return
	 */
	public List<Passenger> findPassenger(Predicate<Passenger> searchCriteria) {		
		return passengerList.stream().filter(searchCriteria).collect(Collectors.toList());
	}
	/**
	 * method to add passenger to passsengerlist
	 * @param passenger
	 */
	public void addPassenger(Passenger passenger) {
		passengerList.add(passenger);		
	}
	//method to print a passengerlist
	public void printPassengerList() {
		System.out.println(passengerList.toString());
	}
	//method that create a arraylist of passengers
	public PassengerList() {
		passengerList = new ArrayList<Passenger>();
			
	passengerList.add(new Passenger("Miguel","De Cervante",1231));
	passengerList.add(new Passenger("Jonathan", "Swift",1232));
	passengerList.add(new Passenger("Jane", "Austen",1233));
	passengerList.add(new Passenger("Mary", "Shelley",1234));
	passengerList.add(new Passenger("Alexandre", "Dumas",1235));
	passengerList.add(new Passenger("Charlotte", "Bronte",1236));
			
	}
	
}
