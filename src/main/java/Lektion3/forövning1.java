package Lektion3;

import java.util.Scanner;

//. Summa av Serie
//Beräkna summan av serien 1 + 1/2 + 1/3 + ... + 1/N där
// N matas in av användaren.
public class forövning1 {

    public static void main(String[] args) {

    Scanner scanner= new Scanner(System.in);
    System.out.println("Enter a number");
    double num1= scanner.nextDouble();
    for (int i = 1; i <= num1; i++){
        System.out.println(i+(1.0/i));
    }
    scanner.close();

    }

}
