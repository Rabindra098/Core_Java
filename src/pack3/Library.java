package pack3;
/*
	1. Create a Java class named Library`.
	2. Implement the following methods in the Library class:
	`addBook method:
		-Method signature:
			-public void addBook (String title)`
			-public void addBook(String title, String author)`
		-Adds a book to the library with the given title and optional author.
	borrowBook method:
		Method signature:
			public void borrowBook (String title)`
			public void borrowBook (String title, String borrower)`
			Allows a user to borrow a book with the given title. If the book is available, it marks it as borrowed and optionally assigns the borrower's name.
	returnBook` method:
		Method signature: 
			public void returnBook (String title)
			- Allows a user to return a borrowed book with the given title. Marks the book as available.
	`displayAvailableBooks' method:
		Method signature: 
			public void displayAvailableBooks()
			Displays a list of all available books in the library.
	3. Create a Main class with a main method to test the functionality of the Library class.
	4. In the main method, create an instance of the Library class and simulate various library operations like adding books, borrowing books, returning books, and displaying available books.
	5. Print appropriate messages to indicate the success or failure of each operation.
*/
public class Library 
{
	public void addBook(String title)
	{
		System.out.println("Book add :"+title);
	}
	public void addBook(String title,String auther)
	{
		System.out.println(title+" by "+auther);
	}
	public void borrowBook(String title)
	{
		
	}
	public void borrowBook (String title, String borrower)
	{
		
	}
	public void returnBook (String title)
	{
		
	}
	public void displayAvailableBooks()
	{
		
	}
	public static void main(String[] args) 
	{
		Library library = new Library();
		
		//Adding book
		library.addBook("Java Programing");
		library.addBook("Python Programing", "Rabi");
		
		//Borrowing book
		library.borrowBook("Java Programing", "Raju");
		library.borrowBook("Python Programing");
		
		//Returning book
		library.returnBook("Java Programing");
		
		//Displaying available book
		library.displayAvailableBooks();
	}
}










