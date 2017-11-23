package reservation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import food.Food;
import food.Menu;
import passenger.Passenger;
import passenger.PassengerList;

public class Reservation {

	private double totalPrice;
	private double totalFoodPriceReservation;
	List<Food> foodOrder=new ArrayList<Food>();
	private PassengerList p =new PassengerList();


	public void getBookedPassenger() {

	}
	public int getAvailableSeats(int seat) {
		return seat;
	}
	public void createPassenger( String firstName, String lastName, int passPortId) {
		Passenger passenger = new Passenger(firstName,lastName,passPortId);
		p.addPassenger(passenger);
		p.printPassengerList();
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
	public void printFoodOrder() {
		Food food;
		for (Iterator iterator = foodOrder.iterator(); iterator.hasNext();) {
			food = (Food) iterator.next();
			System.out.println(food);
		}
	}

	
	public Reservation() {
		this.totalFoodPriceReservation =0;
	}



}

