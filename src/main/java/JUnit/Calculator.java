package JUnit;

public class Calculator {
    public int add (int a, int b){

        return a+b;
    }
    public int multiply (int a, int b){

        return a*b;
    }
    public int extraction (int a,int b){

        return a-b;
    }
    public static int division (int a, int b){
        if (b==0){
            throw new ArithmeticException( "Division by zero is not allowed");

    }return a/b;}
}
