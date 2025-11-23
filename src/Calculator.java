import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.out);

        double value;
        char operation;

        System.out.println("enter any value: ");
        value = sc.nextDouble();

        System.out.println("Select an operation(+,_,*,/,%)");
        operation = sc.next().charAt(0);



        sc.close();
    }
}
