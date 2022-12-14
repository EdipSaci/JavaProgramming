package day38_Inheritance.carTask;

public class Car {

    public String brand,model,color;
    public int year,miles;
    public double price;

    public Car(String brand, String model, String color, int year, int miles, double price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.miles = miles;
        this.price = price;
    }

    public void start(){
        System.out.println(brand + " "+ model+ " is starting");
    }
    public void drive(){
        System.out.println(brand+" "+ model+ " is driving");
    }

   /*
    public void fly(){
        fly() is not common for all the cars, and parent class should only contain the common feature of all the sub classes
    }
   */
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", miles=" + miles +
                '}';
    }
}
/*
carTask:
		Create a class called Car
			instance variables:
				brand, model, year, price, color, miles

				add a constructor to set all the fields

			instance methods:
				start(), drive(),toString()
 */