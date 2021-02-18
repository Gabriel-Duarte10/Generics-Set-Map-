package entities;

public class Students {

	private String name;

	public Students() {

	}

	public Students(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

	public int compareTo(Students other) {
		return name.toUpperCase().compareTo(other.getName().toUpperCase());
	}

}
