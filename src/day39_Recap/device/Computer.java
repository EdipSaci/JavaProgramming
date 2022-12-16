package day39_Recap.device;

public class Computer extends Device{
    public Computer(String brand, String model, double price) {
        super(brand, model, price);
    }

    public void code(){
        System.out.println(getBrand()+ " "+ getModel() + " is good for coding");
    }
}
