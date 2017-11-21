package Food;
import java.math.BigDecimal;

public class Food {
	
	private String foodName;
	private BigDecimal foodPrice;
	
	
	Food(String foodName, double i) {
		this.foodName = foodName;
		this.foodPrice = new BigDecimal(i);
	}

	@Override
	public String toString() {
		return "Food [foodName=" + foodName + ", foodPrice=" + foodPrice + "]";
	}
	
	public BigDecimal getFoodPrice() {
		return foodPrice;
	}
	
	
}
