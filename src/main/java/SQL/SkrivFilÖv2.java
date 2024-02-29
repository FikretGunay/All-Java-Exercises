package SQL;
/* . Fortsätt med applikationen från den första övningen.
2. Lägg till funktionalitet för att skriva följande tre rader till
"practice.txt":
"Java är roligt!"
"Jag lär mig filhantering."
"Snart kan jag spara data lokalt."
3. Kontrollera filens innehåll manuellt för att säkerställa att texten
har lagts till korrekt.*/
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class SkrivFilÖv2 {
    public static void main(String[] args) {
        try{
            FileWriter writer= new FileWriter("practice.txt");
            BufferedWriter bufferedWriter=new BufferedWriter(writer);

            bufferedWriter.write("Java är roligt!");
            bufferedWriter.newLine();
            bufferedWriter.write("Jag lär mig filhantering");
            bufferedWriter.newLine();
            bufferedWriter.write("Snart kan jag spara data lokalt.");
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("Something went wrong.");
        }
    }
}
