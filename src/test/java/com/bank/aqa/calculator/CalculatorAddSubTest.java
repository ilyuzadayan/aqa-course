import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorAddSubTest {

    private final Calculator calc = new Calculator();

    @Test
    void testAddPositiveNumbers() {
        assertEquals(5, calc.add(2, 3));
        assertEquals(1, calc.add(0, 1));
    }

    @Test
    void testAddNegativeNumbers() {
        assertEquals(-5, calc.add(-2, -3));
        assertEquals(-10, calc.add(-1, -9));
    }

    @Test
    void testAddZero() {
        assertEquals(2, calc.add(2, 0));
    }

    @Test
    void testSubPositiveeNumbers () {
        assertEquals(2, calc.sub(5, 3));
    }

    @Test
    void testSubNegativeNumbers() {
        assertEquals(-1, calc.sub(-2, -1));
    }

    @Test
    void testSubToZero() {
        assertEquals(0, calc.sub(5, 5));
    }
}