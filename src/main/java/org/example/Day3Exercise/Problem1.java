package org.example.Day3Exercise;

import java.util.Scanner;

public class Problem1 {
    public static void run() {
        System.out.println("1. Write a program to calculate the sum of digits in a given \n" +
                "number.");
        Scanner myObj = new Scanner(System.in);
        System.out.print("Input : ");
        String inNumber = myObj.nextLine();
        if (Utils.isInteger(inNumber)) {
            int result = 0;
            for (int i = 0; i < inNumber.length(); i++) {
                result += (int) inNumber.charAt(i);
            }
            System.out.print("Output : " + result);
        } else {
            System.out.print("Input is not integer type.");
        }
    }
}
