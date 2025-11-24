import java.util.Scanner;

public class matric {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("creating a matrix");

        int row;
        int column;
        char symbol;

        System.out.print("Enter the Number of rows: ");
        row = sc.nextInt();

        System.out.print("Enter the number of columns: ");
        column = sc.nextInt();

        System.out.println("Enter the symbol you want to use: ");
        symbol = sc.next().charAt(0);

        for (int i = 0; i < row; i++){
            for (int j = 0; j < column ; j++){
                System.out.print(symbol);
            }
            System.out.println();
        }


        sc.close();
    }
}
