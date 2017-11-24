package food;
import java.math.BigDecimal;

public class Food {
	
	private String foodName;
	private double foodPrice;
	
	
	Food(String foodName, double foodPrice) {
		this.foodName = foodName;
		this.foodPrice = foodPrice;
	}

	@Override
	public String toString() {
		return foodName +"     " +foodPrice;
	}
	
	public double getFoodPrice() {
		return foodPrice;
	}

	public String getFoodName() {
		return foodName;
	}
	
	
}
