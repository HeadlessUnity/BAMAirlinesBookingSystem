package flightsAndPlanes;

import java.util.HashMap;

public class FlightCatalog {
	HashMap<String, Flight> flightMap;

	public HashMap getFlightCatalog() {
		return flightMap;
	}

	@Override
	public String toString() {
		return "Available Flights: " + flightMap;
	}

	//TODO: Remove/add	
	
}
