package Lektion5;
//12. Metod i metod: Anropa en metod från en annan metod. //
//Skapa en metod A som anropar metod B . Metod B ska skriva ut "Kallad från metod A!".//
public class övning12 {
    public static void main (String [] args){
        metodA();
    }
    public static void metodA (){
            System.out.println("Metod A is taken from metod B.");
            metodB();

        }

    public static void metodB(){
        System.out.println("Called from metod A.");

    }
}

