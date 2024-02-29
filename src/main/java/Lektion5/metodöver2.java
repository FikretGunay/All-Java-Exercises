package Lektion5;
//Enkel rekursion - Nedräkning: Skapa en metod som tar ett heltal
// som parameter och räknar ner till noll rekursivt.
public class metodöver2 {
    public static void  main(String [] args){

            countdown(6);

        }
        public static void countdown(int a){
            System.out.println(a);
            if (a > 0){
                countdown(a-1);

            }

        }
}
