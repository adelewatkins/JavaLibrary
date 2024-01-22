package library;

public abstract class Item {

	private static int count;

	private int id;

	private String title;

	private String author;

	private int page;

	public Item() {
		super();
		this.id = ++count;
	}

	public Item(String title, String author, int page) {
		this.title = title;
		this.author = author;
		this.page = page;
		this.id = ++count;

	}

	public abstract double calcValue();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	@Override
	public String toString() {
		return "Item [id = " + id + ", Title = " + title + ", Author = " + author + ", Pages = " + page + "]";
	}

}
