package textbook;

public class Bookbag {
	private Textbook[] bookArray; // bookArray:Textbook[maxSize:int]
	private int nElems;
	
	public Bookbag(int maxSize){
		bookArray = new Textbook[maxSize];
		nElems = 0;
	}

	// add(textbook:Textbook):void
	public void add(Textbook textbook) {
		bookArray[nElems] = textbook;
		nElems++;
	}

	// removeByBookISBN(isbn:String):Textbook
	public Textbook removeByBookISBN(String isbn) {
		int i;
		for (i = 0; i < nElems; i++) {
			if (bookArray[i].getBookISBN().equals(isbn)) {
				break;
			}
		}
		if (i == nElems) {
			return null;
		} else {
			Textbook t = bookArray[i];
			for (int j = i; j < nElems - 1; j++) {
				bookArray[j] = bookArray[j + 1];
			}
			nElems--;
			return t;
		}
	}
	

	// searchByBookISBN(isbn:String):Textbook
	public Textbook searchByBookISBN(String isbn) {
		for (int i = 0; i < nElems; i++) {
			if (bookArray[i].getBookISBN().equals(isbn)) {
				return bookArray[i];
			}
		}
		return null;
	}

	// updateByBookISBN(isbn:String):void
	public void updateByBookISBN(String isbn) {

	}

}
