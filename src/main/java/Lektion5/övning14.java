package Lektion5;
//14. Namnformat: Skapa en metod som tar in förnamn och
//efternamn, och returnerar namnet i formatet "Efternamn,
//Förnamn".
public class övning14 {
    public static void main(String[] args) {

       // System.out.println(format( "sjd", "assdd"));
        System.out.println(format("Zeynep", "Gunay"));
    }

    public static String format( String namn, String efternamn) {
        //String format = efternamn + " "+ namn;
        return efternamn+" "+ namn;

    }
}

