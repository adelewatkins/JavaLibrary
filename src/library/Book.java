package library;

public class Book extends Item {

	private boolean hardback;

	public Book() {
		super();
	}

	public Book(String title, String author, int page, boolean hardback) {
		super(title, author, page);
		this.hardback = hardback;
	}

	@Override
	public double calcValue() {

		return 12;
	}

	public boolean isHardback() {
		return hardback;
	}

	public void setHardback(boolean hardback) {
		this.hardback = hardback;
	}

	@Override
	public String toString() {
		return "Book [ID = " + getId() + ", Title = " + getTitle() + ", Author = " + getAuthor() + ", Pages = "
				+ getPage() + ", Hardback? = " + hardback + "]";
	}

}
