import java.util.Random;

public class arithmetic_operators {
    public static void main(String[] args) {

        Random random = new Random();

        double x = 10;
        double y = 20;
        double result;

//        result = x + y;
//        result = x - y;
//        result = x * y;
//        result = x / y;

//        x += y;
//        x -= y;
//        x *= y;
//        x /= y;
        result = x % y;

        //x += 1;

        //order of operations [p-e-m-d-a-s]
        result = Math.pow(24,3);//two to the power of 3

        result = random.nextDouble(2,10);

        System.out.println(result);

        //%[flag][width][.precision][format-specifier]

        System.out.printf("%f\n",result);
        System.out.printf("%,.2f\n",result);

        int id1 = 1;
        int id2 = 21;
        int id3 = 532;
        int id4 = 1727;

        System.out.printf("%04d\n",id1);
        System.out.printf("%4d\n",id2);
        System.out.printf("%-4d\n",id3);
        System.out.printf("%04d\n",id4);


    }
}
