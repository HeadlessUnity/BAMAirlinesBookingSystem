package reservation;
import java.math.BigDecimal;

public class TheBamVault {
	private double totalIncome;
	private double totalProfit;
	
	public TheBamVault(double totalIncome) {
		super();
		this.totalIncome = totalIncome;
		
	}
	public double getTotalIncome() {
		return totalIncome;
	}
	public double getTotalProfit() {		
		return totalProfit;
	}
	public void printIncome(double totalincome) {
		System.out.println("The total income: "+ totalincome);
		}
	
	public void printProfit(double totalincome) {
		System.out.println("The total profit is: "+ totalincome*0.3);
	}
}
 