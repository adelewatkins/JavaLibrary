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

		uniLibrary.checkIn(diss1);

		System.out.println(myLibrary);
		System.out.println(uniLibrary);

		myLibrary.stock();
		uniLibrary.stock();
	}

}
