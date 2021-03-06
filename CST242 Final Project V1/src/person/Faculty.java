package person;

import java.util.ArrayList;

public class Faculty extends Person {
	private String rank;
	private double salary;
	private ArrayList<String> coursesTeaching;

	public Faculty(String firstName, String lastName, String phone, Address address, String rank,
                   double salary, ArrayList<String> coursesTeaching) {
		super(firstName, lastName, phone, address);
		this.rank = rank;
		this.salary = salary;
		this.coursesTeaching = coursesTeaching;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public ArrayList<String> getCoursesTeaching() {
		return coursesTeaching;
	}

	public void setCoursesTeaching(ArrayList<String> coursesTeaching) {
		this.coursesTeaching = coursesTeaching;
	}


	@Override
	public String toString() {
		return "Faculty: " + getFirstName() + " " + getLastName() + "\n Phone: " + getPhone() + "\n Id: " + getId() + "\n Address: " + getAddress() + "\n Rank: " + rank + " Salary: " + salary
				+ "\n Currently Teaching: " + coursesTeaching + "";
	}
}
