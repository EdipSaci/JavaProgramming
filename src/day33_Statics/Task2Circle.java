package day33_Statics;

public class Task2Circle {
    public double radius,diameter;
    public static double pi = 3.14;

    public Task2Circle(double radius) {
        this.radius = radius;
    }

    public double calcArea(){
        return 2*pi*radius;
    }
    public double calcPerimeter(){
        return pi*radius*radius;
    }

    public static void printPi(){
        System.out.println(pi);
    }


    public String toString() {
        return "Task2Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", pi=" + pi +
                ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    }
}
