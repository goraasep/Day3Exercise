package org.example.Day3Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Problem9 {
    public static void run() {
        System.out.println("9. Create a function to check if two strings are anagrams.\nInput must be separated by comma (,).");
        Scanner myObj = new Scanner(System.in);
        System.out.print("Input : ");
        String input = myObj.nextLine();
        try {
            String[] inArrString = input.split(",");
            char[] charArray1 = inArrString[0].toCharArray();
            char[] charArray2 = inArrString[1].toCharArray();
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);
            System.out.print("Output : " + Arrays.equals(charArray1, charArray2));
        } catch (Exception e) {
            System.out.print("Input error.");
        }
    }
}
