package flightsAndPlanes;

public class Aeroplane {
	private static int planeNumber;
	private String airline;
	private String model;
	private boolean  aeroplaneAvailableStatus;
	
	
	public Aeroplane(String model) {
		planeNumber++;
		this.model = model;
		this.aeroplaneAvailableStatus = true;
	}
	

	public static int getPlaneNumber() {
		return planeNumber;
	}

	public String getAirline() {
		return airline;
	}

	public String getModel() {
		return model;
	}

	public boolean isAeroplaneAvailable() {
		return aeroplaneAvailableStatus;
	}
	
	public void setAeroplaneAvailableStatus(boolean aeroplaneAvailableStatus) {
		this.aeroplaneAvailableStatus = aeroplaneAvailableStatus;
	}
	
}
