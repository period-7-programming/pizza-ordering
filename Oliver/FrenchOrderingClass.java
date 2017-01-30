package pizza.ordering;

class FrenchOrder extends Order {
	public void run() {
		
		toppingList.add("De pepperoni");
		toppingList.add("plus de fromage");
		toppingList.add("De la saucisse");
		toppingList.add("De l'ananas");
		toppingList.add("De jambon");
		toppingList.add("Des champions");
		
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