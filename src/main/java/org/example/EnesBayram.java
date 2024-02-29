package org.example;

public class EnesBayram {
    public static void main(String[] args){
        int x = 7;
        printNumbers(2,3,4,5,6,7,8);
        printNumbers(x);
    }
    public static void printNumbers(int... numbers){
        for (int x : numbers){
            System.out.println( x+" ");
        }
    }
}
