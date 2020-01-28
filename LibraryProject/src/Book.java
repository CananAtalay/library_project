
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

	//Methode 
	public void getIsbn() {

		System.out.println("Das ist die ISBN vom Buch: " + this.isbn);

	}

}
