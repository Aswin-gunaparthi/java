import java.util.Locale;
import java.util.Scanner;

public class strig_methods {
    public static void main(String[] args) {

//        String name = "Password";
//
//        int length = name.length();
//        char letter = name.charAt(0);
//        int index = name.indexOf("i");
//        int lastIndex = name.lastIndexOf("i");
//
//        name = name.toUpperCase();
//        name = name.toLowerCase();
//        name = name.trim();
//        name = name.replace("i", "k");
//
//        if (name.isEmpty()){
//            System.out.println("your name is empty");
//        }
//        else {
//            System.out.println("hello " + name);
//        }
//
//        if (name.contains(" ")){
//            System.out.println("your name  contains spaces");
//        }
//
//        if (name.equalsIgnoreCase("password")){
//            System.out.println("your name can't be password");
//        }
//        else {
//            System.out.println("hello " + name);
//        }

        //substrings

        Scanner sc = new Scanner(System.in);

        String email;


        System.out.print("enter your email: ");
        email = sc.nextLine();

        if (!email.contains("@")){
            System.out.println("Enter a valid email");
        }

        String userName = email.substring(0,email.indexOf("@"));
        String domain = email.substring(email.indexOf("@") + 1);

        System.out.println(userName);
        System.out.println(email);
        System.out.println(domain);
    }
}
