package javaLab;

import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int i;

        System.out.println("Enter the size of list: ");
        i = scanner.nextInt();

        int[] list = new int[i];

        for (int j = 0; j < i; j++){
            System.out.println((i + 1) + " Element: " );
            list[i] = scanner.nextInt();
        }
        System.out.println("enter the list: ");


        scanner.close();
    }
}
