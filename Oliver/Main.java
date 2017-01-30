package pizza.ordering;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
	static List<Object> orderList = new ArrayList<Object>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method
		Scanner userLanguage = new Scanner(System.in);
		boolean ordering = true;
		while (ordering == true) {
			System.out.println("Welcome! Would you like to order in english, french, or spanish? Type Quit to quit. Type View to view placed orders.");
			String input = userLanguage.nextLine(); 
			if (input.equalsIgnoreCase("english")) {
				orderList.add(new EnglishOrder());
				EnglishOrder order = (EnglishOrder) orderList.get(orderList.size()-1);
				order.run();
			} else if (input.equalsIgnoreCase("SPANISH")) {
				orderList.add(new SpanishOrder());
				SpanishOrder order = (SpanishOrder) orderList.get(orderList.size()-1);
				order.run();
			} else if (input.equalsIgnoreCase("FRENCH")) {
				orderList.add(new FrenchOrder());
				FrenchOrder order = (FrenchOrder) orderList.get(orderList.size()-1);
				order.run();
			} else if (input.equalsIgnoreCase("quit")){
				ordering = false;
			} else if (input.equalsIgnoreCase("view")){
				boolean valid = false;
				int orderView=0;
				while (valid == false) {
					System.out.println("Would you like to view the orders or search for one? Type back to go back.");
					String response = userLanguage.nextLine();
					if (response.equalsIgnoreCase("view")) {
						System.out.println("There are " + orderList.size() + " orders. Which number would you like to view?");
						orderView = Integer.parseInt(userLanguage.nextLine());
						if (orderView <= orderList.size()){
							valid = true;
							Order viewing = null;
							String language = "";
							if (orderList.get(orderView-1) instanceof EnglishOrder){
								viewing = (EnglishOrder) orderList.get(orderView-1);
								language = "English";
							} else if (orderList.get(orderView-1) instanceof SpanishOrder) {
								viewing = (SpanishOrder) orderList.get(orderView-1); 
								language = "Spanish";
							} else {
								viewing = (FrenchOrder) orderList.get(orderView-1); 
								language = "French";
							}
							System.out.println("Language: " + language);
							System.out.println("Size: " + viewing.pizzaSize);
							System.out.println("Name of orderer: " + viewing.name);
							System.out.println("Toppings:");
							for (int i = 0; i <= viewing.toppingList.size() - 1; i++) {
								if (viewing.wantTopping.get(i) == true) {
									System.out.println(viewing.toppingList.get(i));
								}
							}
							System.out.println("Address for delivery: " + viewing.address);
						} else {
							System.out.println("That order does not exist.");
						}
					} else if (response.equalsIgnoreCase("search")) {
						System.out.println("What name do you want to search for?");
						String nameSearch = userLanguage.nextLine();
						boolean found = false;
						for (int i = 1; i <= orderList.size(); i++) {
							Order viewing = null;
							String language = "";
							if (orderList.get(i-1) instanceof EnglishOrder) {
								viewing = (EnglishOrder) orderList.get(i-1);
								language = "English";
							} else if (orderList.get(orderView-1) instanceof SpanishOrder) {
								viewing = (SpanishOrder) orderList.get(orderView-1);	
								language = "Spanish";
							} else {
								viewing = (FrenchOrder) orderList.get(orderView-1);
								language = "French";
							}
							if (nameSearch.equalsIgnoreCase(viewing.name)) {
								System.out.println("Order found!");
								found = true;
								System.out.println("Language: " + language);
								System.out.println("Size: " + viewing.pizzaSize);
								System.out.println("Name of orderer: " + viewing.name);
								System.out.println("Toppings:");
								for (int e = 0; e <= viewing.toppingList.size() - 1; e++) {
									if (viewing.wantTopping.get(e) == true) {
										System.out.println(viewing.toppingList.get(e));
									}
								}
							}
						}
						if (found == false) {
							System.out.println("No order matching the name found.");
						}
						valid = true;
					} else if (response.equalsIgnoreCase("Back")) {
						valid = true;
					} else {
						System.out.println("That is not a valid option. Please answer 'View' or 'Search'.");
					}
				}
			} else {
				System.out.println("That's not a valid option.");
			}
		}
		userLanguage.close();
		System.exit(0);
	}
}