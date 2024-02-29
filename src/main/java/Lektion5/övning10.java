package Lektion5;

import jdk.swing.interop.SwingInterOpUtils;

import java.sql.SQLOutput;

public class övning10 {
    public static void main (String [] args){

        System.out.println(oddeven(12));

    }
    public static boolean oddeven(int number){
        if (number%2 == 0){
            return true;
        }else{
            return false;
        }

    }

}
