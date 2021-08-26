import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class calculatorTest {
    public calculatorTest() {
    }

    @Test
    public void test() {
        calculator calc = new calculator();
        Assertions.assertEquals(64, calc.mult(8, 8));
        Assertions.assertEquals(0, calc.sub(10, 10));
        Assertions.assertEquals(2, calc.div(12, 6));
        Assertions.assertEquals(1000, calc.add(999, 1));
    }
}