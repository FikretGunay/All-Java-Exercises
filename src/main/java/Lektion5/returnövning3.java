package Lektion5;
//Retur i mitten: Skapa en metod som tar in ett heltal.
// Om talet är negativt, skriv ut "Negativt tal" och avsluta metoden.
// Annars, skriv ut "Positivt tal".
public class returnövning3 {
    public static void main (String [] args){

        num(-90);
    }
    public static void num(int num1) {
        if (num1 < 0) {
            System.out.println("Negativ");
            return;
        } else {
            System.out.println("Positiv");
        }
    } }
