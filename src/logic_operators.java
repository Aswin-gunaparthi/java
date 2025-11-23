import java.util.Scanner;

public class logic_operators {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //username must be four to 12 characters
        //username must not contain spaces

        String userName;

        System.out.print("enter your username: ");
        userName = sc.nextLine();

        if(userName.length() < 4 || userName.length() > 12){
            System.out.println("username must be between 4 - 12 characters");
        }
        else {
            System.out.println("welcome " + userName);
        }

        if (userName.contains(" ")){
            System.out.println("username must not contain any spaces");
        }

        sc.close();
    }
}
