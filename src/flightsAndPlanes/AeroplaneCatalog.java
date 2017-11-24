package flightsAndPlanes;

import java.util.Map;

public class AeroplaneCatalog extends Catalog<Integer, Aeroplane>{
	
	public AeroplaneCatalog() {
		Aeroplane first = new Aeroplane("AirBus380");
		Aeroplane second = new Aeroplane("AirBus320");		
		Aeroplane third = new Aeroplane("boeing747");	
		
		map.put(first.getNumber(), first);
		map.put(second.getNumber(), second);
		map.put(third.getNumber(), third);
	}
	
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