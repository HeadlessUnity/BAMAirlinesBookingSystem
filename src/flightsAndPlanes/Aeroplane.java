package flightsAndPlanes;

public class Aeroplane {
	private static int planeNumber;
	private String airline;
	private String model;
	private boolean  airplaneWorkingStatus;
	
	
	public Aeroplane(String model) {
		planeNumber++;
		this.model = model;
		this.airplaneWorkingStatus = true;
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

	public boolean isAirplaneWorkingStatus() {
		return airplaneWorkingStatus;
	}


	public boolean isAirplaneWorking() {
		return airplaneWorkingStatus;
	}
	
	public void setAirplaneWorkingStatus(boolean airplaneWorkingStatus) {
		this.airplaneWorkingStatus = airplaneWorkingStatus;
	}
	
}
