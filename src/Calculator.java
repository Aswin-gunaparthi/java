import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double value;
        double value2;
        double result = 0;
        char operation;
        boolean valid = true;

        System.out.print("enter any value: ");
        value = sc.nextDouble();

        System.out.print("Select an operation(+,_,*,/,%): " );
        operation = sc.next().charAt(0);

        System.out.print("enter the second value: ");
        value2 = sc.nextDouble();

        if (operation == '+'){
            result = value + value2;
        } else if (operation == '-') {
            result = value - value2;
        } else if (operation == '*') {
            result = value * value2;
        } else if (operation == '/') {
            if (value2 != 0){
                result = value / value2;
            }
            else {
                System.out.println("cannot divide by zero");
            }
        }
        else if (operation == '%'){
            result = value % value2;
        }
        else {
            System.out.println("invalid operation");
            valid = false;
        }

        if (valid != false){
            System.out.println(result);
        }

        sc.close();
    }
}
