package pizza.ordering;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class FrenchOrder extends Order {
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
	}
}