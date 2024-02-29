package Lektion5;

public class övning7 {
    public static void main(String[] args) {
        int num1= 7;
        int num2 = 23;
        printGreaternumbers(num1, num2);
    }

    public static void printGreaternumbers (int a, int b) {

        if (a > b) {
            System.out.println(a + " is greater than " + b);
        } else if (b > a) {
            System.out.println(b + " is greater than " + a);
        } else {
            System.out.println("Both numbers are equal.");
        }

    }}