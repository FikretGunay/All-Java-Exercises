package Lektion5;
//Returnera delsträng: Skapa en metod som tar in en sträng och
//två heltal, start och end . Metoden ska returnera en delsträng
//som börjar vid start och slutar vid end .
public class returnövning9 {
    public static void main(String[] args) {
        String inputString = "Detta är en teststräng";
        int start = 5;
        int end = 12;
        String sub = getSubstring(inputString, start, end);
        System.out.println("Delsträngen är: " + sub);
    }

    // Metod för att returnera en delsträng av en given sträng
    public static String getSubstring(String str, int start, int end) {
        return str.substring(start, end);
    }
}

