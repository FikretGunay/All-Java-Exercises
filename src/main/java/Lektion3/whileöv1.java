package Lektion3;
// Ränta på Sparkonto
//Beräkna hur många år det tar för ett visst belopp att nå en önskad
//summa med en fast årlig ränta, använd en while -loop.
public class whileöv1 {
    public static void main(String[] args) {
        double amount= 500;
        double önska=10000;
        double rate=0.20;
        int year=0;
        while (amount<önska){
            amount+=amount*rate;
            year++;
        }
        System.out.println(year);
    }
}
