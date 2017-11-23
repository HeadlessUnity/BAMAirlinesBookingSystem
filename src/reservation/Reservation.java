package reservation;

import passenger.Passenger;
import passenger.PassengerList;

public class Reservation {

	private double totalPrice;
	private double reservationFoodPrice;
	private PassengerList p =new PassengerList();

	public void getBookedPassenger() {

	}
	public int getAvailableSeats(int seat) {
		return seat;
	}
	public void createPassenger( String firstName, String lastName, String passPortId) {
		Passenger passenger = new Passenger(firstName,lastName,passPortId);
		p.addPassenger(passenger);
		p.displayPassengerList();
	}
	public  double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public void createFoodOrder(ReservationType rT,int foodIndex) {
		Menu m=new Menu();
		m.printFoodList(rT);
		reservationFoodPrice= m.getPriceForFoodItem(rT,foodIndex)+ reservationFoodPrice;
		}
	
	
	public Reservation() {}



}
