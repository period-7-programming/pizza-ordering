package pizza.ordering;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
	static List<Object> a = new ArrayList<Object>();

	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);

		boolean loop = true;
		boolean lang = false; // false = English, true = German

		System.out.println("English, Deutsch");
		String g = i.nextLine();

		if (g.equalsIgnoreCase("english")) {
			lang = false;
		} else {
			lang = true;
		}

		while (loop) {

			if (!lang) {
				System.out.println("To order a pizza type, English. To display all orders type, Display english");
				g = i.nextLine();
				if (g.equalsIgnoreCase("display")) {
					if (a.size() == 0) {
						System.out.println("You haven't ordered anything yet");
					} else {
						System.out.println("Displaying orders");
						System.out.println();
						for (int f = 0; f < a.size(); f++) {
							English r = (English) a.get(f);
							System.out.println("Order " + (f + 1));
							System.out.println("Size " + r.size);
							System.out.println("Toppings " + r.toppings);
							System.out.println("Crust " + r.thickness);
							System.out.println("");
						}
					}
				} else if (g.equalsIgnoreCase("english")) {
					a.add(new English());
					English b = (English) a.get(a.size() - 1);
					b.run();
				} else {
					System.out.println("Invalid command");
				}

			}

			if (lang) {
				System.out
						.println("Einen Pizzattyp bestellen, deutsch. Um alle Aufträge anzuzeigen, wählen Sie Deutsch");
				g = i.nextLine();
				if (g.equalsIgnoreCase("display")) {
					if (a.size() == 0){
						System.out.println("Sie haben noch nichts bestellt");
					} else {
					System.out.println("Aufträge anzeigen");
					System.out.println();
					for (int f = 0; f < a.size(); f++) {
						German r = (German) a.get(f);
						System.out.println("Order " + (f + 1));
						System.out.println("Größe " + r.size);
						System.out.println("Belägen " + r.toppings);
						System.out.println("Kruste " + r.thickness);
						System.out.println("");
					}
				}
				} else if (g.equalsIgnoreCase("deustch")) {
					a.add(new German());
					German b = (German) a.get(a.size() - 1);
					b.run();
				} else {
					System.out.println("Ungültiger Befehl");
				}
			}

			if (g.equalsIgnoreCase("exit") || g.equalsIgnoreCase("ausfahrt")) {
				loop = false;
			}
			g = null;

		}

		i.close();

	}}