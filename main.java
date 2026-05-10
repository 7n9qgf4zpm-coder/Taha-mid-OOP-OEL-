// 🔹 Encapsulation
class Book {
    private String title;
    private String author;
    private boolean isBorrowed;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    // Getters
    public String getTitle() { return title; }
    public String getAuthor() { return author; }

    public void borrowBook() {
        if (!isBorrowed) {
            isBorrowed = true;
            System.out.println("✅ You borrowed: " + title + " by " + author);
        } else {
            System.out.println("❌ Book already borrowed.");
        }
    }

    public void returnBook() {
        if (isBorrowed) {
            isBorrowed = false;
            System.out.println("📚 Book returned: " + title);
        } else {
            System.out.println("❌ No book to return.");
        }
    }

    // Polymorphism
    public void displayInfo() {
        System.out.println("Book: " + title + " by " + author);
    }
}

// 🔹 Inheritance + Polymorphism
class FictionBook extends Book {
    public FictionBook(String title, String author) {
        super(title, author);
    }
    @Override
    public void displayInfo() {
        System.out.println("📖 Fiction Book: " + getTitle() + " by " + getAuthor());
    }
}

class TextBook extends Book {
    public TextBook(String title, String author) {
        super(title, author);
    }
    @Override
    public void displayInfo() {
        System.out.println("📘 Textbook: " + getTitle() + " by " + getAuthor());
    }
}

// 🔹 Main System
public class LibraryOOP {
    public static void main(String[] args) {
        Book b1 = new FictionBook("Harry Potter", "J.K. Rowling");
        Book b2 = new TextBook("Java Programming", "John Doe");

        b1.displayInfo(); // Polymorphism
        b2.displayInfo(); // Polymorphism

        b1.borrowBook();
        b1.returnBook();
    }
}
