package flightsAndPlanes;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Optional;

public class AeroplaneCatalog {
	private static HashMap<String, Aeroplane> aeroplaneMap = new HashMap<String, Aeroplane>();
	
	

	public HashMap<String, Aeroplane> getAeroplaneCatalog() {
		return aeroplaneMap;
	}

	public static Aeroplane getFirstAvailableAeroplane() {
	Optional<Entry<String, Aeroplane>> optionalPlane = aeroplaneMap.entrySet().stream().filter(
			(entrySet) -> entrySet.getValue().isAeroplaneAvailable()).findFirst();
	Entry<String, Aeroplane> entry = optionalPlane.get();
	return entry.getValue();
	}

	public static Aeroplane getAeroplane(String aeroplaneModel) {
		return aeroplaneMap.get(aeroplaneModel);
	}
	
	public static void addAeroplane(Aeroplane aeroplane) {
		aeroplaneMap.put(aeroplane.getModel(), aeroplane);
	}
	public static void removeAeroplane(String aeroplaneModel) {
		aeroplaneMap.remove(aeroplaneModel);
		
	}
	@Override
	public String toString() {
		return "Available Planes: " + aeroplaneMap;
	}
	
}