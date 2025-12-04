package javaLab;

import java.util.ArrayList;
import java.util.Scanner;

// Five Bikers Compete in a race such that they drive at a constant speed which may or may not be
//the same as the other. To qualify the race, the speed of a racer must be more than the average speed
//of all 5 racers. Take as input the speed of each racer and print back the speed of qualifying racers

public class usingScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] bikers = new int[5];
        int averageSpeed = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the speed of biker " + (i + 1) + ": ");
            bikers[i] = scanner.nextInt();
            averageSpeed += bikers[i];
        }

        averageSpeed /= 5;

        System.out.println("\nAverage Speed = " + averageSpeed);
        System.out.println("Qualifying bikers (speed > average):");

        for (int i = 0; i < 5; i++) {
            if (bikers[i] > averageSpeed) {
                System.out.println("Biker " + (i + 1) + ": " + bikers[i]);
            }
        }

        scanner.close();
    }
}
