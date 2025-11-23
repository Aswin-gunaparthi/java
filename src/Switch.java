import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String day;
        System.out.print("Enter any day: ");
        day = sc.nextLine();

        switch (day.substring(0, 1).toUpperCase() + day.substring(1).toLowerCase()) {
            case "Monday","Tuesday","Wednesday","thursday","Friday" ->  System.out.println("It is a Weekday");
            case "Saturday","Sunday" -> System.out.println("it is a Weekend");
            default -> System.out.println(day + " is not a valid day");
        }

        sc.close();
    }
}
