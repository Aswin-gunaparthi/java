import java.util.Scanner;

public class shopping_item {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = 'r';
        double total;

        System.out.print("what item would you like to buy: ");
        item = sc.nextLine();

        System.out.print("what is the price for each: ");
        price = sc.nextDouble();

        System.out.print("how many would you like: ");
        quantity = sc.nextInt();

        total = price * quantity;

        System.out.println("you have bought " + quantity + " " + item + "/s");

        sc.close();
    }
}
