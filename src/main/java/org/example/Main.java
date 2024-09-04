package org.example;

import org.example.Day3Exercise.Exercise;
import org.example.Day3Exercise.Utils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("======= EXERCISE DAY 3 =======");
        System.out.println("1. Write a program to calculate the sum of digits in a given \n" +
                "number.");
        System.out.println("2. Create a function to check if a number is prime.");
        System.out.println("3. Write a program to find the largest element in an array.");
        System.out.println("4. Implement a simple calculator that can perform addition, \n" +
                "subtraction, multiplication, and division.");
        System.out.println("5. Write a function to reverse a string without using built-in reverse \n" +
                "functions.");
        System.out.println("6. Create a program to generate the Fibonacci sequence up to n \n" +
                "terms.");
        System.out.println("7. Write a function to count the number of vowels in a string.");
        System.out.println("8. Implement a program to sort an array of integers using bubble \n" +
                "sort. Pls Without built in methods :)");
        System.out.println("9. Create a function to check if two strings are anagrams.");
        System.out.println("10. Write a program to find the second smallest element in an array.");
        Scanner myObj = new Scanner(System.in);
        System.out.print("Choose Exercise: ");
        String arg = myObj.nextLine();
        if (Utils.isInteger(arg)) {
            Exercise.run(Integer.parseInt(arg));
        } else {
            System.out.println("Input is not integer type.");
        }
    }
}