package day44_Abstraction.carTask;

public class Audi extends Car implements AutoPark{

    public Audi(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println(getMake()+ " "+ getModel()+ " has auto park feature");
    }

    @Override
    public void start() {
        System.out.println(getMake()+ " "+ getModel()+ " start with button");
    }

    @Override
    public void drive() {
        System.out.println(getMake()+ " "+ getModel()+" has sport drive");
    }
}
