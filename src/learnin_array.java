import java.util.Arrays;

public class learnin_array {
    public static void main(String[] args) {

        String[] fruits = {"Apple", "Mango", "Banana"};

        //you cannot print whole array like in python
        int numOfArray = fruits.length;
        Arrays.sort(fruits); //sorting alphabetically
        Arrays.fill(fruits, "PineApple"); //full array same value

//        for (int i = 0; i < numOfArray; i++){
//            System.out.println(fruits[i]);
//        }

        //enhanced for loop
        for (String fruit : fruits){
            System.out.println(fruit);
        }

    }
}
