package Lektion3;
//. Kollatz Konjektur
//För varje tal mellan 1 och N, följ sekvensen i Collatz-konjektur och
//skriv ut hur många steg det tar att nå 1. (anlamadim)
public class whileöv2 {
    public static void main(String[] args) {
        int N= 8;
        for(int i=1;i<=N;i++){
            System.out.println("Baslangic sayisi: "+i);
            int steps=findSteps(i);
            System.out.println("Adim sayisi: "+steps);
        }
    }
    public static int findSteps(int n){
        int steps=0;
        while(n!=1){
            if (n%2==0) {
                n = n / 2;
            }else{
                n=3*n+1;
            }
            steps++;
            }
        return steps;

        }
    }
