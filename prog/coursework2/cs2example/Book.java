/**
 * A class representing a book.
 * @author Liam O'Reilly
 *
 */
public class Book extends Item {
	private String author;
	private int year;
	private String isbn;

	/**
	 * Creates a book.
	 * @param isLentOut true if the item is currently lent out, false otherwise.
	 * @param title The title of the book.
	 * @param author The author of the book.
	 * @param year The year of the book.
	 * @param ISBN The ISBN of the book.
	 */
	public Book(Boolean isLentOut, String title, String author, int year, String isbn) {
		super(isLentOut, title);
		setAuthor(author);
		setYear(year);
		setIsbn(isbn);
	}
	
	/**
	 * Gets the author of the book.
	 * @return The author of the book.
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * Sets the author of the book.
	 * @param author The new author of the book.
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * Gets the year of the book.
	 * @returnThe year of the book.
	 */
	public int getYear() {
		return year;
	}

	/**
	 * Sets the year of the book.
	 * @param year The new year of the book.
	 */
	public void setYear(int year) {
		this.year = year;
	}

	/**
	 * Gets the ISBN of the book.
	 * @return The ISBN of the book.
	 */
	public String getIsbn() {
		return isbn;
	}

	/**
	 * Sets the ISBN of the book.
	 * @param ISBN The new ISBN of the book.
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	/**
	 * Converts the book to a string. This is used only for debugging.
	 * @return String representation of the book.
	 */
	public String toString() {
		return super.toString() + ", " + author + ", " + year + ", " + isbn;
	}

	/**
	 * Gets a short description of the book.
	 * @return Short description of the book.
	 */
	public String getShortDescription() {
		return getTitle() + ", " + author + " (Book)";
	}

	/**
	 * Gets a detailed description of the book suitable for printing.
	 * @return Detailed description of the book.
	 */
	public String getDetailedDescription() {
		return super.getDetailedDescription() + 
				"\n\tAuthor:\t\t" + author +
				"\n\tYear:\t\t" + year +
				"\n\tISBN:\t\t" + isbn;  
	}
	
	/**
	 * Gets a string representation suitable for use in the data file.
	 * @return a string representing this book.
	 */
	public String toStringForFile() {
		return "BOOK," + getLentOutStatusAsStringInOrOut() + "," + getTitle() + "," + author + "," + year + "," + isbn; 
	}
}
