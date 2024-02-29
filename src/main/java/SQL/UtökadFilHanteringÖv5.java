package SQL;
/*1. Skapa en ny Java-applikation.
2. Skriv en funktion som tar en filväg som argument och returnerar
antalet rader i den filen.
3. Testa funktionen med "practice.txt" och andra textfiler du har
tillgängliga.
*/
import javax.xml.transform.Source;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
public class UtökadFilHanteringÖv5 {
    public static void main(String[] args) {
        System.out.println(get_lines("practice.txt"));
    }
    public static int get_lines (String path){
        int lines= 0;
        try{
            FileReader fileReader =new FileReader(path);
            BufferedReader bufferedReader=new BufferedReader(fileReader);

            while (bufferedReader.readLine()!=null){
                lines++;
            }

        } catch ( Exception e){
            System.out.println("Something went wrong.");
        }
        return lines;
    }
}
