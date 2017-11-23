package food;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import reservation.ReservationType;

public class Menu {
	//	Creating two array list with type "Food"   

	List<Food> firstClass=new ArrayList<Food>();
	List<Food> economyClass=new ArrayList<Food>();

	public Menu() {
		//		Adding some food To the first class and economy class

		Food f1=new Food("Spagetti  ",149);
		Food f2=new Food("Pizza     ",300);
		Food f3=new Food("Kebab     ",249);
		Food f4=new Food("KöttBullar",199);
		Food f5=new Food("Pasta      ",99);
		firstClass.add(f1);
		firstClass.add(f2);
		firstClass.add(f3);
		firstClass.add(f4);
		firstClass.add(f5);

		Food f6=new Food("Spagetti   ",99);
		Food f7=new Food("Pizza     ",199);
		Food f8=new Food("Kebab     ",189);
		Food f9=new Food("KöttBullar",159);
		Food f10=new Food("Pasta      ",79);
		economyClass.add(f6);
		economyClass.add(f7);
		economyClass.add(f8);
		economyClass.add(f9);
		economyClass.add(f10);

	}

	public void printFoodList(ReservationType rT) {
		//      Creating method to print all the food for first class  
		int c = 1;
		List<Food> list = null;
		if (rT == ReservationType.FIRST_CLASS) {
			list = firstClass;
		}else if (rT== ReservationType.ECONOMY_CLASS){
			list = economyClass;
		}
		System.out.println("Number       Dish           Price");
		System.out.println("------       ----           -----");
		for (Iterator<Food> it = list.iterator(); it.hasNext();) {
			Food food = (Food) it.next();
			System.out.println("["+c+"]          "+ food.toString());
			c++;
		}

	}


	public double getPriceForFoodItem(ReservationType rT,int foodIndex) {
		//		Create methods to get the price of the item from  class list
		Food food = null;
		List<Food> list = null;
		Iterator<Food> it1 = list.iterator();
		if (rT == ReservationType.FIRST_CLASS) {
			list = firstClass;
		} else if (rT == ReservationType.ECONOMY_CLASS){
			list = economyClass;
		}
		for (int i=0; it1.hasNext();i++) {
			if (foodIndex==i) {
				return food.getFoodPrice() ;
			}
			food = (Food) it1.next();
		}
		return 0;
	}

	public void addToFoodOrder(ReservationType rT, int foodIndex, List<Food> foodOrder) {
		Food food = null;
		int i=foodIndex-1;
		if (rT == ReservationType.FIRST_CLASS) {
			food=firstClass.get(i);
			foodOrder.add(food);
		}else if (rT== ReservationType.ECONOMY_CLASS){
			food=economyClass.get(i);
			foodOrder.add(food);
		}
		
	}
	
	

}
