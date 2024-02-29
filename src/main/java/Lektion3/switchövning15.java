package Lektion3;
// Hälsa på Språk
//Skapa en switch-sats som skriver ut "Hej" på olika språk beroende på
//vilket språk användaren väljer.
public class switchövning15 {
    public static void main(String[] args) {
        String dil= "Turkish".toLowerCase();
        switch (dil){
            case "turkish":
                System.out.println("Merhaba");
                break;
            case "swedish":
                System.out.println("Hej");
                break;
            case "english":
                System.out.println("Hello");
                break;
            default:
                System.out.println("Invalid language");

        }
    }
}
