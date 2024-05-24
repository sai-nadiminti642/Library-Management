import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    private ArrayList<User> users;
    private ArrayList<Book> books;
    private HashMap<String, String> borrowedBooks; // Maps bookId to userId

    public Library() {
        users = new ArrayList<>();
        books = new ArrayList<>();
        borrowedBooks = new HashMap<>();
    }

    // User Management
    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(String userId) {
        users.removeIf(user -> user.getUserId().equals(userId));
    }

    public User getUser(String userId) {
        for (User user : users) {
            if (user.getUserId().equals(userId)) {
                return user;
            }
        }
        return null;
    }

    // Book Management
    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(String bookId) {
        books.removeIf(book -> book.getBookId().equals(bookId));
    }

    public Book getBook(String bookId) {
        for (Book book : books) {
            if (book.getBookId().equals(bookId)) {
                return book;
            }
        }
        return null;
    }

    // Borrowing System
    public boolean borrowBook(String userId, String bookId) {
        Book book = getBook(bookId);
        if (book != null && !book.isBorrowed()) {
            book.setBorrowed(true);
            borrowedBooks.put(bookId, userId);
            return true;
        }
        return false;
    }

    public boolean returnBook(String bookId) {
        Book book = getBook(bookId);
        if (book != null && book.isBorrowed()) {
            book.setBorrowed(false);
            borrowedBooks.remove(bookId);
            return true;
        }
        return false;
    }

    // Reporting
    public void generateReport() {
        System.out.println("Borrowed Books Report:");
        for (String bookId : borrowedBooks.keySet()) {
            Book book = getBook(bookId);
            User user = getUser(borrowedBooks.get(bookId));
            System.out.println("Book: " + book.getTitle() + " borrowed by " + user.getName());
        }
    }
}

