package Lektion5;
//13. Beräkningsmetod: Skapa en metod som tar in radien på en cirkel och returnerar cirkelns area.
// Använd formeln: area = π *r^2.
public class övning13 {
    public static void main(String[] args) {
        System.out.println(area(4));
    }

    public static double area(int radien) {

        double area=3.14 * radien * radien;
        return area;
    }
}
