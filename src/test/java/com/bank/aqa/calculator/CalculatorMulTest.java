import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorMulTest {

    private final Calculator calc = new Calculator();

    @Test
    void testMulPositiveNumbers() {
        assertEquals(15, calc.mul(3, 5));
    }

    @Test
    void testMulWithZero() {
        assertEquals(0, calc.mul(5, 0));
        assertEquals(0, calc.mul(0, 5));
    }

    @Test
    void testMulNegativeNumbers() {
        assertEquals(-15, calc.mul(-3, 5));
        assertEquals(15, calc.mul(-3, -5));
    }
}