package flightsAndPlanes;

import java.util.Map;

public class FlightCatalog extends Catalog<Integer, Flight>{

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

	@Override
	public String toString() {
		return "Available Flights: " + map;
	}
	
}
