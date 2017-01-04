package pizza.ordering;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userLanguage = new Scanner(System.in);
		boolean selectedLanguage = false;
		Order order = null;
		while (selectedLanguage == false) {
			System.out.println("Would you like to order in english, or spanish?");
			if (userLanguage.nextLine().equalsIgnoreCase("english")) {
				order = new EnglishOrder();
				selectedLanguage = true;
				userLanguage.close();
			} else if (userLanguage.nextLine().equalsIgnoreCase("SPANISH")) {
				order = new SpanishOrder();
				selectedLanguage = true;
				userLanguage.close();
			} else {
				System.out.println("That's not a valid language.");
			}
		}
		order.run();
	}
}

class Order {
	public void run(){
		
	}
	
}

class EnglishOrder extends Order {
	public void run() {
		boolean sizeSelected = false;
		String pizzaSize = "";

		List<String> toppingList = new ArrayList<String>();
		List<Boolean> wantTopping = new ArrayList<Boolean>();

		toppingList.add("Pepperoni");
		wantTopping.add(false);
		toppingList.add("Extra cheese");
		wantTopping.add(false);
		toppingList.add("Sausage");
		wantTopping.add(false);
		toppingList.add("Pineapple");
		wantTopping.add(false);
		toppingList.add("Ham");
		wantTopping.add(false);
		toppingList.add("Mushrooms");
		wantTopping.add(false);

		Scanner userInput = new Scanner(System.in);

		while (sizeSelected == false) {
			String pizzaSizeInput = userInput.nextLine();
			if (pizzaSizeInput.trim().equalsIgnoreCase("SMALL")) {
				pizzaSize = "small";
				sizeSelected = true;
			} else if (pizzaSizeInput.trim().equalsIgnoreCase("MEDIUM")) {
				pizzaSize = "medium";
				sizeSelected = true;
			} else if (pizzaSizeInput.trim().equalsIgnoreCase("LARGE")) {
				pizzaSize = "large";
				sizeSelected = true;
			} else {
				System.out.println("That is not a valid size, please choose small, medium or large.");
			}
		}

		for (int i = 0; i <= toppingList.size() - 1; i++) {
			boolean acceptableAnswer = false;
			String userResponse;
			while (acceptableAnswer == false) {
				System.out.println("Would you like " + toppingList.get(i) + "on your pizza?");
				userResponse = userInput.nextLine();
				if (userResponse.trim().equalsIgnoreCase("YES")) {
					wantTopping.set(i, true);
				} else if (userResponse.trim().equalsIgnoreCase("NO")) {
					
				} else {
					System.out.println("That's not a valid choice. Please answer yes or no.");
				}
			}
		}
		
		System.out.println("You have ordered a " + pizzaSize +" pizza.");
		System.out.println("It has the following topics:");
		for (int i = 0; i <= toppingList.size() - 1; i++) {
			if (wantTopping.get(i) == true) {
				System.out.println(toppingList.get(i));
			}
		}
		userInput.close();
	}
}

class SpanishOrder extends Order { //Strings need translation
	public void run() {
		boolean sizeSelected = false;
		String pizzaSize = "";

		List<String> toppingList = new ArrayList<String>();
		List<Boolean> wantTopping = new ArrayList<Boolean>();

		toppingList.add("Pepperoni");
		wantTopping.add(false);
		toppingList.add("Extra cheese");
		wantTopping.add(false);
		toppingList.add("Sausage");
		wantTopping.add(false);
		toppingList.add("Pineapple");
		wantTopping.add(false);
		toppingList.add("Ham");
		wantTopping.add(false);
		toppingList.add("Mushrooms");
		wantTopping.add(false);

		Scanner userInput = new Scanner(System.in);

		while (sizeSelected == false) {
			String pizzaSizeInput = userInput.nextLine();
			if (pizzaSizeInput.trim().equalsIgnoreCase("SMALL")) {
				pizzaSize = "small";
				sizeSelected = true;
			} else if (pizzaSizeInput.trim().equalsIgnoreCase("MEDIUM")) {
				pizzaSize = "medium";
				sizeSelected = true;
			} else if (pizzaSizeInput.trim().equalsIgnoreCase("LARGE")) {
				pizzaSize = "large";
				sizeSelected = true;
			} else {
				System.out.println("That is not a valid size, please choose small, medium or large.");
			}
		}

		for (int i = 0; i <= toppingList.size() - 1; i++) {
			boolean acceptableAnswer = false;
			String userResponse;
			while (acceptableAnswer == false) {
				System.out.println("Would you like " + toppingList.get(i) + "on your pizza?");
				userResponse = userInput.nextLine();
				if (userResponse.trim().equalsIgnoreCase("YES")) {
					wantTopping.set(i, true);
				} else if (userResponse.trim().equalsIgnoreCase("NO")) {
					
				} else {
					System.out.println("That's not a valid choice. Please answer yes or no.");
				}
			}
		}
		
		System.out.println("You have ordered a " + pizzaSize +" pizza.");
		System.out.println("It has the following topics:");
		for (int i = 0; i <= toppingList.size() - 1; i++) {
			if (wantTopping.get(i) == true) {
				System.out.println(toppingList.get(i));
			}
		}
		userInput.close();
	}
}