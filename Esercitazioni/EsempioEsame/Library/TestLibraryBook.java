package Library;

public class TestLibraryBook {
    public static void main(String[] args) {
        // Test LibraryBook creation and methods
        LibraryBook book1 = new LibraryBook("1984", "George Orwell");
        LibraryBook book2 = new LibraryBook("Brave New World", "Aldous Huxley");
        LibraryBook book3 = new LibraryBook();

        System.out.println("Testing toString():");
        System.out.println(book1.toString());
        System.out.println(book2.toString());
        System.out.println(book3.toString());

        System.out.println("\nTesting equals():");
        System.out.println("book1 equals book2? " + book1.equals(book2));
        LibraryBook book1Copy = new LibraryBook("1984", "George Orwell");
        System.out.println("book1 equals book1Copy? " + book1.equals(book1Copy));

        System.out.println("\nTesting borrow() and returnBook():");
        book1.borrow();
        book1.returnBook();

        System.out.println("\nTesting static getNumBooks():");
        System.out.println("Number of books created: " + LibraryBook.getNumBooks());

        // Test ReferenceBook subclass
        ReferenceBook refBook = new ReferenceBook();
        System.out.println("\nTesting ReferenceBook borrow():");
        refBook.borrow();  // Should print message that borrowing is not allowed
    }
}
