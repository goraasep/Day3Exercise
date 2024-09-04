package org.example.Day3Exercise;

import java.util.Scanner;

public class Problem4 {
    public static void run() {
        System.out.println("4. Implement a simple calculator that can perform addition, \n" +
                "subtraction, multiplication, and division.");
        Scanner myObj = new Scanner(System.in);
        System.out.print("Input : ");
        String input = myObj.nextLine();
        try {

            if (input.contains("+")) {
                String[] arrInput = input.split("\\+");
                System.out.print("Output : " + (Integer.parseInt(arrInput[0]) + Integer.parseInt(arrInput[1])));
            } else if (input.contains("-")) {
                String[] arrInput = input.split("-");
                System.out.print("Output : " + (Integer.parseInt(arrInput[0]) - Integer.parseInt(arrInput[1])));
            } else if (input.contains("*")) {
                String[] arrInput = input.split("\\*");
                System.out.print("Output : " + (Integer.parseInt(arrInput[0]) * Integer.parseInt(arrInput[1])));
            } else if (input.contains("/")) {
                String[] arrInput = input.split("/");
                System.out.print("Output : " + (Integer.parseInt(arrInput[0]) / Integer.parseInt(arrInput[1])));
            } else {
                System.out.print("Operator not found.");
            }
        } catch (Exception e) {
            System.out.print("Input error.");
        }
    }
}
