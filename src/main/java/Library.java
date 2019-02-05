import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private int capacity;

    public Library(int capacity) {
        this.books = new ArrayList<Book>();
        this.capacity = capacity;
    }


    public int libraryBookCount() {
        return this.books.size();
    }


    public void addBook(Book book) {
        this.books.add(book);
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean enoughCapacity(Book book) {
        if (capacity > this.libraryBookCount()) {
            return true;
        }
        return false;
    }

    public void checkStockFull(Book book) {
        if (this.enoughCapacity(book)) {
            this.addBook(book);
        } else {
            this.libraryBookCount();
        }
    }

    public Book removeBook(Book book) {
        return this.books.remove(0);
    }
}

