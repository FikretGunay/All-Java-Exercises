package SQL;
/* . Skapa en ny Java-applikation.
2. Skriv kod som skapar en ny fil med namnet "practice.txt".
3. Kontrollera om filen redan existerar innan du skapar den och
skriv ut ett lämpligt meddelande.*/
import java.io.File;
import java.io.IOException;
public class SkapaFil {
    public static void main(String[] args) {
        try{
            File file = new File("practice.txt");
            if (file.exists()){
                System.out.println("File already exists.");
            } else{
                file.createNewFile();
            }
        } catch (IOException e){
            System.out.println("Something went wrong!");
        }
    }
}
