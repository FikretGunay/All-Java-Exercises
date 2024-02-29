package Lektion5;
//Returnera högsta värde med Varargs:
// Skapa en metod som tar ett obestämt antal heltal
// och returnerar det högsta av dem. (murata sor, int maxi neden öyle tanimladi)
public class metodöver14 {
    public static void main(String[] args) {

        System.out.println(highest(45,4, 5, 7, 8, 9));
    }

    public static int highest(int... a) {
        int max = a[0];
        for (int x: a){
            if (x>max){
                max= x;
            }
        }
            return max;

        }

    }
