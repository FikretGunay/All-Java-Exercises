package Lektion5;
// Metodöverlagring - Area: Skapa tre metoder med namnet
//calculateArea . Den första ska räkna arean för en cirkel med en
//given radie, den andra för en rektangel med given längd och
//bredd, och den tredje för en triangel med given bas och höjd.
public class metodöver1 {
    public static void main (String [] args){

        System.out.println(calculateArea(5,6));
    }
    public static double calculateArea(double radien){
        double calculateArea=3.14 * radien * radien;
        return calculateArea;
    }
    public static double calculateArea(float leng, double bredd){
        return leng * bredd;
    }
    public static double calculateArea (double bas, double höjd) {
        return(bas * höjd) / 2;
    }
}

