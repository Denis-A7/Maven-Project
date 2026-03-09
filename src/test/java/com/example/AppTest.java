import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    
    @Test
    public void testAddition() {
        double result = App.performCalculation(5, '+', 3);
        assertEquals(8, result, "5 + 3 should equal 8");
    }
    
    @Test
    public void testSubtraction() {
        double result = App.performCalculation(10, '-', 4);
        assertEquals(6, result, "10 - 4 should equal 6");
    }
    
    @Test
    public void testMultiplication() {
        double result = App.performCalculation(6, '*', 7);
        assertEquals(42, result, "6 * 7 should equal 42");
    }
    
    @Test
    public void testDivision() {
        double result = App.performCalculation(20, '/', 4);
        assertEquals(5, result, "20 / 4 should equal 5");
    }
    
    @Test
    public void testDivisionByZero() {
        double result = App.performCalculation(10, '/', 0);
        assertEquals(0, result, "Division by zero should return 0");
    }
    
    @Test
    public void testModulus() {
        double result = App.performCalculation(17, '%', 5);
        assertEquals(2, result, "17 % 5 should equal 2");
    }
    
    @Test
    public void testNegativeNumbers() {
        double result = App.performCalculation(-5, '+', 3);
        assertEquals(-2, result, "-5 + 3 should equal -2");
    }
    
    @Test
    public void testDecimalNumbers() {
        double result = App.performCalculation(5.5, '*', 2);
        assertEquals(11, result, "5.5 * 2 should equal 11");
    }
    
    @Test
    public void testInvalidOperator() {
        double result = App.performCalculation(5, '&', 3);
        assertEquals(0, result, "Invalid operator should return 0");
    }
    
    @Test
    public void testSubtractionNegativeResult() {
        double result = App.performCalculation(3, '-', 8);
        assertEquals(-5, result, "3 - 8 should equal -5");
    }
}
