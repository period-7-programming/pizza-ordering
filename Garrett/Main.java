package pizza.ordering;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);

		System.out.println("English, Deutsch");
		String g = i.nextLine();

		if (g.equalsIgnoreCase("english")) {
			Order o = new Order();
			o.run();
		} else if (g.equalsIgnoreCase("deutsch")) {
			Order o = new GrmOrd();
			o.run();
		}
		i.close();
	}
}