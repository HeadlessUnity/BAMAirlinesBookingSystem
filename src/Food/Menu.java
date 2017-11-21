package Food;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu {

	List<Food> firstClass=new ArrayList<Food>();
	List<Food> economyClass=new ArrayList<Food>();

	public Menu() {

		Food f1=new Food("Spagetti",149);
		Food f2=new Food("Pizza",300);
		Food f3=new Food("Kebab",249);
		Food f4=new Food("KöttBullar",199);
		Food f5=new Food("Pasta",99);
		firstClass.add(f1);
		firstClass.add(f2);
		firstClass.add(f3);
		firstClass.add(f4);
		firstClass.add(f5);

		Food f6=new Food("Spagetti",99);
		Food f7=new Food("Pizza",199);
		Food f8=new Food("Kebab",189);
		Food f9=new Food("KöttBullar",159);
		Food f10=new Food("Pasta",79);
		economyClass.add(f6);
		economyClass.add(f7);
		economyClass.add(f8);
		economyClass.add(f9);
		economyClass.add(f10);

	}
	
	public void printFirstFoodClassList() {
//      Creating method to print all the food for first class  
		int c=1;
		for (Iterator<Food> it = firstClass.iterator(); it.hasNext();) {
			Food food = (Food) it.next();
			System.out.println("["+c+"]    "+food.toString());
			c++;
		}

	}
	
	public void printEconomyFoodClassList() {
//      Creating method to print all the food for economy class
		int c=1;
		for (Iterator<Food> it1 = economyClass.iterator(); it1.hasNext();) {
			Food food = (Food) it1.next();
			System.out.println("["+c+"]    "+food.toString());
			c++;
		}

	}
	
	public BigDecimal getPriceForEconomyClassFoodItem(int x) {
//		Create methods to get the price of the item from economy class list
		Food food = null;
		Iterator<Food> it3 = economyClass.iterator();
		for (int i=0; it3.hasNext();i++) {
			if (x==i) {
				return food.getFoodPrice() ;
			}
			food = (Food) it3.next();
		}
		return null;
	}
	
	public BigDecimal getPriceForFirstClassFoodItem(int x) {
//		Create methods to get the price of the item from economy class list
		Food food = null;
		Iterator<Food> it4 = firstClass.iterator();
		for (int i=0; it4.hasNext();i++) {
			if (x==i) {
				return food.getFoodPrice() ;
			}
			food = (Food) it4.next();
		}
		return null;
	}
}
