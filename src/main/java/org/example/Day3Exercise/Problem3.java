package org.example.Day3Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem3 {
    public static void run() {
        System.out.println("3. Write a program to find the largest element in an array.\nInput must be separated by comma (,).");
        Scanner myObj = new Scanner(System.in);
        System.out.print("Input : ");
        String inArrNumber = myObj.nextLine();

        try {
            String[] arrString = inArrNumber.split(",");
            int max = Integer.parseInt(arrString[0]);
            for (String s : arrString) {
                int currentNumber = Integer.parseInt(s);
                if (max < currentNumber)
                    max = currentNumber;
            }
            System.out.print("Output : " + max);
        } catch (Exception e) {
            System.out.print("Input is not array of integer.");
        }
    }
}
