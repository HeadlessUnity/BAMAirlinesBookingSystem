package flightsAndPlanes;

import java.util.HashMap;
import java.util.Optional;
import java.util.Map.Entry;

public  class Catalog<K, V> {
	public HashMap<K, V> map = new HashMap<K, V>();
	
	

	public HashMap<K, V> getflightCatalog() {
		return map;
	}
	public V getFirstAvailableObject() {
	Optional<Entry<K, V>> optionalPlane = map.entrySet().stream().filter(
			(entrySet) -> entrySet.getValue().isObjectAvailable()).findFirst();
	Entry<K, V> entry = optionalPlane.get();
	return entry.getValue();
	}
	
	public V getObject(int VNumber) {
		return map.get(VNumber);
	}
	
	public void addObject(V value) {
		map.put(value.getNumber(), value);		
	}
		
	public void removeObject(int oNumber) {
		map.remove(oNumber);
		
	}
	
	@Override
	public String toString() {
		return "AvailableOs: " + map;
	}
	
}

