package Lektion5;
//Returnera produkt: Skapa en metod som tar in två heltal och
//returnerar produkten av dem.
public class returnövning1 {
    public static void main (String [] args){

        System.out.println(num(23,34));
    }
    public static int num(int num1,int num2){
        int num = num1+ num2;
        return num; //return num1+num2
    }
}
