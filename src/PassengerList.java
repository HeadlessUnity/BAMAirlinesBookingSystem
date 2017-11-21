import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PassengerList {

	private List<Passenger> passenger;
	
	public List<Passenger> findPassenger(Predicate<Passenger> searchCriteria) {		
		return passenger.stream().filter(searchCriteria).collect(Collectors.toList());
	}

	public PassengerList() {
		passenger = new ArrayList<Passenger>();
			
	passenger.add(new Passenger("Miguel","De Cervante","1231"));
	passenger.add(new Passenger("Jonathan", "Swift","1232"));
	passenger.add(new Passenger("Jane", "Austen","1233"));
	passenger.add(new Passenger("Mary", "Shelley","1234"));
	passenger.add(new Passenger("Alexandre", "Dumas","1235"));
	passenger.add(new Passenger("Charlotte", "Bronte","1236"));
			
	}
}
