package Lektion5;
// Överlagring med olika datatyper: Skapa tre överlagrade
//metoder med namnet displayValue . Den första tar en int , den andra en double ,
// och den tredje en String .
public class metodöver9 {
    public static void main(String[] args) {
        System.out.println(displayValue("hej Zeynep:)"));
        displayValue(56);
        displayValue(3.4);
    }

    public static void displayValue(int a){
        System.out.println(a);
    }
    public static void displayValue(double b){
        System.out.println(b);
    }
    public static String displayValue(String c){
        return c;
    }

}
