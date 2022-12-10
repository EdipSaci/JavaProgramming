package day36_Inheritance.phone;

public class Phone {
    public String brand,model,size,color;
    public double price;

    public void setInfo(String model, String size, String color, double price) {
        brand=getClass().getSimpleName(); //this gets the class name automatically
        this.model = model;
        this.size = size;
        this.color = color;
        this.price = price;
    }

    public void call(long phoneNumber){
        System.out.println(brand+ " is calling "+ phoneNumber);
    }
    public void text(long phoneNumber){
        System.out.println(model+" is texting to "+phoneNumber);
    }

    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
