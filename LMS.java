package lms;

import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class LMS implements Serializable {

    List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public boolean removeBook(Book book) {
        return books.remove(book);
    }

    public boolean borrowBook(Book book, Student student) {
        for(Book b : books){
            if(b.equals(book) && !b.isBorrowed()){
                b.setBorrowed(true);
                b.setBorrowedBy(student);
                return true;
            }
        }
        return false;
    }

    public boolean returnBook(Book book) {
        for(Book b : books){
            if (b.equals(book) && b.isBorrowed()){
                b.setBorrowed(false);
                b.setBorrowedBy(null);
                return true;
            }
        }
        return false;
    }

    public void saveState(String filePath) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static LMS loadState(String filePath) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            return (LMS) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

}