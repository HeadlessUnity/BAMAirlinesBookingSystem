package flightsAndPlanes;

public class Aeroplane {
	private static int counter;
	private int planeNumber;
	private String airline;
	private String model;
	private boolean  aeroplaneAvailableStatus;
	
	
	public Aeroplane(String model) {
		planeNumber = ++counter;
		this.model = model;
		this.aeroplaneAvailableStatus = true;
	}
	

	public int getNumber() {
		return planeNumber;
	}

	public String getAirline() {
		return airline;
	}

	public String getModel() {
		return model;
	}

	public boolean isObjectAvailable() {
		return aeroplaneAvailableStatus;
	}
	
	public void setAeroplaneAvailableStatus(boolean aeroplaneAvailableStatus) {
		this.aeroplaneAvailableStatus = aeroplaneAvailableStatus;
	}
	
}
