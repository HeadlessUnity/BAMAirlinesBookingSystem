package flightsAndPlanes;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.HashMap;

public class Flight {
	private static int flightNumber;
	private LocalDateTime takeOffDateTime;
	private String takeOffTerminal;
	private String takeoffCountry;
	private String takeOffGate;
	private String landingCountry;
	private LocalDateTime landingDateTime;
	private Aeroplane plane;
	private HashMap<Integer, Boolean> seats = new HashMap<Integer, Boolean>();
	private BigDecimal economyClassPrice = new BigDecimal(5000);
	private BigDecimal firstClassPrice = new BigDecimal(20_000);

	public Flight(LocalDateTime takeOffDateTime, String takeOffTerminal, String takeoffCountry,
			String takeOffGate, String landingCountry,
			LocalDateTime landingDateTime, String planeModel) {

		flightNumber++;
		this.takeOffDateTime = takeOffDateTime;
		this.takeOffTerminal = takeOffTerminal;
		this.takeoffCountry = takeoffCountry;
		this.takeOffGate = takeOffGate;
		this.landingCountry = landingCountry;
		this.landingDateTime = landingDateTime;
		//This instantiates the seat field with 10 available seats.
		for(int i = 1; i <= 10; i++) {
			seats.put(i, false);
		};
		
		this.plane = new Aeroplane(planeModel);
	
	}
	
	public Aeroplane getAeroplane() {
		return plane;
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

	public BigDecimal getEconomyClassPrice() {
		return economyClassPrice;
	}

	public BigDecimal getFirstClassPrice() {
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

}
