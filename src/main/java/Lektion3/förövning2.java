package Lektion3;
//Beräkna Potenser
//För varje heltal x från 1 till N, skriv ut x^2 och x^3 .
public class förövning2 {
    public static void main(String[] args) {
        int n = 4;

        for (int i = 1; i <= n; i++) {
           int cube =i*i;
           int kvadrat=i*i*i;
            System.out.println(i+"nin karesi: "+ cube+"kupu: "+kvadrat);
        }

    }
}