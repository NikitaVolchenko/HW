import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class bookTest {
    public bookTest() {
    }

    @Test
    public void test() {
        book WarAndPiece = new book("War and Piece", 100000, 1865, "L.N. Tolstoy");
        Assertions.assertEquals("War and Piece", WarAndPiece.getName());
        Assertions.assertEquals(100000, WarAndPiece.getPageCount());
        Assertions.assertEquals(1865, WarAndPiece.getYearOfRelease());
        Assertions.assertEquals("L.N. Tolstoy", WarAndPiece.getAuthor());
    }
}