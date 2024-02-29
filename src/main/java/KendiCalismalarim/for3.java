package KendiCalismalarim;
//1den 10a kadar olan tek sayilarin toplamini yazdir.
public class for3 {
    public static void main(String[] args) {
        int top=0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 1) {
                top+=i;
            }
        }
        System.out.println(top);
    }}
