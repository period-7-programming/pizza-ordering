package pizza.ordering;

class SpanishOrder extends Order {
	
	public void run() {

		toppingList.add("Pepperoni");
		toppingList.add("Extra queso");
		toppingList.add("Salchicha");
		toppingList.add("Pineapple");
		toppingList.add("Jamón");
		toppingList.add("Seta");
		
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
	}
}