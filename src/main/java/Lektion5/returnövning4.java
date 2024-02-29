package Lektion5;
//Decimalrundning: Skapa en metod som tar in ett decimaltal
// och returnerar det avrundat till närmaste heltal.
public class returnövning4 {
    public static void main (String [] args){

        System.out.println(round(2.5));
    }
    public static int round(double a) {
        double x = a - (int)a - 0.5;

        if(x >= 0)
        {
            return (int)a + 1;
        }
        else
            return (int)a;

    }
}
