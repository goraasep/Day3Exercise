package org.example.Day3Exercise;

import java.util.Scanner;

public class Problem6 {
    public static void run() {
        System.out.println("6. Create a program to generate the Fibonacci sequence up to n \n" +
                "terms.");
        Scanner myObj = new Scanner(System.in);
        System.out.print("Input : ");
        String inNumber = myObj.nextLine();
        StringBuilder fibonacciSeq = new StringBuilder();
        if (Utils.isInteger(inNumber)) {
            int num1 = 0;
            int num2 = 1;
            fibonacciSeq.append(num1);
            fibonacciSeq.append(" ");
            fibonacciSeq.append(num2);
            fibonacciSeq.append(" ");

            for (int i = 0; i < Integer.parseInt(inNumber) - 1; i++) {
                int num3 = num1 + num2;
                num1 = num2;
                num2 = num3;
                fibonacciSeq.append(num3);
                fibonacciSeq.append(" ");
            }
            System.out.print("Output : " + fibonacciSeq);
        }else{
            System.out.print("Input is not integer type.");
        }
    }
}
