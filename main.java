import java.util.Scanner;
public class main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double length = 0;
        double breath = 0;
        double area = 0;

        System.out.print("enter the length of the rectangle: ");
        length = scanner.nextDouble();

        System.out.print("enter breath: ");
        breath = scanner.nextDouble();

        area = length * breath;

        System.out.print("the area of the rectangle is: " + area + "cm²");

        scanner.close();

    }
}
