package pizza.ordering;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Order {
	public String pizzaSize;
	public String name;
	public String address;
	public List<Boolean> wantTopping = new ArrayList<Boolean>();
	public List<String> toppingList = new ArrayList<String>();
	public boolean sizeSelected = false;
	public Scanner userInput = new Scanner(System.in);
	
	public void run(){
		wantTopping.add(false);
		wantTopping.add(false);
		wantTopping.add(false);
		wantTopping.add(false);
		wantTopping.add(false);
		wantTopping.add(false);
	}
	
}