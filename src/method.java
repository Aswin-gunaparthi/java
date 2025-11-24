import java.util.Scanner;

public class method {
    public static void main(String[] args) {

        //method is a block of reusable code just like triggers in dbms
        //these are fucking confusing

        String name = "spongebob";
        int age = 25;

        happyBirthday(name, age);
        double result =  square(3);
        double value = cube(5);
        System.out.println(result);

    }

    static void happyBirthday(String name, int age) {
        System.out.println("happy birthday " + name);
        System.out.printf("you are %d years old\n",age);
    }

    static double square(double num){
        return  num * num;
    }

    static double cube(double num) {return  num * num * num;}
}





