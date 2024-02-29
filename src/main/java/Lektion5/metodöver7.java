package Lektion5;
//Returnera null: Skapa en metod som tar in en lista av strängar
//och en söksträng. Om söksträngen finns i listan, returnera
//strängen, annars returnera null . Dogru calismiyor, hep listenin ilk elemanini veriyor.
public class metodöver7 {
    public static void main(String[] args) {
        String result= list("asd","errt","qeter","töpltr");
        if (result != null){
            System.out.println("found: " + result);
        }else{
            System.out.println("not found");
        }
    }
    public static String list(String... text){
        for (String a : text){
            if (a.equals("a"));
            return a;
        }

    return null;
}}
