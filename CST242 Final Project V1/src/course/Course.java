package course;

import java.util.ArrayList;

public class Course {
	private String courseNumer; // {UNIQUE}
	private String courseTitle;
	private String courseDescription;
	private double courseCredits;
	private ArrayList<String> textbooks;

	public Course(String courseNumer, String courseTitle, String courseDescription, double courseCredits,
			ArrayList<String> textbooks) {
		super();
		this.courseNumer = courseNumer;
		this.courseTitle = courseTitle;
		this.courseDescription = courseDescription;
		this.courseCredits = courseCredits;
		this.textbooks = textbooks;
	}

	public String getCourseNumer() {
		return courseNumer;
	}

	public void setCourseNumer(String courseNumer) {
		this.courseNumer = courseNumer;
	}

	public String getCourseTitle() {
		return courseTitle;
	}

	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}

	public String getCourseDescription() {
		return courseDescription;
	}

	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}

	public double getCourseCredits() {
		return courseCredits;
	}

	public void setCourseCredits(double courseCredits) {
		this.courseCredits = courseCredits;
	}

	public ArrayList<String> getTextbooks() {
		return textbooks;
	}

	public void setTextbooks(ArrayList<String> textbooks) {
		this.textbooks = textbooks;
	}

	@Override
	public String toString() {
		return "Course [courseNumer=" + courseNumer + ", courseTitle=" + courseTitle + ", courseDescription="
				+ courseDescription + ", courseCredits=" + courseCredits + ", textbooks=" + textbooks + "]";
	}

}
