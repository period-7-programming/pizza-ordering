package pizza.ordering;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Order {

	String t1 = "To order a pizza type, New. To display all orders type, Display",
			t2 = "To search for an order type, press enter then type what order you want";
	String q1 = "search", q2 = "display", q3 = "new";
	String r1 = "Name ", r2 = "Size ", r3 = "Toppings ", r4 = "Crust ";
	String e1 = "You haven't ordered anything yet", e2 = "Displaying orders", e3 = "Invalid command";

	public boolean loop = true;
	public String g;
	static List<Object> a = new ArrayList<Object>();

	public Order(//add boolean here){
		
	}
	
	void run() {
		Scanner i = new Scanner(System.in);
		while (loop) {

			System.out.println(t1);
			System.out.println(t2);
			g = i.nextLine();

			if (g.equalsIgnoreCase(q1)) {
				g = i.nextLine();
				System.out.println();
				for (int f = 0; f <= a.size() - 1; f++) {
					Language r = (Language) a.get(f);
					if (r.name.toLowerCase().contains(g.toLowerCase())) {
						System.out.println(r1 + r.name);
						System.out.println(r2 + r.size);
						System.out.println(r3 + r.toppings);
						System.out.println(r4 + r.thickness);
						System.out.println("");

					}
				}
			} else if (g.equalsIgnoreCase(q2)) {
				if (a.size() == 0) {
					System.out.println(e1);
				} else {
					System.out.println(e2);
					System.out.println();
					for (int f = 0; f < a.size(); f++) {
						Language r = (Language) a.get(f);
						System.out.println(r1 + r.name);
						System.out.println(r2 + r.size);
						System.out.println(r3 + r.toppings);
						System.out.println(r4 + r.thickness);
						System.out.println("");
					}
				}
			} else if (g.equalsIgnoreCase(q3)) {
				a.add(new Language());
				Language b = (Language) a.get(a.size() - 1);
				b.run();
			} else {
				System.out.println(e3);
			}
			
		}
		i.close();
	}
}

class GrmOrd extends Order {
	{
		t1 = "Einen Pizzattyp bestellen, Neu. Um alle Auftragsarten anzuzeigen, Anzeigen";
		t2 = "Um nach einer Auftragsart zu suchen, drücken Sie die Eingabetaste und geben Sie die gewünschte Auftragsart ein";
		q1 = "suche";
		q2 = "display";
		q3 = "neu";
		r1 = "Name ";
		r2 = "Größe ";
		r3 = "Toppings";
		r4 = "Kruste";
		e1 = "Sie haben noch nichts bestellt";
		e2 = "Aufträge anzeigen";
		e3 = "Ungültiger Befehl";
	}

	void run() {
		super.run();
	}
}