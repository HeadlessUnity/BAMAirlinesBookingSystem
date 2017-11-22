package flightsAndPlanes;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.HashMap;

public class Flight {
	private static int flightNumber;
	private int nrOfSeats = 10;
	private LocalDateTime takeOffDateTime;
	private String takeOffTerminal;
	private String takeoffCountry;
	private String takeOffGate;
	private String landingCountry;
	private LocalDateTime landingDateTime;
	private Aeroplane aeroplane;
	private boolean flightAvailableStatus;
	private HashMap<Integer, Boolean> seats = new HashMap<Integer, Boolean>();
	private double economyClassPrice = 5000.0;
	private double firstClassPrice = 20_000.0;

	public Flight(LocalDateTime takeOffDateTime, String takeOffTerminal, String takeoffCountry,
			String takeOffGate, String landingCountry,
			LocalDateTime landingDateTime) {

		flightNumber++;
		this.takeOffDateTime = takeOffDateTime;
		this.takeOffTerminal = takeOffTerminal;
		this.takeoffCountry = takeoffCountry;
		this.takeOffGate = takeOffGate;
		this.landingCountry = landingCountry;
		this.landingDateTime = landingDateTime;
		//This instantiates the seat field with 10 available seats.
		for(int i = 1; i <= nrOfSeats; i++) {
			seats.put(i, false);
		};
		this.aeroplane = AeroplaneCatalog.getFirstAvailableAeroplane();

	
	}
	//TODO availible seats
	//TODO classtype enum shit to make seat good.
	public Aeroplane getAeroplane() {
		return aeroplane;
	}

	public LocalDateTime getTakeOffDateTime() {
		return takeOffDateTime;
	}

	public void setTakeOffDateTime(LocalDateTime takeOffDateTime) {
		this.takeOffDateTime = takeOffDateTime;
	}

	public LocalDateTime getLandingDateTime() {
		return landingDateTime;
	}

	public void setLandingDateTime(LocalDateTime landingDateTime) {
		this.landingDateTime = landingDateTime;
	}
	public void printSeats() {
		seats.forEach((seatNumber, booked) -> System.out.println("Key : " + seatNumber + " Value : " + booked));
	}
	public HashMap<Integer, Boolean> getSeats() {
		return seats;
	}

	public double getEconomyClassPrice() {
		return economyClassPrice;
	}

	public double getFirstClassPrice() {
		return firstClassPrice;
	}

	public String getTakeOffTerminal() {
		return takeOffTerminal;
	}

	public String getTakeoffCountry() {
		return takeoffCountry;
	}

	public String getTakeOffGate() {
		return takeOffGate;
	}
	public String getLandingCountry() {
		return landingCountry;
	}
	public int getFlightNumber() {
		return flightNumber;
	}
	
	public boolean isFlightAvailable() {
		return flightAvailableStatus;
	}
	
	public void setFlightAvailableStatus(boolean flightAvailableStatus) {
		this.flightAvailableStatus = flightAvailableStatus;
	}
}
