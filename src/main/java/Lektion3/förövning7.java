package Lektion3;
//Mönsterskapande
//Använd loopar för att skapa olika mönster av stjärnor (*) eller andra tecken.
public class förövning7 {
    public static void main(String[] args) {
    pattern1();
    pattern2();


}
public static void pattern1(){
    for(int i=1; i<=5;i++){
        for(int j=1; j<=i;j++){
            System.out.print("* ");
        }
        System.out.println();
    }
}
public static void pattern2(){
        for(int i=5; i>=1;i--){
            for(int j=1; j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }}