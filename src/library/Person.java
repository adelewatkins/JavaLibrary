package library;

public class Person {

	private static int count;

	private int personalId;

	private String name;

	private boolean member;

	public Person() {
		super();
		this.personalId = ++count;
	}

	public Person(String name, boolean member) {
		this.name = name;
		this.member = member;
		this.personalId = ++count;
	}

	public boolean isMember() {
		return member;
	}

	public void setMember(boolean member) {
		this.member = member;
	}

	public int getPersonalId() {
		return personalId;
	}

	public void setPersonalId(int personalId) {
		this.personalId = personalId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [Personal Id = " + personalId + ", Name " + name + ", Member? = " + member + "]";
	}

}
