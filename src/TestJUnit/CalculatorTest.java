package TestJUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testSumCalculator(){
        final int result = Calculator.add(5,5);
        Assertions.assertEquals(25, result);

    }

}
