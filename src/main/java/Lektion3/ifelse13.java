package Lektion3;

import java.util.Scanner;

//Miniräknare
//Skapa en enkel miniräknare som utför en operation (+, -, *, /)beroende på
// vad användaren väljer.
public class ifelse13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Välj operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        System.out.println("Skriv det första talet: ");
        double num1 = scanner.nextDouble();

        System.out.println("Skriv det andra talet: ");
        double num2 = scanner.nextDouble();

        double result = 0;

        if (operation == '+') {
            result = num1 + num2;
        } else if (operation == '-') {
            result = num1 - num2;
        } else if (operation == '*') {
            result = num1 * num2;
        } else if (operation == '/') {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Kan inte dela med noll!");
                return;
            }
        } else {
            System.out.println("Ogiltig operation!");
            return;
        }

        System.out.println("Resultatet är: " + result);
        scanner.close();
    }
}
