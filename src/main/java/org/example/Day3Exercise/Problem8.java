package org.example.Day3Exercise;

import java.util.Scanner;

public class Problem8 {
    public static void run() {
        System.out.println("8. Implement a program to sort an array of integers using bubble \n" +
                "sort. Pls Without built in methods :)\nInput must be separated by comma (,).");
        Scanner myObj = new Scanner(System.in);
        System.out.print("Input : ");
        String inArrNumber = myObj.nextLine();
        try {
            String[] arrString = inArrNumber.split(",");
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
            System.out.print("Output : ");
            for (Integer number : numbers) {
                System.out.print(number + ",");
            }
        } catch (Exception e) {
            System.out.print("Input is not array of integer.");
        }
    }
}
