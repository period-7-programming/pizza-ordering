package pizza.ordering;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Scanner userLanguage = new Scanner(System.in);
		boolean selectedLanguage = false;
		Order order = null;
        // COMMENT: Include a phrase that will exit the program. Often !quit or :quit is used.
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
        // COMMENT: You should close this before you run the 'order', as you are done with it and order runs large amounts of code
        // before this line.
		userLanguage.close();
	}
}

// COMMENT: Move repetitive code into this class.
class Order {
	public void run(){
		
	}
}

class EnglishOrder extends Order {
	public void run() {
		String name  = "";
		String address = "";
		boolean sizeSelected = false;
        // COMMENT: An enum would probably be appropriate for this data type.
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
        // COMMENT: Always close resources like scanners after you are done using it.
		userInput.close();
	}
}

class SpanishOrder extends Order {
	public void run() {
		boolean sizeSelected = false;
		String pizzaSize = "";
		String name  = "";
		String address = "";
		
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
		toppingList.add("Jamón");
		wantTopping.add(false);
		toppingList.add("Seta");
		wantTopping.add(false);
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("¿Hola, cuál es su nombre?");
		name = userInput.nextLine();
		System.out.println("¿Dónde vives, " + name + "?");
		address = userInput.nextLine();
		System.out.println("¿Qué tamaño de pizza le gustaría?");
		while (sizeSelected == false) {
			String pizzaSizeInput = userInput.nextLine();
			if (pizzaSizeInput.trim().equalsIgnoreCase("pequeña")) {
				pizzaSize = "pequeña";
				sizeSelected = true;
			} else if (pizzaSizeInput.trim().equalsIgnoreCase("medio")) {
				pizzaSize = "medio";
				sizeSelected = true;
			} else if (pizzaSizeInput.trim().equalsIgnoreCase("grande")) {
				pizzaSize = "grande";
				sizeSelected = true;
			} else {
				System.out.println("Ése no es un tamaño válido, elige por favor pequeño, mediano o grande.");
			}
		}

		for (int i = 0; i <= toppingList.size() - 1; i++) {
			boolean acceptableAnswer = false;
			String userResponse;
			while (acceptableAnswer == false) {
				System.out.println("¿Te gustaría " + toppingList.get(i) + " en tu pizza?");
				userResponse = userInput.nextLine();
				if (userResponse.trim().equalsIgnoreCase("si") || userResponse.trim().equalsIgnoreCase("sí")) {
					wantTopping.set(i, true);
					acceptableAnswer = true;
				} else if (userResponse.trim().equalsIgnoreCase("NO")) {
					acceptableAnswer = true;
				} else {
					System.out.println("Eso no es una opción válida. Por favor conteste sí o no.");
				}
			}
		}
		
		System.out.println("Has pedido una pizza " + pizzaSize + ".");
		System.out.println("Tiene los siguientes temas:");
		for (int i = 0; i <= toppingList.size() - 1; i++) {
			if (wantTopping.get(i) == true) {
				System.out.println(toppingList.get(i));
			}
		}
		System.out.println("La pizza será enviada a " + address + ".");
		userInput.close();
	}
}

class FrenchOrder extends Order {
	public void run() {
		boolean sizeSelected = false;
		String pizzaSize = "";
		String name  = "";
		String address = "";
		
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
		System.out.println("Salut, comment tu t'appelles?");
		name = userInput.nextLine();
		System.out.println("Où habite tu, " + name + "?");
		address = userInput.nextLine();
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
				System.out.println("Ce n'est pas une taille valide, s'il vous plaît choisir petit, moyen ou grand.");
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
					System.out.println("Ce n'est pas un choix valide. Veuillez répondre oui ou non.");
				}
			}
		}
		System.out.println("Vous avez commandé une pizza " + pizzaSize + ".");
		System.out.println("Il a les garnitures suivantes:");
		for (int i = 0; i <= toppingList.size() - 1; i++) {
			if (wantTopping.get(i) == true) {
				System.out.println(toppingList.get(i));
			}
		}
		System.out.println("La pizza sera envoyée à " + address + ".");
		userInput.close();
	}
}
