package IntegrationTest;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.verify;

public class CalculatorServiceIntegrationTest {
    @Test
public void testAddFunction() {
    LoggingService loggingService = new LoggingService() {
        @Override
        public void log(String message) {
            System.out.println("Log: " + message);
        }
    };
    CalculatorService calculatorService = new CalculatorService(loggingService);
    int result = calculatorService.add(2, 3);
    assertEquals("Summan ska vara 5", 5, result);

    assertEquals(8,calculatorService.add(5,3));
    assertEquals(9,calculatorService.add(5,4));
}
@Test
public void testSubtractFunction() {

        LoggingService loggingService = new LoggingService() {
            @Override
            public void log(String message) {

                System.out.println("Log: " + message);
            }
        };
        CalculatorService calculatorService = new CalculatorService(loggingService);
        int result = calculatorService.subtract(5, 3);
        assertEquals("Subtraction will be 2", 2, result);
    }

    @Test
public void testDivide(){
        LoggingService loggingService= new LoggingService() {
            @Override
            public void log(String message) {
                System.out.println("Log: "+ message);
            }
        };
        CalculatorService calculatorService = new CalculatorService(loggingService);
        double result= calculatorService.division(100,10);
        assertEquals(10,result);
    }

@Test
public void testDivideByZero() {
    LoggingService loggingService = new LoggingService() {
        @Override
        public void log(String message) {
            System.out.println("Log: "+ message);

        }
    };
    CalculatorService calculatorService = new CalculatorService(loggingService);
    try {
        double result = calculatorService.division(10,0);
    } catch (ArithmeticException e) {
        loggingService.log("Division by zero test passed.");
        return;
    }
    throw new AssertionError("Expected ArithmeticException but no exception was thrown.");
}

@Test
public void testAddFunctionLogsCorrectly(){
        //Skapa en mock för LoggingService
        LoggingService mockLoggingService= Mockito.mock(LoggingService.class);
        //Skapa en instans av CalculatorService med mocken
        CalculatorService calculatorService= new CalculatorService(mockLoggingService);
        int expected=5;
        int actual= calculatorService.add(3,2);
        //verifiera att resultatet är korrekt
        assertEquals(expected,actual);
        //Verifiera att log-metoden anropades en gång med förväntat meddelande
    //any string!!!
        verify(mockLoggingService).log(anyString());
    }
}
