import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class humanTest {
    public humanTest() {
    }

    @Test
    public void test() {
        human man1 = new human();
        human man2 = new human("Ivanov", "Ivan", "Ivanovich", 20);
        Assertions.assertEquals("Ivanov", man2.getSurname());
        Assertions.assertEquals((Object)null, man1.getPatronymic());
        Assertions.assertEquals(20, man2.getAge());
        Assertions.assertEquals(0, man1.getAge());
    }
}
