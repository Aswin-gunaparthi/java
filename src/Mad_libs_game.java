import java.util.Scanner;

public class Mad_libs_game {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String adjective1;
        String adjective2;
        String adjective3;
        String noun;
        String verb;

        System.out.print("enter an adjective:");
        adjective1 = sc.next();
        System.out.print("enter an adjective:");
        adjective2 = sc.next();
        System.out.print("enter an adjective:");
        adjective3 = sc.next();
        System.out.print("enter an noun:");
        noun = sc.next();
        System.out.print("enter an verb:");
        verb = sc.next();

        System.out.println("I am at the " + adjective1);
        System.out.println("there is a " + adjective2 + adjective1 + "!");
        System.out.println("i am " + verb + "!");
        System.out.println("the " + adjective1 + "is " + verb);

        sc.close();

    }
}
