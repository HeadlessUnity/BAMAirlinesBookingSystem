package flightsAndPlanes;

import java.util.HashMap;
import java.util.Optional;
import java.util.Map.Entry;

public class FlightCatalog extends Catalog{
	public HashMap<Integer, Flight> flightMap = new HashMap<Integer, Flight>();
	
	

	public HashMap<Integer, Flight> getflightCatalog() {
		return flightMap;
	}

	public Flight getFirstAvailableFlight() {
	Optional<Entry<Integer, Flight>> optionalPlane = flightMap.entrySet().stream().filter(
			(entrySet) -> entrySet.getValue().isObjectAvailable()).findFirst();
	Entry<Integer, Flight> entry = optionalPlane.get();
	return entry.getValue();
	}

	@Override
	public String toString() {
		return "Available Flights: " + flightMap;
	}
	
}
