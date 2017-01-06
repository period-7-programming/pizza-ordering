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
			System.out.println("Would you like to order in english, french, or spanish?");
			String input = userLanguage.nextLine(); 
			if (input.equalsIgnoreCase("english")) {
				order = new EnglishOrder();
				selectedLanguage = true;
			} else if (input.equalsIgnoreCase("SPANISH")) {
				order = new SpanishOrder();
				selectedLanguage = true;
			} else if (input.equalsIgnoreCase("FRENCH")) {
				order = new FrenchOrder();
				selectedLanguage = true;
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
					acceptableAnswer = true;
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
		userInput.close();
	}
}

class SpanishOrder extends Order {
	public void run() {
		boolean sizeSelected = false;
		String pizzaSize = "";

		List<String> toppingList = new ArrayList<String>();
		List<Boolean> wantTopping = new ArrayList<Boolean>();

		toppingList.add("Pepperoni");
		wantTopping.add(false);
		toppingList.add("Extra queso");
		wantTopping.add(false);
		toppingList.add("Salchicha");
		wantTopping.add(false);
		toppingList.add("Pineapple");
		wantTopping.add(false);
		toppingList.add("Jam�n");
		wantTopping.add(false);
		toppingList.add("Seta");
		wantTopping.add(false);

		Scanner userInput = new Scanner(System.in);
		System.out.println("�Qu� tama�o de pizza le gustar�a?");
		while (sizeSelected == false) {
			String pizzaSizeInput = userInput.nextLine();
			if (pizzaSizeInput.trim().equalsIgnoreCase("peque�a")) {
				pizzaSize = "peque�a";
				sizeSelected = true;
			} else if (pizzaSizeInput.trim().equalsIgnoreCase("medio")) {
				pizzaSize = "medio";
				sizeSelected = true;
			} else if (pizzaSizeInput.trim().equalsIgnoreCase("grande")) {
				pizzaSize = "grande";
				sizeSelected = true;
			} else {
				System.out.println("�se no es un tama�o v�lido, elige por favor peque�o, mediano o grande.");
			}
		}

		for (int i = 0; i <= toppingList.size() - 1; i++) {
			boolean acceptableAnswer = false;
			String userResponse;
			while (acceptableAnswer == false) {
				System.out.println("�Te gustar�a " + toppingList.get(i) + " en tu pizza?");
				userResponse = userInput.nextLine();
				if (userResponse.trim().equalsIgnoreCase("si") || userResponse.trim().equalsIgnoreCase("s�")) {
					wantTopping.set(i, true);
					acceptableAnswer = true;
				} else if (userResponse.trim().equalsIgnoreCase("NO")) {
					acceptableAnswer = true;
				} else {
					System.out.println("Eso no es una opci�n v�lida. Por favor conteste s� o no.");
				}
			}
		}
		
		System.out.println("Has pedido una pizza " + pizzaSize + ".");
		System.out.println("It has the following topics:");
		for (int i = 0; i <= toppingList.size() - 1; i++) {
			if (wantTopping.get(i) == true) {
				System.out.println(toppingList.get(i));
			}
		}
		userInput.close();
	}
}

class FrenchOrder extends Order {
	public void run() {
		boolean sizeSelected = false;
		String pizzaSize = "";

		List<String> toppingList = new ArrayList<String>();
		List<Boolean> wantTopping = new ArrayList<Boolean>();

		toppingList.add("De pepperoni");
		wantTopping.add(false);
		toppingList.add("plus de fromage");
		wantTopping.add(false);
		toppingList.add("De la saucisse");
		wantTopping.add(false);
		toppingList.add("De l'ananas");
		wantTopping.add(false);
		toppingList.add("De jambon");
		wantTopping.add(false);
		toppingList.add("Des champions");
		wantTopping.add(false);

		Scanner userInput = new Scanner(System.in);
		System.out.println("Quelle taille de pizza aimeriez-vous?");
		while (sizeSelected == false) {
			String pizzaSizeInput = userInput.nextLine();
			if (pizzaSizeInput.trim().equalsIgnoreCase("petit")) {
				pizzaSize = "petit";
				sizeSelected = true;
			} else if (pizzaSizeInput.trim().equalsIgnoreCase("moyen")) {
				pizzaSize = "moyen";
				sizeSelected = true;
			} else if (pizzaSizeInput.trim().equalsIgnoreCase("grand")) {
				pizzaSize = "grand";
				sizeSelected = true;
			} else {
				System.out.println("Ce n'est pas une taille valide, s'il vous pla�t choisir petit, moyen ou grand.");
			}
		}

		for (int i = 0; i <= toppingList.size() - 1; i++) {
			boolean acceptableAnswer = false;
			String userResponse;
			while (acceptableAnswer == false) {
				System.out.println("Voulez-vous le " + toppingList.get(i) + " sur votre pizza?");
				userResponse = userInput.nextLine();
				if (userResponse.trim().equalsIgnoreCase("oui")) {
					wantTopping.set(i, true);
					acceptableAnswer = true;
				} else if (userResponse.trim().equalsIgnoreCase("non")) {
					acceptableAnswer = true;
				} else {
					System.out.println("Ce n'est pas un choix valide. Veuillez r�pondre oui ou non.");
				}
			}
		}
		System.out.println("Vous avez command� une pizza " + pizzaSize + ".");
		System.out.println("Il a les garnitures suivantes:");
		for (int i = 0; i <= toppingList.size() - 1; i++) {
			if (wantTopping.get(i) == true) {
				System.out.println(toppingList.get(i));
			}
		}
		userInput.close();
	}
}