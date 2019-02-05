import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book1;
    Book book2;
    Book book3;
    Book book4;



    @Before
    public void before() {
        library = new Library(2);
        book1 = new Book("1984", "George Orwell", "Dystopian");
        book2 = new Book("BearTown", "Frederick Backman", "Thriller");
        book3 = new Book("Anna Karenina", "Leo Tolstoy", "Russian");
        book4 = new Book("OliverTwist", "Charles Dickens", "Classic");

    }

    @Test
    public void startsOffEmpty(){
        assertEquals(0, library.libraryBookCount());
    }

    @Test
    public void canAddBook(){
        library.addBook(book1);
        assertEquals(1, library.libraryBookCount());
    }

    @Test
    public void hasCapacity(){
    assertEquals(2, library.getCapacity());
    }

    @Test
    public void canAddBookIfCapacityTrue(){
        library.checkStockFull(book3);
        assertEquals(1, library.libraryBookCount());

    }

    @Test
    public void canAddBookIfCapacityFalse(){
        library.addBook(book1);
        library.addBook(book2);
        library.checkStockFull(book4);
        assertEquals(2, library.libraryBookCount());
    }

    @Test
    public void enoughCapacityTrue() {
        assertEquals(true, library.enoughCapacity(book2));
    }

    @Test
    public void enoughCapacityFalse(){
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(false, library.enoughCapacity(book4));
    }

    @Test
    public void canRemoveBook(){
        library.addBook(book1);
        library.removeBook(book1);
        assertEquals(0, library.libraryBookCount());
    }


}

