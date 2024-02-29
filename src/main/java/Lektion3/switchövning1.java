package Lektion3;
//Veckodagar med Switch
//Skriv ett program som omvandlar ett nummer (1-7) till motsvarande
//dag i veckan med en switch-sats.
public class switchövning1 {
    public static void main(String[] args) {
        int a = 12;
        switch (a){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("It is not a valid number for a day. Please choose a number between 1-7.");
    }
}}
