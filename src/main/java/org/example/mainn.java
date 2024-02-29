package org.example;

import java.util.Scanner;

public class mainn {
    public static void main(String[] args) {

        int[] numbers = {8,8,8,8,8};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println(sum/numbers.length);

        }
    }

