package javaLab;

//Write a JAVA program to search for an element in a given list of elements using binary search mechanism.
import java.util.Arrays;
import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size;
        int j;

        System.out.print("Enter the size of arr: ");
        size = scanner.nextInt();
        int[] arr = new int[size];

        System.out.println("enter the array: ");
        for (j = 0; j < size; j++) {
            System.out.print((j + 1) + " Element: ");
            arr[j] = scanner.nextInt();
        }
        Arrays.sort(arr);

        System.out.print("Enter the element to search for: ");
        int target = scanner.nextInt();

        BinarySearch( arr,  target);


        scanner.close();
    }

    public static int BinarySearch(int arr[], int target){

        int left = arr[0];
        int right = arr.length - 1;
        int mid = left + (right - left)/2;

        while (left <= right){
            if (arr[mid] == target){
                return mid;
            }

            if (target < arr[mid]){
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
    return -1;
    }

}
