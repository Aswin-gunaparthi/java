import java.util.Scanner;

public class weight_conversion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double weight;
        int choice;

        System.out.println("Weight conversion");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");
        System.out.println("choose an option: ");

        choice = sc.nextInt();

        if (choice == 1){
            System.out.println("enter thee weight in lbs: ");
            weight = sc.nextDouble();
            weight *= 0.43592;
            System.out.println("The new weight is: " + weight + "kgs");
        }
        else if (choice == 2){
            System.out.println("enter thee weight in kgs: ");
            weight = sc.nextDouble();
            weight *= 0.43592;
            System.out.println("The new weight is: " + weight + "lbs");
        }
        else {
            System.out.println("It is not a valid choice");
        }

        sc.close();
    }
}
