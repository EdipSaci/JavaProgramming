package day44_Abstraction.carTask;

public class Toyota extends Car{

    public Toyota(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println(getMake()+ " "+ getModel()+ " is start with key");
    }

    @Override
    public void drive() {
        System.out.println(getMake()+ " "+ getModel()+ " family drive");
    }
}
