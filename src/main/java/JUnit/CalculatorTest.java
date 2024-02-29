package JUnit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CalculatorTest {
    @Test
    public void testAdd(){
        Calculator calculator= new Calculator();
        int result=calculator.add(4,5);
        assertEquals(9,result);
}
    @Test
    public void testMultiply(){
        Calculator calculator= new Calculator();
        int result=calculator.multiply(4,5);
        assertEquals(20,result);
    }
    @Test
    public void testExtraction(){
        Calculator calculator= new Calculator();
        int result=calculator.extraction(4,5);
        assertEquals(-1,result);
    }
    @Test
    public void testDivision(){
        Calculator calculator=new Calculator();
            assertThrows(ArithmeticException.class,() ->{
                double result= calculator.division(5,0);
            });


}}
