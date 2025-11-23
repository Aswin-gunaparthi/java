import java.util.Scanner;

public class conditional_statements {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int age;
        String name;
        Boolean isStudent;

        System.out.print("enter your name: ");
        name = sc.nextLine();

        if (name.isEmpty()) {
            System.out.println("your name is empty");
        }
        else {
            System.out.print("hello " + name + "\n");
        }

        System.out.print("enter your age: ");
        age = sc.nextInt();

        System.out.print("are you a student(true/false): ");
        isStudent = sc.hasNext();

        if (isStudent){
            System.out.println("you are a student");
        }
        else {
            System.out.println("you are not a student");
        }

        if (age >= 18){
            System.out.println("you are an adult");
        }
        else if(age < 0) {
            System.out.println("you havent been born yet");
        }
        else {
            System.out.println("you are still a child");
        }

        sc.close();

    }
}
