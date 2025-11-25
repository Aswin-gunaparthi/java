import java.util.Arrays;
import java.util.Scanner;

public class learnin_array {
    public static void main(String[] args) {

//        //you cannot print whole array like in python
//        Arrays.sort(fruits); //sorting alphabetically
//        Arrays.fill(fruits, "PineApple"); //full array same value

//        //enhanced for loop
//        for (String fruit : fruits){
//            System.out.println(fruit);
//        }
        //array size is fixed you cannot add more

        Scanner scanner = new Scanner(System.in);
        int size;

        System.out.print("Enter the size of the array: ");
        size = scanner.nextInt();
        scanner.nextLine();

        String[] foods = new String[size];

        for (int i = 0; i < foods.length; i++){
            System.out.print("Enter a food: ");
            foods[i] = scanner.nextLine();
        }

        for (String food : foods){
            System.out.println(food);
        }

        System.out.print("which element do you want to search for: ");
        String target = scanner.nextLine();

        for (int i = 0; i < foods.length; i++){
            if (foods[i].equals(target)){
                System.out.println("Target is found at index: " + i);
                break;
            }
            else if (i == foods.length - 1) {
                System.out.println("Element is not in array");
            }
        }

        scanner.close();
    }
}
