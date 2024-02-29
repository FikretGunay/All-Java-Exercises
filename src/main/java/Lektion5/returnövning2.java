package Lektion5;
// Returnera en text: Skapa en metod som
// tar in en sträng och ett heltal.
// Metoden ska returnera strängen upprepad det angivna antalet gånger.
public class returnövning2 {
    public static void main (String [] args){

        repeat("Hej, olduu:) Aferin kiz sana Zeynep:)))",300);
    }
    public static String repeat(String text, int a){
        // String result= ""; hocanin cozumu farkli

        for (int i = 1; i <= a; i++) {
            System.out.println(i+" "+ text);
        }
        return (text);

}
}
