package flightsAndPlanes;

import java.util.HashMap;
import java.util.Optional;
import java.util.Map.Entry;

public class FlightCatalog {
	public static HashMap<Integer, Flight> flightMap;
	
	

	public HashMap<Integer, Flight> getflightCatalog() {
		return flightMap;
	}

	public static Flight getFirstAvailableflight() {
	Optional<Entry<Integer, Flight>> optionalPlane = flightMap.entrySet().stream().filter(
			(entrySet) -> entrySet.getValue().isFlightAvailable()).findFirst();
	Entry<Integer, Flight> entry = optionalPlane.get();
	return entry.getValue();
	}

	public Flight getflight(int flightNumber) {
		return flightMap.get(flightNumber);
	}
	
	public void addflight(Flight flight) {
		flightMap.put(flight.getFlightNumber(), flight);
	}
	public void removeflight(int flightNumber) {
		flightMap.remove(flightNumber);
		
	}
	@Override
	public String toString() {
		return "Available Planes: " + flightMap;
	}
	
}
