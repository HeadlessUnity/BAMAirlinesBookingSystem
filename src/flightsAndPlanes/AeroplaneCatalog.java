package flightsAndPlanes;

import java.util.HashMap;

public class AeroplaneCatalog {
	HashMap<String, Flight> flightMap;

	public HashMap getAeroplaneCatalog() {
		return flightMap;
	}

	@Override
	public String toString() {
		return "Available Planes: " + flightMap;
	}

	//TODO: Remove/add
	
}