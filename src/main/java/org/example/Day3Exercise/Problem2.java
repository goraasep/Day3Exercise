package org.example.Day3Exercise;

import java.util.Scanner;

public class Problem2 {
    public static void run() {
        System.out.println("2. Create a function to check if a number is prime.");
        Scanner myObj = new Scanner(System.in);
        System.out.print("Input : ");
        String inNumber = myObj.nextLine();
        if (Utils.isInteger(inNumber)) {
            int number = Integer.parseInt(inNumber);
            System.out.print("Output : " + isPrime(number));
        } else {
            System.out.print("Input is not integer type.");
        }
    }

    static boolean isPrime(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }

}
