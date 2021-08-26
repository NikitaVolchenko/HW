import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class movieTest {
    public movieTest() {
    }

    @Test
    public void test() {
        movie TheRing = new movie("The Ring", 3, "Gregor Verbinski");
        Assertions.assertEquals("The Ring", TheRing.getName());
        Assertions.assertEquals(3, TheRing.getPartsCount());
        Assertions.assertEquals("Gregor Verbinski", TheRing.getDirector());
    }
}
