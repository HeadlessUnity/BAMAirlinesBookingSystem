package reservation;

import food.Menu;

public class Reservation {

	private double totalPrice;
	private double reservationFoodPrice;



	public void getBookedPassenger() {

	}
	public int getAvailableSeats(int seat) {
		return seat;
	}
	public void createPassenger( String f, String l, String p) {

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
