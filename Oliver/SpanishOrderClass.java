package pizza.ordering;

class SpanishOrder extends Order {
	
	public void run() {

		toppingList.add("Pepperoni");
		toppingList.add("Extra queso");
		toppingList.add("Salchicha");
		toppingList.add("Pineapple");
		toppingList.add("Jam�n");
		toppingList.add("Seta");
		
		System.out.println("�Hola, cu�l es su nombre?");
		name = userInput.nextLine();
		System.out.println("�D�nde vives, " + name + "?");
		address = userInput.nextLine();
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
		System.out.println("Tiene los siguientes temas:");
		for (int i = 0; i <= toppingList.size() - 1; i++) {
			if (wantTopping.get(i) == true) {
				System.out.println(toppingList.get(i));
			}
		}
		System.out.println("La pizza ser� enviada a " + address + ".");
	}
}