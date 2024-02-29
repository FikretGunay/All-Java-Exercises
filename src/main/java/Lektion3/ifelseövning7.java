package Lektion3;
// Lösenordskontroll
//Skapa ett program där användaren ska skriva in ett lösenord och
//kontrollera om det matchar ett förbestämt lösenord.
import java.util.Scanner;

public class ifelseövning7 {
    public static void main(String[] args) {
        //String correctPassword= "zxc";
        //String password="ass";
        String correctPassword="qwe";
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a password.");
        String password= scanner.nextLine();
        if (password.equals(correctPassword)){
            System.out.println("Correct password:)");
        }else{
            System.out.println("Incorrect password:(");
        }
    }
}
