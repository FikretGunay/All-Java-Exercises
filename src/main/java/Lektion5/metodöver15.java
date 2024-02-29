package Lektion5;
//Rekursivt string-reverse: Skapa en rekursiv metod som vänder på en given sträng.
// (bunu da anlamadim)
public class metodöver15 {
    public static void main(String[] args) {
        String input = "Merhaba";
        String reversed = reverseString(input);
        System.out.println("Ters çevrilmiş string: " + reversed);
    }

    // Rekürsif string ters çevirme metodu
    public static String reverseString(String input) {
        if (input.isEmpty()) {
            return input;
        } else {
            return reverseString(input.substring(1)) + input.charAt(0);
        }
    }
}