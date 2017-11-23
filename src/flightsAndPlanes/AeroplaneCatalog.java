package flightsAndPlanes;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Optional;

public class AeroplaneCatalog<K,V> extends Catalog{
	private static HashMap<String, Aeroplane> aeroplaneMap = new HashMap<String, Aeroplane>();
	
	public AeroplaneCatalog() {
		
	}

	public Aeroplane getFirstAvailableObject() {
	Optional<Entry<String, Aeroplane>> optionalPlane = aeroplaneMap.entrySet().stream().filter(
			(entrySet) -> entrySet.getValue().isObjectAvailable()).findFirst();
	Entry<String, Aeroplane> entry = optionalPlane.get();
	return entry.getValue();
	}


	public void addObject(Aeroplane aeroplane) {
		aeroplaneMap.put(aeroplane.getModel(), aeroplane);
	}

	@Override
	public String toString() {
		return "Available Planes: " + aeroplaneMap;
	}
	
}