package Lektion5;
//Beräkna längd: Skapa en metod som tar in en sträng och
//returnerar dess längd.
public class returnövning8 {
    public static void main(String[] args) {
        int length= uzunluk("adjasjfösddfsd");
        System.out.print(length);
    }
    public static int uzunluk(String a) {
        return a.length();

    }
}
