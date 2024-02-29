package Lektion5;
//Metod med flera returer: Skapa en metod som tar in ett heltal och returnerar "positivt",
// "negativt" eller "noll" beroende på
//talets värde.
public class returnövning6 {
    public static void main(String[] args) {

        posNeg(56);
    }

    public static void posNeg(int a) {

        if (a < 0) {
            System.out.println("Negative");
            return;
        }
        System.out.println("Positive");
        }

    }