package Lektion5;
//Bokstavskontroll: Skapa en metod som tar in en bokstav och
//returnerar true om det är en vokal, annars false .

public class returnövning5 {
    public static void main(String[] args) {

        System.out.println(isVokal("l"));
    }

    public static boolean isVokal(String letter) {
        String vokal = "a,e,u,i,o,å,ä,ö,y";

        if (vokal.contains(vokal)) {
            return true;
        } else {
            return false;
        }
    }
}