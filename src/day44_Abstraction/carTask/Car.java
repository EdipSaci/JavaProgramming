package day44_Abstraction.carTask;

public abstract class Car {

    private final String make, model;
    private final int year;
    private double price;
    private String color ;

    public Car(String make, String model, int year, double price, String color) {
        if (make.equals(null) || make.isEmpty()){
            throw new RuntimeException("Invalid");
        }
        this.make = make;
        if (model.equals(null) || model.isEmpty()){
            throw new RuntimeException("Invalid");
        }
        this.model = model;

        if (year<1886){
            throw new RuntimeException("Invalid");
        }
        this.year = year;
        setPrice(price);
        setColor(color);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }


    public void setPrice(double price) {
        if (price<0){
            throw new RuntimeException("Invalid price");
        }
        this.price = price;
    }

    public void setColor(String color) {
        if (color.isEmpty() || color.equals(null)){
            throw new RuntimeException("Invalid color");
        }
        this.color = color;
    }

    public abstract void start();
    public abstract void drive();

    public void stop(){
        System.out.println(getMake()+ " "+getModel()+ "is stop with break");
    }

    @Override
    public String toString() {
        return  getClass().getSimpleName()+"{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
