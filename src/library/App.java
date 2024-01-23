package library;

public class App {

	public static void main(String[] args) {

		Book book1 = new Book("Harry Potter", "J.K. Rowling", 250, true);
		Magazine mag1 = new Magazine("Vogue: Jan 2024", "Anna Wintour", 200, 18);
		Dissertation diss1 = new Dissertation("Do Woodpeckers Get Headaches", " Ivan Schwab", 150, "Medicine");

		Library myLibrary = new Library("My Home Library");
		Library uniLibrary = new Library("The University Library");

		myLibrary.checkIn(new Book("Janes Patisserie", "Jane", 100, false));
		myLibrary.checkIn(new Magazine("Kingsland Chronicle Jan", "KPC", 30, 16));
		myLibrary.checkIn(book1);
		myLibrary.checkIn(mag1);
		myLibrary.checkIn(new Magazine("Good Food: Dec2023", "BBC", 50, 25));

		uniLibrary.checkIn(diss1);
		uniLibrary.checkIn(new Dissertation("Chickens Prefer Beautiful Humans", "S. Ghirlanda", 80, "Photography"));
		uniLibrary.checkIn(new Dissertation("Jesus Potter Harry Christ", "Derek Murphy", 210, "R.E"));

		Person p1 = new Person("Adele", true);
		myLibrary.addCustomer(p1);
		myLibrary.addCustomer(new Person("Agustina", true));

		uniLibrary.addCustomer(new Person("Mike", false));
		uniLibrary.addCustomer(new Person("Treesa", true));
		uniLibrary.addCustomer(new Person("Liam", true));

		System.out.println(myLibrary);
		System.out.println(uniLibrary);
		myLibrary.stock();
		uniLibrary.stock();

		uniLibrary.removeCustomer(3);
		myLibrary.checkOut(6);

	}

}
