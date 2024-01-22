package library;

public class Dissertation extends Item {

	private String subject;

	public Dissertation() {
		super();
	}

	public Dissertation(String title, String author, int page, String subject) {
		super(title, author, page);
		this.subject = subject;
	}

	@Override
	public double calcValue() {

		return 5;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Dissertation [ID = " + getId() + ", Title = " + getTitle() + ", Author = " + getAuthor() + ", Pages = "
				+ getPage() + ", Subject = " + subject + "]";
	}
}
