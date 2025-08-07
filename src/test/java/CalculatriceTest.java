import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import calculator.Calculatrice;

public class CalculatriceTest {
    @Test
    void testAddition() {
        assertEquals(5, Calculatrice.addition(2, 3));
    }
    @Test
    void testSoustraction() {
        assertEquals(1, Calculatrice.soustraction(3, 2));
    }
    @Test
    void testMultiplication() {
        assertEquals(6, Calculatrice.multiplication(2, 3));
    }
    @Test
    void testDivision() {
        assertEquals(2, Calculatrice.division(6, 3));
    }
}
