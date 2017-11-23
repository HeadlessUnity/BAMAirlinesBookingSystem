package flightsAndPlanes;

import java.util.HashMap;
import java.util.Optional;
import java.util.Map.Entry;

public abstract class Catalog {
	public static HashMap<Integer, Flight> map = new HashMap<Integer, Flight>();
	
	

	public HashMap<Integer, Flight> getflightCatalog() {
		return flightMap;
	}

	public static Flight getFirstAvailableFlight() {
	Optional<Entry<Integer, Flight>> optionalPlane = flightMap.entrySet().stream().filter(
			(entrySet) -> entrySet.getValue().isFlightAvailable()).findFirst();
	Entry<Integer, Flight> entry = optionalPlane.get();
	return entry.getValue();
	}

	public static Flight getFlight(int flightNumber) {
		return flightMap.get(flightNumber);
	}
	
	public static void addFlight(Flight flight) {
		flightMap.put(flight.getFlightNumber(), flight);
	}
	public static void removeFlight(int flightNumber) {
		flightMap.remove(flightNumber);
		
	}
	@Override
	public String toString() {
		return "Available Flights: " + flightMap;
	}
	
}

