package Lektion5;
//Upprepa sträng med Varargs: Skapa en metod som tar en
//sträng och ett variabelt antal heltal. För varje heltal ska strängen
//upprepas motsvarande antal gånger.
public class metodöver11 {
    public static void  main(String [] args){
        repeatText("Zeynep", 9);
    }
    public static void repeatText(String x, int... a){
        for (int b: a){
            for(int i = 1; i <=b; i++){
                System.out.println(i+" " +x);
            }
        System.out.println();
        }
}
}
