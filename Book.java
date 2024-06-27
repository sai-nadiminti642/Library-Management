public class Book {
    private String bookId;
    private String title;
    private String author;
    private boolean isBorrowed;

    // Constructor
    public Book(String bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    // Getters and Setters
    public String getBookId() { 
        return bookId; }
    public void setBookId(String bookId) { 
        this.bookId = bookId; }

    public String getTitle() { 
        return title; }
    public void setTitle(String title) { 
        this.title = title; }

    public String getAuthor() { 
        return author; }
    public void setAuthor(String author) { 
        this.author = author; }

    public boolean isBorrowed() { 
        return isBorrowed; }
    public void setBorrowed(boolean isBorrowed) { 
        this.isBorrowed = isBorrowed; }

    @Override
    public String toString() {
        return "Book ID: " + bookId + ", Title: " + title + ", Author: " + author + ", Borrowed: " + isBorrowed;
    }
}

