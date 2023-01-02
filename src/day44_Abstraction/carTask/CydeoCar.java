package day44_Abstraction.carTask;

public class CydeoCar extends Car implements AutoPark,AutoPilot,Flyable{

    public CydeoCar(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println(getMake()+ " "+ getModel()+ " has great auto park");
    }

    @Override
    public void selfDrive() {
        System.out.println(getMake()+ " "+ getModel()+ " has self drive with command");
    }

    @Override
    public void start() {
        System.out.println(getMake()+ " "+ getModel()+ " is start with feel");
    }

    @Override
    public void drive() {
        System.out.println(getMake()+ " "+ getModel()+ " has feeling awesome drive");
    }

    @Override
    public void fly() {
        System.out.println(getMake()+ " "+ getModel()+ " can fly ");
    }
}
