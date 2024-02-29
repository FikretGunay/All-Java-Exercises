package SQL;
/* 1. Fortsätt med applikationen från den andra övningen.
2. Lägg till funktionalitet för att läsa innehållet i "practice.txt" och
skriv ut det på konsolen.
3. Kontrollera att utskriften på konsolen matchar det du skrev till
filen.
Övning 4: Hantera undantag
1. Fortsätt med applikationen från den tredje övningen.
2. Lägg till felhantering för att fånga eventuella IOExceptions som
kan uppstå under filoperationer.
3. Skriv ut ett användarvänligt felmeddelande när ett undantag
fångas.*/
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class LäsaFilÖv3 {
    public static void main(String[] args) {
        try{
            FileReader reader=new FileReader("practice.txt");
            BufferedReader bufferedReader= new BufferedReader(reader);
            String line;
            while ((line=bufferedReader.readLine())!=null){
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (IOException e){
            System.out.println("An error occured.");
            e.printStackTrace();
        }
    }
}
