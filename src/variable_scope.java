public class variable_scope {

    static int x = 3;//class variables

    public static void main(String[] args) {

        int x = 1;//local variables

        System.out.println(x);
        doSomething();
    }

    static void doSomething(){
        int x = 2;

        System.out.println(x);
    }
}
