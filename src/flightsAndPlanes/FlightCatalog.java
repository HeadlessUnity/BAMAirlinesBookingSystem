package flightsAndPlanes;
import java.time.LocalDateTime;
import java.util.Map;

public class FlightCatalog extends Catalog<Integer, Flight>{
	
	public FlightCatalog(AeroplaneCatalog aeroplaneCatalog) {
		LocalDateTime now = LocalDateTime.now();
		LocalDateTime later = now.plusMonths(5);

		Flight ukToSweden = new Flight(now, "Heathrow", "United-Kingdom",
				"5D", "Sweden", now.plusHours(3), aeroplaneCatalog);
		Flight  swedenToUk = new Flight(now.plusDays(3), "Arlanda", "Sweden",
				"12D", "United-Kingdom", now.plusDays(3).plusHours(3), aeroplaneCatalog);
		Flight ukToZanzibar = new Flight(later, "Heathrow", "United-Kingdom",
				"1F", "Sweden", later.plusHours(9), aeroplaneCatalog);
		
		map.put(ukToSweden.getNumber(), ukToSweden);
		map.put(swedenToUk.getNumber(), swedenToUk);
		map.put(ukToZanzibar.getNumber(), ukToZanzibar);
	}

	public Flight getFirstAvailableflight() {
		Flight flight = null;
		for (Map.Entry<Integer, Flight> entry : map.entrySet())
		{
			if (entry.getValue().isObjectAvailable()) {
				flight = entry.getValue();
			}
		}
		return flight;
	
	}

	public int countNrOfFlights() {
		return map.size();

	}
	
	@Override
	public String toString() {
		return "Available Flights: \n" + map;

	}
	
}
