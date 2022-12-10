package day35_Escapsulation.encapsulation;

public class Circle {

    private int radius;
    public static double pi;

    static {
        pi=3.14;
    }
    public Circle(int radius) {
        setRadius(radius);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        if (radius<=0){
            return;
        }
        this.radius = radius;
    }

    public double  calcArea(){
        return pi*radius*radius;
    }
    public double calcPerimeter(){
        return 2*pi*radius;
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "area=" + calcArea() +
                "perimeter=" + calcPerimeter() +
                '}';
    }
}
