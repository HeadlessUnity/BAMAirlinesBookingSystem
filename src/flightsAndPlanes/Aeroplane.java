package flightsAndPlanes;

public class Aeroplane {
	private static int planeNumber;
	private String airline;
	private String model;
	private boolean  airplaneAvailableStatus;
	
	
	public Aeroplane(String model) {
		planeNumber++;
		this.model = model;
		this.airplaneAvailableStatus = true;
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

	public boolean isAirplaneAvailable() {
		return airplaneAvailableStatus;
	}
	
	public void setAirplaneAvailableStatus(boolean airplaneAvailableStatus) {
		this.airplaneAvailableStatus = airplaneAvailableStatus;
	}
	


}
