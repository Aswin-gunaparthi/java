import java.util.Scanner;

public class banking_project {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double balance = 0;
        boolean isRunning = true;
        int choice;

        System.out.println("Banking Program");

        while (isRunning){
            System.out.println("\n1.show Balance");
            System.out.println("2.Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4.Exit");

            System.out.print("\n enter your Choice (1 - 4): ");
            choice = sc.nextInt();

            switch (choice){
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withDraw(balance);
                case 4 -> {
                    System.out.println("Exiting...");
                    isRunning = false;
                }
                default -> System.out.println("Invalid Choice");
            }
        }


        sc.close();
    }

    static void showBalance(double balance){
        System.out.println(balance);
    }
    static double deposit() {

        double amount;

        System.out.print("Enter the Amount to deposit: ");
        amount = scanner.nextDouble();

        if (amount < 0) {
            System.out.println("Amount cant be negative");
            return 0;
        } else {
            return amount;
        }
    }
    static double withDraw(double balance) {

        double amount;

        System.out.println("Enter the amount to withdraw: ");
        amount = scanner.nextDouble();

        if (amount > balance) {
            System.out.println("INSUFFICIENT FUNDS");
            return 0;
        } else if (amount < 0) {
            System.out.println("Amount cannot be negative");
            return 0;
        } else {
            return amount;
        }
    }
}
