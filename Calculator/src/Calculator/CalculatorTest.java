package Calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void testSum() {
        CalculatorPrototype calculator = new CalculatorPrototype();
        int sum = calculator.sum(3,3);
        assertEquals(6, sum);
    }
    
    @Test
    public void testDivisionEven() {
        CalculatorPrototype calculator = new CalculatorPrototype();
        int sum = calculator.divide(6,3);
        assertEquals(2, sum);
    }

    @Test
    public void testDivisionOdd() {
        CalculatorPrototype calculator = new CalculatorPrototype();
        int sum = calculator.divide(7,3);
        assertEquals(2, sum);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionByZero() {
        CalculatorPrototype calculator = new CalculatorPrototype();
        int sum = calculator.divide(3,0);
    }
    @Test
    public void testZeroMultiplication(){
        CalculatorPrototype calculator = new CalculatorPrototype();
        int mult = calculator.multiply(5,0);
        assertEquals(0,mult);
    }
    @Test
    public void nullSubtraction(){
        CalculatorPrototype calculator= new CalculatorPrototype();
        int subt = calculator.subtract(0,0);
        assertEquals(0,subt);
    }
}