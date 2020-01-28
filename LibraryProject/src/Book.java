
public class Book {

	// Eigenschaften/Atribute

	String isbn;
	String author;
	int publicationYear;

	// Konstruktoren

	public Book(String isbn, String author, int publicationYear) {
		this.isbn = isbn;
		this.author = author;
		this.publicationYear = publicationYear;

	}

	// Methode
	public void getIsbn() {

		System.out.println("Das ist die ISBN vom Buch: " + this.isbn);

	}

	public void getAuthor() {

		System.out.println("Das ist der Author vom Buch: " + this.author);

	}

	public void getPublicationYear() {

		System.out.println("Das ist das Erscheinungsdatum vom Buch: " + this.publicationYear);

	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}

}
