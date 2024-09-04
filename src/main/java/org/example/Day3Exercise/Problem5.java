package org.example.Day3Exercise;

import java.util.Scanner;

public class Problem5 {
    public static void run() {
        System.out.println("5. Write a function to reverse a string without using built-in reverse \n" +
                "functions.");
        Scanner myObj = new Scanner(System.in);
        System.out.print("Input : ");
        String input = myObj.nextLine();
        StringBuilder newWord = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            newWord.append(input.charAt(i));
        }
        System.out.print("Output : "+ newWord);
    }
}
