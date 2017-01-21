package pizza.ordering;

import java.util.Scanner;

class Language {

	Scanner i = new Scanner(System.in);

	// q = question, s = statement, r = read back

	public String q1 = "Hello, what size pizza would you like?", q2 = "Ok, what would you like on your pizza?",
			q3 = "Would you like thin or thick crust?",
			s1 = "You have ordered a pizza that doesn't exist so thanks for breaking,", r1 = "You have ordered a ",
			r2 = " pizza with ", r3 = " toppings on a ";

	public String s2 = " _____      _ ", s3 = "/  ___|    (_)", s4 = "\\ `--.  ___ _  ___ _ __   ___ ___",
			s5 = " `--. \\/ __| |/ _ \\ '_ \\ / __/ _ \\", s6 = "/\\__/ / (__| |  __/ | | | (_|  __/",
			s7 = "\\____/ \\___|_|\\___|_| |_|\\___\\___|";

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
			System.out.println();
		}
	}
}