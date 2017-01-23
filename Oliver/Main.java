package pizza.ordering;

// polymorphism is something being more than one thing at a time, for example a car being red and fast

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
	
	static List<Object> orderList = new ArrayList<Object>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method
		Scanner userLanguage = new Scanner(System.in);
		boolean ordering = false;
		while (ordering == false) {
			System.out.println("Welcome! Would you like to order in english, french, or spanish? Type !quit to quit. Type !view to view placed orders.");
			String input = userLanguage.nextLine(); 
			if (input.equalsIgnoreCase("english")) {
				orderList.add(new EnglishOrder());
				EnglishOrder order = (EnglishOrder) orderList.get(orderList.size()-1);
				order.run();
			} else if (input.equalsIgnoreCase("SPANISH")) {
				orderList.add(new EnglishOrder());
				SpanishOrder order = (SpanishOrder) orderList.get(orderList.size()-1);
				order.run();
			} else if (input.equalsIgnoreCase("FRENCH")) {
				orderList.add(new EnglishOrder());
				FrenchOrder order = (FrenchOrder) orderList.get(orderList.size()-1);
				order.run();
			} else if (input.equalsIgnoreCase("!quit")){
				ordering = false;
			} else if (input.equalsIgnoreCase("!view")){
				boolean valid = false;
				int orderView=0;
				while (valid == false) {
					System.out.println("There are " + orderList.size() + " orders. Which number would you like to view?");
					orderView = Integer.parseInt(userLanguage.nextLine());
					if (orderView <= orderList.size()){
						valid = true;
					}
				}
				if (orderList.get(orderView-1) instanceof EnglishOrder){
					EnglishOrder viewing = (EnglishOrder) orderList.get(orderView-1); 
					System.out.println("Language: English");
					System.out.println("Size: " + viewing.pizzaSize);
					System.out.println("Name of orderer: " + viewing.name);
					System.out.println("Toppings:");
					for (int i = 0; i <= viewing.toppingList.size() - 1; i++) {
						if (viewing.wantTopping.get(i) == true) {
							System.out.println(viewing.toppingList.get(i));
						}
					}
					System.out.println("Address for delivery:" + viewing.address);
				} else if (orderList.get(orderView-1) instanceof SpanishOrder) {
					SpanishOrder viewing = (SpanishOrder) orderList.get(orderView-1); 
					System.out.println("Language: English");
					System.out.println("Size: " + viewing.pizzaSize);
					System.out.println("Name of orderer: " + viewing.name);
					System.out.println("Toppings:");
					for (int i = 0; i <= viewing.toppingList.size() - 1; i++) {
						if (viewing.wantTopping.get(i) == true) {
							System.out.println(viewing.toppingList.get(i));
						}
					}
					System.out.println("Address for delivery:" + viewing.address);
				} else {
					FrenchOrder viewing = (FrenchOrder) orderList.get(orderView-1); 
					System.out.println("Language: English");
					System.out.println("Size: " + viewing.pizzaSize);
					System.out.println("Name of orderer: " + viewing.name);
					System.out.println("Toppings:");
					for (int i = 0; i <= viewing.toppingList.size() - 1; i++) {
						if (viewing.wantTopping.get(i) == true) {
							System.out.println(viewing.toppingList.get(i));
						}
					}
					System.out.println("Address for delivery: " + viewing.address);
				}
			} else {
				System.out.println("That's not a valid option.");
			}
		}
		userLanguage.close();
		System.exit(0);
	}
}