package javaLab;
import java.util.Scanner;
// Write a JAVA program to sort for an element in a given list of elements using bubble sort

public class BubbleSort{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int size;
        int temp;
        
        System.out.print("Enter size of the list: ");
        size = scanner.nextInt();
        int[] nums = new int[size];

        for (int i = 0; i < size; i++){
            System.err.print("enter " + (i + 1) + " element: ");
            nums[i] = scanner.nextInt();
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (nums[j] > nums[j + 1] ){
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
            
        }

        System.err.println("The sorted list is: ");

        for (int num : nums) {
            System.err.println(num);
        }
        
        scanner.close();
    }
}
