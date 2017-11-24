package flightsAndPlanes;

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
			LocalDateTime landingDateTime, AeroplaneCatalog aeroplaneCatalog) {

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
		this.aeroplane =  (Aeroplane) aeroplaneCatalog.getFirstAvailableAeroplane();
		this.aeroplane.setAeroplaneAvailableStatus(false);

	}

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
	public StringBuilder getSeatsToString() {
		StringBuilder stringSeats = new StringBuilder();
		seats.forEach((seatNumber, booked) -> {
			if(seatNumber % 2 != 0) {
				stringSeats.append("(" + seatNumber + ") |");
				if(booked == false) stringSeats.append("O");
				else if (booked == true)  stringSeats.append("X");

			} else if(seatNumber % 2 == 0) {
				if(booked == false) stringSeats.append("\tO");
				else if (booked == true)  stringSeats.append("\tX");
				stringSeats.append("|" + "(" + seatNumber + ")\n");
			};
		});
		return stringSeats;
	}

	public void setSeatToBooked(int seatNumber) {
		seats.put(seatNumber, true);
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
	public int getNumber() {
		return flightNumber;
	}

	public boolean isObjectAvailable() {
		return flightAvailableStatus;
	}

	public void setFlightAvailableStatus(boolean flightAvailableStatus) {
		this.flightAvailableStatus = flightAvailableStatus;
	}
}
