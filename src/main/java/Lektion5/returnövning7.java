package Lektion5;
//Maximalt av tre: Skapa en metod som tar in tre decimaltal och
//returnerar det största av dem.
public class returnövning7 {
    public static void main(String[] args) {

        max(23,34,56);
    }

    public static void max(int a, int b, int c) {

        if (a > b && a > c) {
            System.out.println(a + " is the biggest.");
            return;
        } else if (b > a && b > c) {
            System.out.println(b + " is the biggest.");
            return;
        }
        System.out.println(c + " is the biggest.");

    }
}