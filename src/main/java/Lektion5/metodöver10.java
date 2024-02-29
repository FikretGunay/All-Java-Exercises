package Lektion5;
//Rekursiv summa: Skapa en rekursiv metod som summerar alla heltal upp till ett givet heltal n .
public class metodöver10 {
    public static void  main(String [] args){
        int a = 4;
        int total = sum(a);
        System.out.println("Total is "+ total);


    }
    public static int sum(int a){
        System.out.println(a);
        if (a ==1) {
            return 1;
        } else{
            return a + sum(a-1);
}}}
