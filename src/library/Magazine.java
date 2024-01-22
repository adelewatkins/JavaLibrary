package library;

public class Magazine extends Item {

	private int targetAge;

	public Magazine() {
		super();
	}

	public Magazine(String title, String author, int page, int targetAge) {
		super(title, author, page);
		this.targetAge = targetAge;
	}

	@Override
	public double calcValue() {

		return 4;
	}

	public int getTargetAge() {
		return targetAge;
	}

	public void setTargetAge(int targetAge) {
		this.targetAge = targetAge;
	}

	@Override
	public String toString() {
		return "Magazine [ID = " + getId() + ", Title = " + getTitle() + ", Author = " + getAuthor() + ", Pages = "
				+ getPage() + ", Target Age = " + targetAge + "years+" + "]";
	}

}
