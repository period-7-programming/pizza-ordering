package pizza.ordering;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);

		Language e = new Language();
		String g = i.nextLine();

		if (g.equalsIgnoreCase("English")) {
			e.setEnglish();
		}
		if (g.equalsIgnoreCase("Deustch")) {
			e.setGerman();
		}
		e.run();
		i.close();
	}

}

class Language {

	Scanner i = new Scanner(System.in);

	// q = question, s = statement, r = read back

	String q1 = "Hello, what size pizza would you like?", q2 = "Ok, what would you like on your pizza?",
			q3 = "Would you like thin or thick crust?",
			s1 = "You have ordered a pizza that doesn't exist so thanks for breaking,", r1 = "You have ordered a ",
			r2 = " pizza with ", r3 = " toppings on a ";

	String s2 = " _____      _ ", s3 = "/  ___|    (_)", s4 = "\\ `--.  ___ _  ___ _ __   ___ ___",
			s5 = " `--. \\/ __| |/ _ \\ '_ \\ / __/ _ \\", s6 = "/\\__/ / (__| |  __/ | | | (_|  __/",
			s7 = "\\____/ \\___|_|\\___|_| |_|\\___\\___|";

	void setEnglish() {
		q1 = "Hello, what size pizza would you like?";
		q2 = "Ok, what would you like on your pizza?";
		q3 = "Would you like thin or thick crust?";
		s1 = "You have ordered a pizza that doesn't exist so thanks for breaking,";
		r1 = "You have ordered a ";
		r2 = " pizza with ";
		r3 = " toppings on a ";
		s2 = " _____      _ ";
		s3 = "/  ___|    (_)";
		s4 = "\\ `--.  ___ _  ___ _ __   ___ ___";
		s5 = " `--. \\/ __| |/ _ \\ '_ \\ / __/ _ \\";
		s6 = "/\\__/ / (__| |  __/ | | | (_|  __/";
		s7 = "\\____/ \\___|_|\\___|_| |_|\\___\\___|";
	}

	void setGerman() {

		q1 = "Hallo, welche Größe Pizza möchtest du?";
		q2 = "Ok, was möchten Sie auf Ihrer Pizza?";
		q3 = "Möchten Sie dünne oder dicke Kruste?";
		s1 = "Sie haben eine Pizza, die nicht existiert so danke für Brechen, Wissenschaft bestellt.";
		r1 = "Sie haben eine ";
		r2 = " pizza mit ";
		r3 = " toppings auf einem ";
		s2 = " _    _ _                             _            __ _   ";
		s3 = "| |  | (_)                           | |          / _| |";
		s4 = "| |  | |_ ___ ___  ___ _ __  ___  ___| |__   __ _| |_| |_ ";
		s5 = "| |/\\| | / __/ __|/ _ \\ '_ \\/ __|/ __| '_ \\ / _` |  _| __|";
		s6 = "\\  /\\  / \\__ \\__ \\  __/ | | \\__ \\ (__| | | | (_| | | | |_";
		s7 = " \\/  \\/|_|___/___/\\___|_| |_|___/\\___|_| |_|\\__,_|_|  \\__|";

	}

	String size, toppings, thickness;

	void run() {

		System.out.println(q1);
		size = i.nextLine();
		System.out.println(q2);
		toppings = i.nextLine();
		System.out.println(q3);
		thickness = i.nextLine();

		if (size.equals("null") && toppings.equals("null") && thickness.equals("null")) {

			System.out.println(s1);
			System.out.println(s2);
			System.out.println(s3);
			System.out.println(s4);
			System.out.println(s5);
			System.out.println(s6);
			System.out.println(s7);

		} else {

			System.out.println(r1 + size + r2 + toppings + r3 + thickness);

		}

	}
}