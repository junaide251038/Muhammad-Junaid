class LibraryBook {
    String title;
    String author;
    String bookID;

    // Constructor using 'this' keyword
    LibraryBook(String title, String author, String bookID) {
        this.title = title;
        this.author = author;
        this.bookID = bookID;
    }

    // Method to display book information
    void displayBookInfo() {
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Book ID: " + bookID);
        System.out.println("-----------------------");
    }
}

public class Main {
    public static void main(String[] args) {

        // Creating book objects
        LibraryBook book1 = new LibraryBook("Java Programming", "James Gosling", "B001");
        LibraryBook book2 = new LibraryBook("Data Structures", "Mark Weiss", "B002");

        // Display information
        System.out.println("== Book 1 Information ==");
        book1.displayBookInfo();

        System.out.println("== Book 2 Information ==");
        book2.displayBookInfo();
    }
}
