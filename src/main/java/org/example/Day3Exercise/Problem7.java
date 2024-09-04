package org.example.Day3Exercise;

import java.util.Scanner;

public class Problem7 {
    public static void run() {
        System.out.println("7. Write a function to count the number of vowels in a string.");
        Scanner myObj = new Scanner(System.in);
        System.out.print("Input : ");
        String input = myObj.nextLine();
        input = input.toLowerCase();
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u') {
                count++;
            }
        }
        System.out.print("Output : "+count);
    }
}
