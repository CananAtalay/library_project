import java.util.Date;

public abstract class AbstractLibraryItem {

	// Eiegnschaften/Atribute

	String rentedBy;
	String itemType;
	String name;
	Date returnDate;
	boolean isLoaned;

	// Konstruktoren

	public AbstractLibraryItem(String rentedBy, String itemType, String name, Date returnDate, boolean isLoanded) {
		this.rentedBy = rentedBy;
		this.itemType = itemType;
		this.name = name;
		this.returnDate = returnDate;
		this.isLoaned = isLoanded;
	}

	// Methode

	public static void getIsbn () {
		
	}

}
