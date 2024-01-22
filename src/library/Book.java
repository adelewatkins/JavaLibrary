package library;

public class Book extends Item {

	private boolean fiction;

	public Book() {
		super();
	}

	public Book(String title, String author, int page, boolean fiction) {
		super(title, author, page);
		this.fiction = fiction;
	}

	@Override
	public double calcValue() {

		return 12;
	}

	public boolean isFiction() {
		return fiction;
	}

	public void setFiction(boolean fiction) {
		this.fiction = fiction;
	}

	@Override
	public String toString() {
		return "Book [ID = " + getId() + ", Title = " + getTitle() + ", Author = " + getAuthor() + ", Pages = "
				+ getPage() + ", Fiction? = " + fiction + "]";
	}

}
