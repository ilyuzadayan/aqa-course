import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorDivTest {

    private final Calculator calc = new Calculator();

    @Test
    void testDivPositiveNumbers() {
        assertEquals(2, calc.div(10, 5));
    }

    @Test
    void testDivWithOne() {
        assertEquals(7, calc.div(7, 1));
    }

    @Test
    void testDivNegativeNumbers() {
        assertEquals(-2, calc.div(-10, 5));
        assertEquals(2, calc.div(-10, -5));
    }

    @Test
    void testDivByZeroThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> calc.div(10, 0));
    }

    @Test
    void testDivZeroByNumber() {
        assertEquals(0, calc.div(0, 5));
    }
}