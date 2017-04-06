package textbook;

public class Author {
	private String authorFirstName;
	private String authorLastName;

	public Author(String authorFirstName, String authorLastName) {
		super();
		this.authorFirstName = authorFirstName;
		this.authorLastName = authorLastName;
	}

	public String getAuthorFirstName() {
		return authorFirstName;
	}

	public void setAuthorFirstName(String authorFirstName) {
		this.authorFirstName = authorFirstName;
	}

	public String getAuthorLastName() {
		return authorLastName;
	}

	public void setAuthorLastName(String authorLastName) {
		this.authorLastName = authorLastName;
	}

	@Override
	public String toString() {
		return "FirstName= " + authorFirstName + ", LastName= " + authorLastName;
	}

}
