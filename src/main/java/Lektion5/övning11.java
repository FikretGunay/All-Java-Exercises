package Lektion5;
//Minst av tre: Skapa en metod som tar in tre heltal och
//returnerar det minsta av dem.

public class övning11 {
    public static void main (String [] args){

        minsta(34,875,97);
    }
    public static void minsta(int num1, int num2, int num3){
        //int minsta = Math.min(a,Math.min(b,c)); bu da diger yol
        //return min;
        if (num1 < num2 && num1 < num3){
            System.out.println( num1 + ": minsta");
        }else if (num2 < num3 && num2 < num1){
            System.out.println(num2 + ": minsta");
        } else {
            System.out.println(num3 + " minsta");

    }
}
}
