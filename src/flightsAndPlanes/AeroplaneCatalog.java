package flightsAndPlanes;

import java.util.Map;

public class AeroplaneCatalog extends Catalog<Integer, Aeroplane>{
	
	public Aeroplane getFirstAvailableAeroplane() {
		Aeroplane aeroplane = null;
		for (Map.Entry<Integer, Aeroplane> entry : map.entrySet())
		{
			if (entry.getValue().isObjectAvailable()) {
				aeroplane = entry.getValue();
			}
		}
		return aeroplane;
	
	}

	@Override
	public String toString() {
		return "Available Planes: " + map;
	}
	
}