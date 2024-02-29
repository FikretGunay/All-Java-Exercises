package Lektion3;
// Palindromkontroll
//Kontrollera om en inmatad sträng är en palindrom.
public class förövning3 {
    public static void main(String[] args) {
        String input = "ana";
        if (isPal(input)) {
            System.out.println("Evet palindromdur.");
        } else {
            System.out.println("Hayir palindrom degildir.");
        }
    }
    public static boolean isPal (String str){
            int length = str.length();
            for (int i = 0; i < length / 2; i++) {
                if (str.charAt(i) != str.charAt(length - i - 1)) {
                    return false;
                } }
                    return true;
                }
            }


