package pizza.ordering;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class EnglishOrder extends Order {
	public String pizzaSize;
	public String name;
	public String address;
	public List<Boolean> wantTopping = new ArrayList<Boolean>();
	public List<String> toppingList = new ArrayList<String>();
	public void run() {
		name  = "";
		address = "";
		boolean sizeSelected = false;
		pizzaSize = "";

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
		System.out.println("Hello, what is your name?");
		name = userInput.nextLine();
		System.out.println("Where do you live, " + name + "?");
		address = userInput.nextLine();
		System.out.println("What size pizza would you like?");
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
				System.out.println("Would you like " + toppingList.get(i) + " on your pizza?");
				userResponse = userInput.nextLine();
				if (userResponse.trim().equalsIgnoreCase("YES")) {
					wantTopping.set(i, true);
					acceptableAnswer = true;
				} else if (userResponse.trim().equalsIgnoreCase("NO")) {
					acceptableAnswer
					= true;
				} else {
					System.out.println("That's not a valid choice. Please answer yes or no.");
				}
			}
		}

		System.out.println("You have ordered a " + pizzaSize +" pizza.");
		System.out.println("It has the following toppings:");
		for (int i = 0; i <= toppingList.size() - 1; i++) {
			if (wantTopping.get(i) == true) {
				System.out.println(toppingList.get(i));
			}
		}
		System.out.println("The pizza will be sent to " + address + ".");
	}
}