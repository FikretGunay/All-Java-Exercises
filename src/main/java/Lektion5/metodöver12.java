package Lektion5;

// Överlagrad metodsamling: Skapa en klass med överlagrade
//metoder som kan utföra grundläggande matematiska
//operationer (addition, subtraktion, multiplikation, division) för
//både int och double datatyper. (Bunun cözumu toplami getirdigim gibi de olabilir.asagidakiler gibi de)
public class metodöver12 {
    public static void main(String[] args) {
        System.out.println("toplam: " + add(5,0));
        System.out.println("cikarma: " + substract(5,0));
        System.out.println("carpma: " + multiply(5,0));
        System.out.println("bölme: " + division(5,0));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int substract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int division(int a, int b) {
        if (b != 0) {
        return a / b;
        } else {
            System.out.println("not possible");
        return 0;
    }}

    public static double add(double a,double b){
            return a+b;

        }
}

