package Lektion5;

public class metodöver4 {
    public static void  main(String [] args){

        System.out.println(average(6,6,6,6,6,6,6,6,6,6));

    }
    public static double average(int... number){
        int sum= 0;
        for (int i = 0; i < number.length; i++){
            sum+=number[i];
        }
        return (double) sum / number.length;
        }
    }
