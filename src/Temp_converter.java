import java.util.Scanner;

//just practicing ternary operator

public class Temp_converter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double temp;
        String unit;

        System.out.print("enter the temperature: ");
        temp = sc.nextDouble();

        System.out.print("convert to celsius or fahrenheit? (c or f): ");
        unit = sc.next().toUpperCase();

        temp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 5 / 9) + 32;

        System.out.println("The temperature is " + temp + unit);


        sc.close();
    }
}
