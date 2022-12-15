package day38_Inheritance.shapeTask;

public class Circle extends Shape{

    public double r ;
    public static double pi=3.14;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double area() {
        return 3.14*r*r;
    }

    @Override
    public double perimeter() {
        return 2*3.14*r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "name='" + name + '\'' +
                "area='" + area() + '\'' +
                "perimeter='" + perimeter() + '\'' +
                '}';
    }
}
