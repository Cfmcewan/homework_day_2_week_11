import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Book book1;
    Library library;

    @Before
    public void before() {
        borrower = new Borrower();
        book1 = new Book("Charlotte's Web", "E. B. White", "Children");
        library = new Library(10);
        library.addBook(book1);
    }

    @Test
    public void hasNoBooks() {
        assertEquals(0, borrower.borrowerBookCount());
    }

    @Test
    public void canAddBooks(){
        borrower.addBook(book1);
        assertEquals(1, borrower.borrowerBookCount());
    }


    @Test
    public void canBorrowBook() {
        library.removeBook(book1);
        assertEquals(0, library.libraryBookCount());
        borrower.addBook(book1);
        assertEquals(1, borrower.borrowerBookCount());

    }


}

