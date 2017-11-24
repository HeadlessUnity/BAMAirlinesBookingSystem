package flightsAndPlanes;

import java.util.HashMap;

public class Catalog<K, V> {
	public HashMap<K, V> map = new HashMap<K, V>();
	
	public HashMap<K, V> getCatalog() {
		return map;
	}
	
	public V getObject(int VNumber) {
		return map.get(VNumber);
	}
	
	public void addObject(K key , V value) {
		map.put(key, value);
	}
		
	public void removeObject(int oNumber) {
		map.remove(oNumber);
		
	}

}

