package IntegrationTest;

public class CalculatorService {
    LoggingService loggingService;
    public CalculatorService(LoggingService loggingService){

        this.loggingService= loggingService;
    }
    public int add(int a, int b) {
        int result = a + b;
        loggingService.log("Adding " + a + " and " + b + ": " + result);
        return result;
    }
    public int subtract(int a,int b){
        int result= a-b;
        loggingService.log("Subtracting "+a +" from "+b+": "+result);
        return result;
    }
    public double division(double a,double b){

        if(b==0){
            throw new ArithmeticException("Cannot divide by zero!");
        }
        double result=a/b;
        loggingService.log("Division "+ a+" by "+b+" : "+result);
        return a/b;
    }
}
