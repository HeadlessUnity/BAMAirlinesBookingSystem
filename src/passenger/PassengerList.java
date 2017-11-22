package passenger;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PassengerList {

	private List<Passenger> passengerList;
	
	public List<Passenger> findPassenger(Predicate<Passenger> searchCriteria) {		
		return passengerList.stream().filter(searchCriteria).collect(Collectors.toList());
	}
	
	public void addPassenger(Passenger passenger) {
		passengerList.add(passenger);		
	}
	
	public void displayPassengerList() {
		System.out.println(passengerList.toString());
	}
	

	public PassengerList() {
		passengerList = new ArrayList<Passenger>();
			
	passengerList.add(new Passenger("Miguel","De Cervante","1231"));
	passengerList.add(new Passenger("Jonathan", "Swift","1232"));
	passengerList.add(new Passenger("Jane", "Austen","1233"));
	passengerList.add(new Passenger("Mary", "Shelley","1234"));
	passengerList.add(new Passenger("Alexandre", "Dumas","1235"));
	passengerList.add(new Passenger("Charlotte", "Bronte","1236"));
			
	}
	
}
