Package javaLab;
import java.util.Scanner;

//Write a JAVA program to sort for an element in a given list of elements using merge sort. 
public class MergeSort {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size;
        
        System.out.print("Enter the number of elements: ");
        size = scanner.nextInt();
        int[] arr = new int[size];

        System.out.println("enter the list: ");
        for (int j = 0; j < size; j++) {
            System.out.print((j + 1) + " Element: ");
            arr[j] = scanner.nextInt();
        }

        

        scanner.close();
    }
}
