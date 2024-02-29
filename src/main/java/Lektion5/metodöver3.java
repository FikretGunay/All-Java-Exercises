package Lektion5;
//Rekursivt Fibonacci: Skapa en metod som beräknar det n-te Fibonacci-talet med hjälp av rekursion.
//bu yanlis hocaninkine bak yukleyince
public class metodöver3 {
    public static void main (String[] args) {
        int fib =5;
        for (int i = 0; i < fib; i++) {

            System.out.println(fibonacci(i) + "");
        }
    }
    public static int fibonacci(int n){
        if (n == 0){
            return 0;
        } else if (n==1){
            return 1;
        } else
            return fibonacci(n-1)+fibonacci(n-2);
    }
}
