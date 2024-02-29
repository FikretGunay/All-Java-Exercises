package Lektion5;
//Rekursiv maktberäkning: Skapa en rekursiv metod som
//beräknar basen upphöjd till en exponent. (Tam anlamadim.)
public class metodöver13 {
    public static void main(String[] args) {
        int taban = 5;
        int us = 3;
        int result = power(taban, us);

        System.out.println(result);
    }

    public static int power(int taban, int us) {
        if (us ==0){
            return 1;
        }else {
            return taban * power(taban,us-1);
        }
    }
}