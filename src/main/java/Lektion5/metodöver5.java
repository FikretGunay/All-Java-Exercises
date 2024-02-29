package Lektion5;
//Överlagrad metod med Varargs: Skapa överlagrade metoder
//som skriver ut en lista av element. Den ena metoden ska hantera
//en lista av heltal och den andra en lista av strängar.
public class metodöver5 {
    public static void main(String[] args) {
    printList(2,3,43,5,6,66,7,8);
    printList("sdf","asa","GJHGFGF");
    }

    public static void printList(int... numbers) {
        for (int number : numbers){
            System.out.print(number + " ");
        }
    }
    public static void printList (String... text){
        for (String a : text){
            System.out.print(a + " ");
        }
    }
}


