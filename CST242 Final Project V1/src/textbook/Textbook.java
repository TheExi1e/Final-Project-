package textbook;

import java.util.ArrayList;

public class Textbook {
	private String bookISBN;
	private String bookTitle;
	private ArrayList<Author> bookAuthors;
	private double bookPrice;

	public Textbook(String bookISBN, String bookTitle, ArrayList<Author> bookAuthors, double bookPrice) {
		super();
		this.bookISBN = bookISBN;
		this.bookTitle = bookTitle;
		this.bookAuthors = bookAuthors;
		this.bookPrice = bookPrice;
	}

	public String getBookISBN() {
		return bookISBN;
	}

	public void setBookISBN(String bookISBN) {
		this.bookISBN = bookISBN;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public ArrayList<Author> getBookAuthors() {
		return bookAuthors;
	}

	public void setBookAuthors(ArrayList<Author> bookAuthors) {
		this.bookAuthors = bookAuthors;
	}

	public double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}

	@Override
	public String toString() {
		return "Textbook [ISBN= " + bookISBN + ", Title= " + bookTitle + ", Authors= " + bookAuthors
				+ ", Price= " + bookPrice + "]";
	}

}
