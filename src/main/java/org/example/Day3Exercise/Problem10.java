package org.example.Day3Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Problem10 {
    public static void run() {
        System.out.println("10. Write a program to find the second smallest element in an array.\nInput must be separated by comma (,).");
        Scanner myObj = new Scanner(System.in);
        System.out.print("Input : ");
        String input = myObj.nextLine();
        try {
            String[] arrString = input.split(",");
            int[] numbers = new int[arrString.length];
            for (int i = 0; i < arrString.length; i++) {
                numbers[i] = Integer.parseInt(arrString[i]);
            }
            for (int i = 0; i < numbers.length - 1; i++) {
                boolean swapped = false;
                for (int j = 0; j < numbers.length - i - 1; j++) {
                    if (numbers[j] > numbers[j + 1]) {
                        int temp = numbers[j];
                        numbers[j] = numbers[j + 1];
                        numbers[j + 1] = temp;
                        swapped = true;
                    }
                }
                if (!swapped)
                    break;
            }
            System.out.print("Output : "+numbers[1]);
        } catch (Exception e) {
            System.out.print("Input error.");
        }
    }
}
