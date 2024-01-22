package library;

import java.util.ArrayList;

public class Library {

	private String name;
	private ArrayList<Item> items = new ArrayList<>();
	private ArrayList<Person> persons = new ArrayList<>();

	public Library(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void checkIn(Item item) {
		items.add(item);
	}

	public boolean checkOut(int id) {
		for (Item item : this.items) {
			if (id == item.getId()) {
				return this.items.remove(item);
			}
		}
		return false;
	}

	public void addCustomer(Person person) {
		persons.add(person);
	}

	public boolean removeCustomer(int personalId) {
		for (Person person : this.persons) {
			if (personalId == person.getPersonalId()) {
				return this.persons.remove(person);
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "Library [Library Name = " + name + ", Items = " + items + ", Customers = " + persons + "]";
	}

	public double stock() {
		double stockValue = 0;

		for (Item item : items) {
			stockValue = stockValue + item.calcValue();
		}
		System.out.println("Total stock value for " + name + " £" + stockValue);
		return stockValue;
	}

}
