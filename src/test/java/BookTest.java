import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void before() {
        book = new Book("Charlotte's Web", "E. B. White", "Children");
    }

    @Test
    public void hasTitle() {
        assertEquals("Charlotte's Web", book.getTitle());
    }

    @Test
    public void hasAuthor(){
        assertEquals("E. B. White", book.getAuthor());
    }

    @Test
    public void hasGenre(){
        assertEquals("Children", book.getGenre());
    }

}
