import java.util.Scanner;

public class nested_if {
    public static void main(String[] args) {

        boolean isStudent;
        boolean isSenior;
        double price = 9.99;

        Scanner sc = new Scanner(System.in);

        System.out.print("Are you a student(true/false): ");
        isStudent = sc.nextBoolean();

        System.out.print("Are you a Senior(true/false): ");
        isSenior = sc.nextBoolean();


        if (isStudent){
            if (isSenior){
                System.out.println("you get a student discount of 10%");
                System.out.println("you get a student discount of 20%");
                price *= 0.7;
            }
            else {
                System.out.println("you get a student discount of 10%");
                price *= 0.9;
            }
        }
        else {
            if (isSenior) {
                System.out.println("you get a senior discount of 20%");
                price *= 0.8;
            }
        }

        System.out.println("the price of the ticket is: " + price);
    }
}
