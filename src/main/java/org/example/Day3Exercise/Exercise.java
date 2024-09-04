package org.example.Day3Exercise;

public class Exercise {
    public static void run(Integer number) {
        switch (number) {
            case 1:
                Problem1.run();
                break;
            case 2:
                Problem2.run();
                break;
            case 3:
                Problem3.run();
                break;
            case 4:
                Problem4.run();
                break;
            case 5:
                Problem5.run();
                break;
            case 6:
                Problem6.run();
                break;
            case 7:
                Problem7.run();
                break;
            case 8:
                Problem8.run();
                break;
            case 9:
                Problem9.run();
                break;
            case 10:
                Problem10.run();
                break;
            default:
                System.out.println("Not available");
        }

    }
}
