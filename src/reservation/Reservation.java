package reservation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import flightsAndPlanes.Flight;
import flightsAndPlanes.FlightCatalog;
import food.Food;
import food.Menu;
import passenger.Passenger;
import passenger.PassengerList;

public class Reservation {

	private double totalPrice;
	private List<Food> foodOrder;
	private ReservationType reservationType;
	private PassengerList pL;
	private FlightCatalog flightCatalog;
	private Flight reservationFlight;
	
	
	public Reservation(FlightCatalog flightCatalog, PassengerList passengerList) {
		this.flightCatalog = flightCatalog;
		foodOrder = new ArrayList<Food>();
		pL = passengerList;
		
	}

	public PassengerList getpL() {
		return pL;
	}

	public void setpL(PassengerList pL) {
		this.pL = pL;
	}

	public FlightCatalog getFlightCatalog() {
		return flightCatalog;
	}
	public void setReservationFlight(int flightChoice) {
		reservationFlight = flightCatalog.map.get(flightChoice);
	}
	
	public Flight getReservationFlight() {
		return reservationFlight;
	}

	public void getBookedPassenger() {

	}
	public int getAvailableSeats(int seat) {
		return seat;
	}

	public void createPassenger( String firstName, String lastName, int passPortId) {
		Passenger passenger = new Passenger(firstName,lastName,passPortId);
		pL.addPassenger(passenger);
		//pL.printPassengerList();
	}

	public  double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public void createFoodOrder(ReservationType rT,int foodIndex) {

		Menu m=new Menu();
		m.addToFoodOrder(rT, foodIndex, foodOrder);
	}
	public StringBuilder printFoodOrder() {
		Food food = null;
		StringBuilder foodList = new StringBuilder();
		for (Iterator iterator = foodOrder.iterator(); iterator.hasNext();) {
			food = (Food) iterator.next();
			foodList.append(food.toString() + "\t");
		}
		return foodList;
	}

	public ReservationType getReservationType() {
		return reservationType;
	}

	public double printFoodOrderPrice() {
		double totalFoodPriceReservation=0;
		for (Iterator<Food> iterator = foodOrder.iterator(); iterator.hasNext();) {
			Food food = (Food) iterator.next();
			double i= food.getFoodPrice();
			totalFoodPriceReservation=totalFoodPriceReservation+i;
		}
		//System.out.println(totalFoodPriceReservation);
		totalPrice = totalPrice + totalFoodPriceReservation;
		return totalPrice;
	}
	public void choiceResrvationType(int rservationType) {
		if (rservationType==1) {
			reservationType= ReservationType.FIRST_CLASS;
			totalPrice=20000;
		} else if (rservationType==2){
			reservationType=ReservationType.ECONOMY_CLASS;
			totalPrice=5000;
		}
	}	
}