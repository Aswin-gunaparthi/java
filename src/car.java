public class car {

    String make = "Ford";
    String model = "Mustang";
    int year = 2025;
    double price = 80000;
    boolean isRunning = false;

    car(String make, String model, int year, double price){
        this.model = model;
        this.make = make;
        this.year = year;
        this.price = price;
    }

    void start(){
        System.out.println("You start the engine");
        isRunning = true;
    }
    void stop(){
        System.out.println("you stop the engine");
        isRunning = false;
    }

    void driving(){
        System.out.println("You are driving :" + model);
    }




}
