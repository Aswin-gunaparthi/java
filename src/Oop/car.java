public class car {

    private String make = "Ford";
    private String model = "Mustang";
    private int year = 2025;
    private double price = 80000;
    boolean isRunning = false;

    car( String model, int year, double price){
        this.model = model;
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

    @Override
    public String toString(){
        return this.model + this.make + this.year + this.price;
    }

    String getModel(){
        return this.model;
    }

    double getprice(){
        return this.price;
    }

    int getyear(){
        return this.year;
    }


}
