package day44_Abstraction.carTask;

public class Tesla extends Car implements AutoPark,AutoPilot{

    public Tesla(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println(getMake()+ " "+ getModel()+ " has auto park automatically");
    }

    @Override
    public void selfDrive() {
        System.out.println(getMake()+ " "+ getModel()+ " has self drive with sound");
    }

    @Override
    public void start() {
        System.out.println(getMake()+ " "+ getModel()+" starts with sound");
    }

    @Override
    public void drive() {
        System.out.println(getMake()+ " "+ getModel()+" drive cool");
    }
}
