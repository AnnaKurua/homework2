package lms;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
class Book implements Serializable {
    private static final long serialVersionUID = 1L;
    private String isbn;
    private String title;
    private boolean isBorrowed;
    private Student borrowedBy;

    public Book(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
        this.isBorrowed = false;
        this.borrowedBy = null;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean isBorrowed) {
        this.isBorrowed = isBorrowed;
    }

    public Student getBorrowedBy() {
        return borrowedBy;
    }

    public void setBorrowedBy(Student borrowedBy) {
        this.borrowedBy = borrowedBy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        return isbn.equals(book.isbn);
    }

    @Override
    public int hashCode() {
        return isbn.hashCode();
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", isBorrowed=" + isBorrowed +
                ", borrowedBy=" + (borrowedBy != null ? borrowedBy.getName() : "null") +
                '}';
    }
}
