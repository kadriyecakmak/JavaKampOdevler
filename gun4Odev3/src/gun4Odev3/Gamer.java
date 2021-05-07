package gun4Odev3;

public class Gamer {
	
	private int id;
	private String nationalIdentty;
	private String firstName;
	private String lastName;
	private int birthYear;
	
	public Gamer(int id, String nationalIdentty, String firstName, String lastName, int birthYear) {
		super();
		this.id = id;
		this.nationalIdentty = nationalIdentty;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = birthYear;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNationalIdentty() {
		return nationalIdentty;
	}

	public void setNationalIdentty(String nationalIdentty) {
		this.nationalIdentty = nationalIdentty;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

}
